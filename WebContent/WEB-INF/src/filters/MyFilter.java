package filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter (
filterName = "myFilter",
urlPatterns = {"/*"},
asyncSupported = true
)
public class MyFilter implements Filter{

	FilterConfig config;
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1,
			FilterChain arg2) throws IOException, ServletException {
		// TODO Auto-generated method stub
		
		ServletContext application = config.getServletContext();
		HttpServletRequest hRequest = (HttpServletRequest)arg0;
		
		System.out.println("To myFilter");
		System.out.println(hRequest.getServletPath());
		System.out.println(hRequest.getRequestURI());
		System.out.println(hRequest.getRemoteAddr());

		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		config = arg0;
		
	}

}
