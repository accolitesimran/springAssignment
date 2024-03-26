package project.myProject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.*;


public class App {
  public static void main(String[] args) {
    System.out.println("The details of the employees are-:");
    ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
    Employee obj=(Employee) context.getBean("info");
    obj.printMap();
    
  }
}
