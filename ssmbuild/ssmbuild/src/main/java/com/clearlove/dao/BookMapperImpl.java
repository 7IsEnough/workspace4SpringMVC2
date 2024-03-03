package com.clearlove.dao;

import com.clearlove.pojo.Books;
import java.util.List;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * @author promise
 * @date 2024/2/29 - 23:17
 */
public class BookMapperImpl extends SqlSessionDaoSupport implements BookMapper {

  SqlSessionTemplate sqlSessionTemplate;


  @Override
  public int addBook(Books books) {
    return 0;
  }

  @Override
  public int deleteBookById(int id) {
    return 0;
  }

  @Override
  public int updateBook(Books books) {
    return 0;
  }

  @Override
  public Books queryBookById(int id) {
    return null;
  }

  @Override
  public List<Books> queryAllBook() {
    return null;
  }

  @Override
  public Books queryBookByName(String bookName) {
    return null;
  }
}
