import com.zxc.Service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //动态代理的是接口，所以返回的需要是接口而不是一个实现类
        //UserServiceImpl userService = context.getBean("userService", UserServiceImpl.class);
        UserService userService = context.getBean("userService", UserService.class);
        userService.delete();
    }
}
