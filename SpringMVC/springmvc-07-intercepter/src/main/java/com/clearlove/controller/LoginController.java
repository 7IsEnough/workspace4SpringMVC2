package com.clearlove.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author promise
 * @date 2024/3/3 - 23:55
 */
@Controller
@RequestMapping("/user")
public class LoginController {

  @RequestMapping("/main")
  public String main() {
    return "main";
  }


  @RequestMapping("/goLogin")
  public String goLogin() {
    return "login";
  }

  @RequestMapping("/login")
  public String login(HttpSession session, String username,String password, Model model) {
    // 把用户的信息存入session中
    session.setAttribute("userLoginInfo", username);
    model.addAttribute("username", username);
    return "main";
  }


  @RequestMapping("/logout")
  public String logout(HttpSession session, Model model) {
    // 把用户的信息从session中删除
    session.removeAttribute("userLoginInfo");
    return "login";
  }
}
