package com.clearlove.filter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;

/**
 * @author promise
 * @date 2024/2/27 - 21:14
 */
public class GenericEncodingFilter implements Filter {

  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
      FilterChain filterChain) throws IOException, ServletException {
    HttpServletResponse response = (HttpServletResponse) servletResponse;
    response.setContentType("text/html;charset=UTF-8");

    HttpServletRequest request = (HttpServletRequest) servletRequest;
    HttpServletRequest myRequest = new MyRequest(request);
    filterChain.doFilter(myRequest, response);

  }

  @Override
  public void destroy() {

  }


  class MyRequest extends HttpServletRequestWrapper {
    private HttpServletRequest request;

    private boolean hasEncode;

    public MyRequest(HttpServletRequest request) {
      super(request);
      this.request = request;
    }


    @Override
    public Map getParameterMap() {
      String method = request.getMethod();
      if (method.equalsIgnoreCase("post")) {
        try {
          request.setCharacterEncoding("UTF-8");
          return request.getParameterMap();
        } catch (UnsupportedEncodingException e) {
          e.printStackTrace();
        }
      } else if (method.equalsIgnoreCase("get")) {
        Map<String, String[]> parameterMap = request.getParameterMap();
        if (!hasEncode) {
          for (String parameterName : parameterMap.keySet()) {
            String[] values = parameterMap.get(parameterName);
            if (values != null) {
              for (int i = 0; i < values.length; i++) {
                try {
                  values[i] = new String(values[i].getBytes("ISO-8859-1"), "utf-8");
                }catch (UnsupportedEncodingException e) {
                  e.printStackTrace();
                }
              }
            }
          }
          hasEncode = true;
        }
        return parameterMap;
      }
      return super.getParameterMap();
    }


    @Override
    public String getParameter(String name) {
      Map<String, String[]> parameterMap = getParameterMap();
      String[] values = parameterMap.get(name);
      if (values == null) {
        return null;
      }
      return values[0];
    }


    @Override
    public String[] getParameterValues(String name) {
      Map<String, String[]> parameterMap = getParameterMap();
      String[] values = parameterMap.get(name);
      return values;
    }
  }
}
