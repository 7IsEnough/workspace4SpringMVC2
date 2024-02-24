package com.clearlove.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author promise
 * @date 2024/2/24 - 20:09
 */
public class AnotherController implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse) throws Exception {
    ModelAndView mv = new ModelAndView();

    // 业务代码
    String result = "HelloSpringMVC";

    mv.addObject("msg", result);

    // 视图跳转
    mv.setViewName("test");




    return mv;
  }
}
