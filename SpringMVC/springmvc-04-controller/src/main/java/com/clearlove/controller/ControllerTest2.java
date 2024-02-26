package com.clearlove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author promise
 * @date 2024/2/26 - 22:25
 * @Controller 这个注解代表这个类会被Spring接管
 * 被这个注解标注的类，所有方法，如果返回值是String，并且有具体页面可以跳转，那么就会被视图解析器解析
 */
@Controller
public class ControllerTest2 {

  @RequestMapping("/t2")
  public String test1(Model model) {
    model.addAttribute("msg", "ControllerTest2");
    return "test";
  }



  @RequestMapping("/t3")
  public String test3(Model model) {
    model.addAttribute("msg", "test3");
    return "test";
  }

}
