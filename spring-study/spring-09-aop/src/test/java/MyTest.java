import com.lk.service.UserService;
import com.lk.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContex.xml");
        //动态代理代理的式接口 注意点， 用UserServiceImpl实现类就不可以
        UserService userservice = context.getBean("userservice", UserService.class);

        userservice.add();
    }
}
