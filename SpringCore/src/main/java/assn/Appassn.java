package assn;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.dbs.demos.SpringCore.entity.Product;

@ComponentScan
@Configuration
public class Appassn {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(Appassn.class);
		Singer singer =  context.getBean(Singer.class);
		singer.display();
	
	}
}
