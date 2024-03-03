package com.clearlove.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author promise
 * @date 2024/3/3 - 21:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private String name;

  private int age;

  private String sex;

}
