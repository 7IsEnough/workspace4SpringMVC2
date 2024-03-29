package com.clearlove.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author promise
 * @date 2024/2/22 - 21:53
 */
public class HelloServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    // 获取前端参数
    String method = req.getParameter("method");
    if ("add".equals(method)) {
      req.getSession().setAttribute("msg", "执行了add方法");
    }
    if ("delete".equals(method)) {
      req.getSession().setAttribute("msg", "执行了delete方法");
    }
    // 调用业务层

    // 视图转发或重定向
    req.getRequestDispatcher("/WEB-INF/jsp/test.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    doGet(req, resp);
  }
}
