package com.injured.web.api.filter;

import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.stereotype.Component;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@Component
@ServletComponentScan
@WebFilter(urlPatterns = "/*", filterName = "myfilter")
public class HttpServletRequestReplacedFilter implements Filter{

	    @Override  
	    public void destroy() {  
	        // TODO Auto-generated method stub  
	    }  
	  
	    @Override  
	    public void doFilter(ServletRequest request, ServletResponse response,  
	            FilterChain chain) throws IOException, ServletException {  
	        ServletRequest requestWrapper = null;  
	        if(request instanceof HttpServletRequest) {  
	           requestWrapper = new RequestWrapper((HttpServletRequest) request);  
	        }
	        if(requestWrapper == null) {  
	            chain.doFilter(request, response);  
	        } else {  
	            chain.doFilter(requestWrapper, response);  
	        }     
	    }   
	      
	  
	    @Override  
	    public void init(FilterConfig arg0) throws ServletException {  
	        // TODO Auto-generated method stub  
	          
	    }  
}
