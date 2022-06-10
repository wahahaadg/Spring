import com.zxc.config.configTest;
import com.zxc.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloTest {
    public static void main(String[] args) {
        //获取spring的上下文对象
        //ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(configTest.class);
        //对象已经在spring中管理 不需要new 只需要在beans中取对象
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello);
        String s1 = "Java";
// 直接返回字符串常量池中字符串对象”Java“对应的引用
        String s2 = s1.intern();
        System.out.println(s2);
// 会在堆中在单独创建一个字符串对象
        boolean s = s1.equals(s2);
        String s3 = new String("Java");
        System.out.println(s3);
    }
}
