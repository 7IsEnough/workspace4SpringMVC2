package com.clearlove.controller;

import com.clearlove.pojo.Books;
import com.clearlove.service.BookService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author promise
 * @date 2024/3/2 - 16:36
 */
@Controller
@RequestMapping("/book")
public class BookController {

  // controller 调 service 层
  @Autowired
  @Qualifier("bookServiceImpl")
  private BookService bookService;


  // 查询所有的书籍，并返回到一个书籍展示页面
  @RequestMapping("/allBook")
  public String list(Model model) {
    List<Books> books = bookService.queryAllBook();
    model.addAttribute("list", books);
    return "allBook";
  }



  // 跳转到增加书籍界面
  @RequestMapping("/toAddBook")
  public String toAddPage() {
    return "addBook";
  }

  // 添加书籍的请求
  @RequestMapping("/addBook")
  public String addBook(Books books) {
    System.out.println("addBook=>" + books);
    bookService.addBook(books);
    return "redirect:/book/allBook";
  }

  // 跳转到修改界面
  @RequestMapping("/toUpdateBook")
  public String toUpdateBook(int id, Model model) {
    Books books = bookService.queryBookById(id);
    model.addAttribute("QBooks", books);
    return "updateBook";
  }

  // 修改书籍的请求
  @RequestMapping("/updateBook")
  public String updateBook(Books books) {
    System.out.println("updateBook=>" + books);
    bookService.updateBook(books);
    return "redirect:/book/allBook";
  }


  // 删除书籍的请求
  @RequestMapping("/deleteBook/{bookId}")
  public String deleteBook(@PathVariable("bookId") int id, Model model) {
    bookService.deleteBookById(id);
    return "redirect:/book/allBook";
  }

  // 查询书籍
  @RequestMapping("/queryBook")
  public String queryBook(String queryBookName, Model model) {
    Books book = bookService.queryBookByName(queryBookName);
    List<Books> books = new ArrayList<>();
    if (book == null) {
      books = bookService.queryAllBook();
      model.addAttribute("error", "未查到");
    } else {
      books.add(book);
    }
    model.addAttribute("list", books);
    return "allBook";
  }

}
