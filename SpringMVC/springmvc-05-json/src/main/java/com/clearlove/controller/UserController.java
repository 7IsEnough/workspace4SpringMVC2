package com.clearlove.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.clearlove.pojo.User;
import com.clearlove.utils.JsonUtils;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author promise
 * @date 2024/2/27 - 22:40
 * @RestController 标注的类，下面的所有方法，都只返回字符串
 */
@RestController
public class UserController {

  // @ResponseBody这个注解标注了，就不会走视图解析器，会直接返回一个字符串
//  @ResponseBody
  @RequestMapping(value = "/j1")
  public String json1() throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();

    // 创建一个对象
    User user = new User("男", "科比1", 3);

    return mapper.writeValueAsString(user);
  }


  @RequestMapping(value = "/j2")
  public String json2() throws JsonProcessingException {

    ObjectMapper mapper = new ObjectMapper();

    List<User> userList = new ArrayList<>();

    // 创建一个对象
    User user1 = new User("男", "科比1", 3);
    User user2 = new User("男", "科比2", 3);
    User user3 = new User("男", "科比3", 3);
    User user4 = new User("男", "科比4", 3);

    userList.add(user1);
    userList.add(user2);
    userList.add(user3);
    userList.add(user4);

//    return mapper.writeValueAsString(userList);
    return JsonUtils.getJson(userList);
  }


  @RequestMapping(value = "/j3")
  public String json3() throws JsonProcessingException {

//    ObjectMapper mapper = new ObjectMapper();
//    // 时间解析后的默认格式是时间戳
//
//    Date date = new Date();
//    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
////    sdf.format(date);
//    mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
//    mapper.setDateFormat(sdf);

    return JsonUtils.getJson(new Date());
  }


  @RequestMapping(value = "/j4")
  public String json4() throws JsonProcessingException {
    List<User> userList = new ArrayList<>();
    User user1 = new User("男", "科比1", 3);
    User user2 = new User("男", "科比2", 3);
    User user3 = new User("男", "科比3", 3);
    User user4 = new User("男", "科比4", 3);

    userList.add(user1);
    userList.add(user2);
    userList.add(user3);
    userList.add(user4);

    System.out.println("******Java对象转JS0N字符串******");
    String str1 = JSON.toJSONString(userList);
    System.out.println("JSON.toJSONString(list)==>" + str1);
    String str2 = JSON.toJSONString(user1);
    System.out.println("JSON.toJSONString(user1)==>" + str2);
    System.out.println("\n****JS0N字符串转Java对象****");
    User jp_user1 = JSON.parseObject(str2, User.class);
    System.out.println("JSON.parseobject(str2,User.class)==>" + jp_user1);
    System.out.println("\n***JaVa对象转JS0N对象*****");
    JSONObject jsonobject1 = (JSONObject) JSON.toJSON(user2);
    System.out.println("(JSONObject)JSON.toJSON(user2)==>" + jsonobject1.getString("name"));
    System.out.println("\n*****JS0N对象转JaVa对象*****");
    User to_java_user = JSON.toJavaObject(jsonobject1, User.class);
    System.out.println("JSON.toJavaobject(jsonobject1,User.class)==>" + to_java_user);

    return "Hello";
  }

}
