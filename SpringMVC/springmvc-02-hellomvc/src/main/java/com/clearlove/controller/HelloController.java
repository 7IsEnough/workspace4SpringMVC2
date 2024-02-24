package com.clearlove.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author promise
 * @date 2024/2/24 - 17:34
 */
public class HelloController implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse) throws Exception {
    // 模型和视图
    ModelAndView mv = new ModelAndView();


    // 调用业务层

    // 封装对象，放在ModelAndView中
    mv.addObject("msg", "HelloSpringMVC!");
    // 封装要跳转的视图，放在ModelAndView中
    // WEB-INF/jsp/hello.jsp
    mv.setViewName("hello");
    return mv;
  }
}
