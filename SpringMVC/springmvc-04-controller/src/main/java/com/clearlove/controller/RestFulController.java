package com.clearlove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author promise
 * @date 2024/2/26 - 22:55
 */
@Controller
public class RestFulController {

  // 原来的请求方式 http://localhost:8080/springmvc_04_controller/add?a=1&b=2
  // Restful: http://localhost:8080/springmvc_04_controller/add/a/b

// 安全
//  @RequestMapping(value = "/add/{a}/{b}", method = RequestMethod.GET)
  @GetMapping("/add/{a}/{b}")
  public String test1(@PathVariable int a, @PathVariable int b, Model model) {
    int res = a + b;
    model.addAttribute("msg", "结果1为：" + res);
    return "test";
  }


  @PostMapping("/add/{a}/{b}")
  public String test2(@PathVariable int a, @PathVariable int b, Model model) {
    int res = a + b;
    model.addAttribute("msg", "结果2为：" + res);
    return "test";
  }

}
