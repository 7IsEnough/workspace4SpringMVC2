package com.clearlove.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

/**
 * @author promise
 * @date 2024/2/26 - 22:17
 * 只要实现了Controller接口的类，说明这就是一个控制器了
 */
public class ControllerTest1 implements Controller {

  @Override
  public ModelAndView handleRequest(HttpServletRequest httpServletRequest,
      HttpServletResponse httpServletResponse) throws Exception {

    ModelAndView mv = new ModelAndView();

    mv.addObject("msg", "ControllerTest1");
    mv.setViewName("test");

    return mv;
  }
}
