package com.clearlove.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author promise
 * @date 2024/2/28 - 23:51
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

  private Integer bookID;
  private String bookName;
  private Integer bookCounts;
  private String detail;

}
