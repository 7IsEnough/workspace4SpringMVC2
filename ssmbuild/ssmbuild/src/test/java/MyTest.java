import com.clearlove.pojo.Books;
import com.clearlove.service.BookServiceImpl;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author promise
 * @date 2024/3/2 - 16:48
 */
public class MyTest {

  @Test
  public void test1() {
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    BookServiceImpl bookServiceImpl = context.getBean("bookServiceImpl", BookServiceImpl.class);
    for (Books books : bookServiceImpl.queryAllBook()) {
        System.out.println(books);
    }
  }

}
