package maven_ssm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"maven_ssm"})
public class TestConfig {
	public TestConfig() {
		System.out.println("初始化");
	}
	@Bean
	public MyBean1 getObject() {
		return new MyBean1();
	}
	public static void main(String[] args) {
		// 1. 构造注入配置主类
		/*ApplicationContext atx = new AnnotationConfigApplicationContext(TestConfig.class);
		atx.getBean(MyBean1.class).showMessage();
		atx.getBean(MyBean2.class).showMessage();*/
		

	}
	
}
