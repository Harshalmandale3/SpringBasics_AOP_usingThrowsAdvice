package main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource rs = new ClassPathResource("applicationContext.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		
		Validator v = factory.getBean("proxy", Validator.class);
		
		try{
			v.validate(18);
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		try {
			v.validate(13);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
