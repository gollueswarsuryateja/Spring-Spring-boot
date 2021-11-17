package demospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	Person p=new Person(); {
		//	p.setPersonId(101);
			//p.setPersonname("Eswar Surya Teja");
		//	p.displayDetails();
		//}
		
		//without creating object #loose coupling  
		ApplicationContext ac= new ClassPathXmlApplicationContext("myconfig.xml");
		Person p=(Person) ac.getBean("p");
		p.setPersonId(199);
		p.setPersonname("GEST");
		p.displayDetails();
	    
		

	}

}
