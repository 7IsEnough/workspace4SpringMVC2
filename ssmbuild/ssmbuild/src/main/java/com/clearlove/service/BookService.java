package com.clearlove.service;

import com.clearlove.pojo.Books;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author promise
 * @date 2024/2/28 - 23:54
 */
public interface BookService {

  // 增加一本书
  int addBook(Books books);
  // 删除一本书
  int deleteBookById(int id);
  // 更新一本书
  int updateBook(Books books);
  // 查询一本书
  Books queryBookById(int id);
  // 查询全部的书
  List<Books> queryAllBook();

  Books queryBookByName(String bookName);

}
