import com.zxc.config.zxcConfig;
import com.zxc.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class myTest {
    @Test
    public void Test1(){
        ApplicationContext context = new AnnotationConfigApplicationContext(zxcConfig.class);
        User getUser = context.getBean("getUser", User.class);
        System.out.println(getUser);
    }
}
