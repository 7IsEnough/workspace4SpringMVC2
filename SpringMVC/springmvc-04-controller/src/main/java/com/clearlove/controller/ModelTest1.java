package com.clearlove.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author promise
 * @date 2024/2/26 - 23:37
 */
@Controller
public class ModelTest1 {

  @RequestMapping("/m1/t1")
  public String test1(HttpServletRequest request, HttpServletResponse response, Model model) {

    HttpSession session = request.getSession();
    System.out.println(session.getId());
    // 转发
    model.addAttribute("msg", "ModelTest1");
//    return "forward:/WEB-INF/jsp/test.jsp";
    // 重定向
    return "redirect:/index.jsp";
  }

}
