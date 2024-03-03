package com.clearlove.dao;

import com.clearlove.pojo.Books;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * @author promise
 * @date 2024/2/28 - 23:54
 */
public interface BookMapper {

  // 增加一本书
  int addBook(Books books);
  // 删除一本书
  int deleteBookById(@Param("bookId") int id);
  // 更新一本书
  int updateBook(Books books);
  // 查询一本书
  Books queryBookById(@Param("bookId") int id);
  // 查询全部的书
  List<Books> queryAllBook();

  Books queryBookByName(@Param("bookName") String bookName);

}
