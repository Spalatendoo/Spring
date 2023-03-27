import com.lk.pojo.Student;
import com.lk.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) context.getBean("student");

        System.out.println(student.toString());
        /*
        * Student{
        * name='lk',
        * address=Address{address='null'},
        * books=[红楼梦, 三国演义, 水浒传],
        * hobbys=[听歌, 看电影, 打游戏],
        * card={身份证=1111223, 银行卡=33332221},
        * games=[LOL, Zelda],
        * wife='null',
        * info={学号=2206210824, 性别=男}}
        * */
    }

    @Test
    public void test2(){
        ApplicationContext context = new ClassPathXmlApplicationContext("userbeans.xml");
        User user = context.getBean("user2", User.class);
        User user2 = context.getBean("user2", User.class);
        System.out.println(user);

        System.out.println(user == user2);
    }
}
