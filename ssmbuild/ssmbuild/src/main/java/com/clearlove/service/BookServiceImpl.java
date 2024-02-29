package com.clearlove.service;

import com.clearlove.dao.BookMapper;
import com.clearlove.pojo.Books;
import java.util.List;
import org.springframework.stereotype.Service;

/**
 * @author promise
 * @date 2024/2/29 - 0:09
 */
//@Service
public class BookServiceImpl implements BookService{

  // service调用dao
  private BookMapper mapper;

  public void setMapper(BookMapper mapper) {
    this.mapper = mapper;
  }

  @Override
  public int addBook(Books books) {
    return mapper.addBook(books);
  }

  @Override
  public int deleteBookById(int id) {
    return mapper.deleteBookById(id);
  }

  @Override
  public int updateBook(Books books) {
    return mapper.updateBook(books);
  }

  @Override
  public Books queryBookById(int id) {
    return mapper.queryBookById(id);
  }

  @Override
  public List<Books> queryAllBook() {
    return mapper.queryAllBook();
  }
}
