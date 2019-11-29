package com.injured.web.api.filter;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.servlet.ReadListener;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

import org.apache.commons.io.IOUtils;

public class RequestWrapper extends HttpServletRequestWrapper {

	
	 private final byte[] body; // 报文  

	  public RequestWrapper(HttpServletRequest request) throws IOException {  
	      super(request);  
	      body = IOUtils.toByteArray(request.getInputStream());
	  }  
	    
	  @Override  
	  public BufferedReader getReader() throws IOException {  
	      return new BufferedReader(new InputStreamReader(getInputStream()));  
	  }  
	    
	  @Override  
	  public ServletInputStream getInputStream() throws IOException {  
	      final ByteArrayInputStream bais = new ByteArrayInputStream(body);  
	      return new ServletInputStream() {

			  @Override
			  public boolean isFinished() {
				  return false;
			  }

			  @Override
			  public boolean isReady() {
				  return false;
			  }

			  @Override
			  public void setReadListener(ReadListener readListener) {

			  }

			  @Override
	          public int read() throws IOException {  
	              return bais.read();  
	          }  
	      };  
	  }  

	
	
/*	//存放JSON数据主体  
    private final String body;  
      
    public RequestWrapper(HttpServletRequest request) throws IOException {  
        super(request);  
        StringBuilder stringBuilder = new StringBuilder();  
        BufferedReader bufferedReader = null;  
        try {  
            InputStream inputStream = request.getInputStream();  
            if (inputStream != null) {  
                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));  
                char[] charBuffer = new char[128];  
                int bytesRead = -1;  
                while ((bytesRead = bufferedReader.read(charBuffer)) > 0) {  
                    stringBuilder.append(charBuffer, 0, bytesRead);  
                }  
            } else {  
                stringBuilder.append("");  
            }  
        } catch (IOException ex) {  
            throw ex;  
        } finally {  
            if (bufferedReader != null) {  
                try {  
                    bufferedReader.close();  
                } catch (IOException ex) {  
                    throw ex;  
                }  
            }  
        }  
         body = stringBuilder.toString();  
    }  
    @Override  
    public ServletInputStream getInputStream() throws IOException {  
        final ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(body.getBytes("UTF-8"));  
        ServletInputStream servletInputStream = new ServletInputStream() {  
            @Override  
            public int read() throws IOException {  
                return byteArrayInputStream.read();  
            }  
        };  
        return servletInputStream;  
    }  
      
    @Override  
    public BufferedReader getReader() throws IOException {  
        return new BufferedReader(new InputStreamReader(this.getInputStream()));  
    }  
      
    public String getBody() {  
        return this.body;  
    }  */
	
}
