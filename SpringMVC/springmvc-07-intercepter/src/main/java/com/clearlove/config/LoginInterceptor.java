package com.clearlove.config;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @author promise
 * @date 2024/3/4 - 0:05
 */
public class LoginInterceptor implements HandlerInterceptor {

  @Override
  public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
      throws Exception {
    HttpSession session = request.getSession();

    // 放行登录界面
    if (request.getRequestURI().toLowerCase().contains("login")) {
      return true;
    }


    // 放行：判断什么情况下登录
    if (session.getAttribute("userLoginInfo") != null) {
      return true;
    }

    // 当前状态没有登录
    request.getRequestDispatcher("/WEB-INF/jsp/login.jsp").forward(request, response);


    return false;
  }
}
