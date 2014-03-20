package de.saxsys.edu.jsf.encoding;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("*.jsf")
public class UTF8Filter implements Filter {

	
	@Override
	public void init(FilterConfig config) throws ServletException {
		// not needed
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		// setting UTF-8 as default filter
		if (request.getCharacterEncoding() == null) {
			request.setCharacterEncoding("UTF-8");
		}

		if (response.getCharacterEncoding() == null) {
			response.setCharacterEncoding("UTF-8");
		}
		
		// do the filtering
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// not needed
	}

}
