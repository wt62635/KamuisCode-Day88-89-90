package cn.tedu.spring;

import java.util.Arrays;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
	
	@Test
	public void test() {
		ClassPathXmlApplicationContext ac
			= new ClassPathXmlApplicationContext(
				"spring.xml");
		
		SampleBean sampleBean
			= ac.getBean("sampleBean", SampleBean.class);
		
		System.out.println(sampleBean.names.getClass().getName());
		System.out.println(sampleBean.names);
		System.out.println();
		System.out.println(sampleBean.cities.getClass().getName());
		System.out.println(sampleBean.cities);
		System.out.println();
		System.out.println(sampleBean.session.getClass().getName());
		System.out.println(sampleBean.session);
		System.out.println();
		System.out.println(sampleBean.numbers.getClass().getName());
		System.out.println(Arrays.toString(sampleBean.numbers));
		System.out.println();
		System.out.println(sampleBean.config.getClass().getName());
		System.out.println(sampleBean.config);
		
		ac.close();
	}

}
