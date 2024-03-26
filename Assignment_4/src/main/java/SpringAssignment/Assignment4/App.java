package SpringAssignment.Assignment4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
        Triangle obj2=(Triangle) ctx.getBean("triangle1");
        System.out.println(obj2);
        obj2.getPerimeter();
    }
}
