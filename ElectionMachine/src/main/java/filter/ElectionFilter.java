package filter;

import java.io.IOException;
import java.util.Hashtable;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter(dispatcherTypes = {
				DispatcherType.REQUEST, 
				DispatcherType.FORWARD, 
				DispatcherType.INCLUDE, 
				DispatcherType.ERROR
		}
		, urlPatterns = {"/hello"})//Which URI's come through this filter
public class ElectionFilter implements Filter {
	/*
	 * Attribute valiUsers, where the credentials of the valid users are added.
	 * This is used in this example, but a better way were to use database
	 */
    Hashtable<String, String> validUsers = new Hashtable<>();
    
    public ElectionFilter() {
    }

	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		doFilter((HttpServletRequest)request, (HttpServletResponse)response, chain);
	}
	public void doFilter(HttpServletRequest request, HttpServletResponse response, FilterChain chain) throws IOException, ServletException {
		/*
		 * Getting the Authorization string from the request header.
		 * It looks like: Basic aGtqaGtqaGtqOg==
		 * Starting with Basic and the crypted part is crypted version of 
		 * pattern someuser:somepassword
		 */
		String user = request.getParameter("user");
		String pass = request.getParameter("pass");
		
		HttpSession session=request.getSession(true);
		String ok = (String) session.getAttribute("ok");
		if (ok == null && (user==null || pass==null)) {
			response.sendRedirect("/kirjaudu.html");
			return;
		}
			
		
		System.out.println(user+pass);

        // Check if the user is allowed?
        if (!allowUser(user, pass)) {
        	response.sendRedirect("/kirjaudu.html");
			return;
        } else {
        	session.setAttribute("ok","ok");
            // The client is allowed to forward the request to the URI "/sercretservlet"
    		chain.doFilter(request, response);
        	//response.sendRedirect("/hello");
			//return;
        }
	}
	public void init(FilterConfig fConfig) throws ServletException {
	}

	/*
	 * Adding some users to the HashTable validUsers
	 * This could be done in the init method
	 * And... the users might be got from a database
	 */
	public void getUser() {
        // this user does not have any password
        validUsers.put("nopass:","authorized");
        //The user poxltii has a password as well as pena
        validUsers.put("poxltii:poxpass","authorized");
        validUsers.put("pena:kukkuu","authorized");
	}

    protected boolean allowUser(String user, String pass) throws IOException {
        getUser();//calling the getUser method
        //In the first place the auth parameter is null
        if (user == null || user == null) {
            return false;  
        }
              
        // Check our user list to see if that user and password are "allowed"
        /*
         * Here we get value from the HashTable validUsers by key userpassDecoded,
         * which is of form 'username:password'. If the value got is 'authorized'
         * the client will be authorized. 
         */
        System.out.println(user+pass);
        if ("authorized".equals(validUsers.get(user+":"+pass))) {
            return true;
        } else {
            return false;
        }
    }
}