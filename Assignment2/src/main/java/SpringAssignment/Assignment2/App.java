package SpringAssignment.Assignment2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App 
{
    public static void main( String[] args )
    {
    	System.out.println("The details of the canvas are as follows-: ");
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        Drawing obj=(Drawing)context.getBean("drawing");
        System.out.println(obj);
    }
}
