package SpringAssignment.Assignment4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;



@Configuration
@EnableAspectJAutoProxy
public class AppConfig {
	@Bean(name="triangle1")
	public Triangle myTriangle() {
		Triangle triangle=new Triangle();
		triangle.setSide1(1);
		triangle.setSide2(2);
		triangle.setSide3(3);
		return triangle;
	}
	@Bean(name="aspectLog")
	public AspectLog myAspect() {
		return new AspectLog();
	}
}

