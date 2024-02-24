package com.clearlove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author promise
 * @date 2024/2/24 - 22:47
 */
@Controller
//@RequestMapping("/HelloController")
public class HelloController {

  // localhost:8080/springmvc-03-annotation/hello/h1
  @RequestMapping("/hello")
  public String hello(Model model) {
    // 封装数据
    model.addAttribute("msg", "HelloSpringMVCAnnotation");
    // return 的值会被视图解析器处理
    return "hello";
  }

}
