package com.clearlove.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author promise
 * @date 2024/2/27 - 0:06
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  private int id;
  private String name;
  private int age;

}
