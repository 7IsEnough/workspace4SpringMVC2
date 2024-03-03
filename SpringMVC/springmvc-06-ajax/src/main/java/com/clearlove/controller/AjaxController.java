package com.clearlove.controller;

import com.clearlove.pojo.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author promise
 * @date 2024/3/3 - 17:29
 */
@RestController
public class AjaxController {


  @RequestMapping("/t1")
  public String test() {
    return "hello";
  }


  @RequestMapping("/a1")
  public void a1(String name, HttpServletResponse response) throws IOException {
    if ("kobe".equals(name)) {
      response.getWriter().println("true");
    } else {
      response.getWriter().println("false");
    }
  }


  @RequestMapping("/a2")
  public List<User> a2() {
    List<User> userList = new ArrayList<>();
    // 添加数据
    userList.add(new User("狂神说Java", 1, "男"));
    userList.add(new User("狂神说前端", 1, "女"));
    userList.add(new User("狂神说运维", 1, "男"));
    return userList;
  }

  @RequestMapping("/a3")
  public String a3(String name, String pwd) {
    String msg = "";
    if (name != null) {
      // admin这些数据应该在数据库中查
      if ("admin".equals(name)) {
        msg = "ok";
      } else {
        msg = "用户名有误";
      }

    }
    if (pwd != null) {
      // admin这些数据应该在数据库中查
      if ("123456".equals(pwd)) {
        msg = "ok";
      } else {
        msg = "密码有误";
      }

    }
    return msg;
  }
}
