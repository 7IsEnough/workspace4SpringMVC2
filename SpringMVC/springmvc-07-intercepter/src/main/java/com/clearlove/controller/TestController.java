package com.clearlove.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author promise
 * @date 2024/3/3 - 23:25
 */
@RestController
public class TestController {

  @GetMapping("/t1")
  public String test() {
    System.out.println("TestController ==> test1执行了");
    return "OK";
  }

}
