import com.lk.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //用户实际调用的是业务层，dao层不需要接触
/*        UserServiceImpl userService = new UserServiceImpl();

        userService.setUserDao(new UserDaoMysqlmpl());
        userService.getUser();*/


        //获取ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");


        //需要什么 就get什么
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("UserServiceImpl");


        userServiceImpl.getUser();
    }
}
