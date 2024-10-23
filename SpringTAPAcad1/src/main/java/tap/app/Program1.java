package tap.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.GoldCustomer;

public class Program1 {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		// AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext("../");

		GoldCustomer myCustomer = (GoldCustomer) context.getBean("goldCustomer");

		System.out.println(myCustomer.getCustomerDetails());
		System.out.println(myCustomer);

		GoldCustomer myCustomerOne = (GoldCustomer) context.getBean("goldCustomer");
		GoldCustomer myCustomerTwo = (GoldCustomer) context.getBean("goldCustomer");

		System.out.println(myCustomerOne == myCustomerTwo);
	}
}
