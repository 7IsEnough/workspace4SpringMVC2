package com.clearlove.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author promise
 * @date 2024/2/26 - 22:34
 */
@Controller
@RequestMapping("/c3")
public class ControllerTest3 {

  @RequestMapping("/t1")
  public String test1(Model model) {

    model.addAttribute("msg", "ControllerTest3");
    return "test";
  }

}
