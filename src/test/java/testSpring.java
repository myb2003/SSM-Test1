import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testSpring {

    @Test
    public void test1(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-Mybatis.xml");
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String str : beanDefinitionNames){
            System.out.println(str);
        }
    }
}
