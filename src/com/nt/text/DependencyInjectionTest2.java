package com.nt.text;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

import com.nt.beans.Person;
import com.nt.beans.Person1;

public class DependencyInjectionTest2 {
public static void main(String[] args) {
DefaultListableBeanFactory factory=new DefaultListableBeanFactory();	
 XmlBeanDefinitionReader reader=new XmlBeanDefinitionReader(factory);
 reader.loadBeanDefinitions("com/nt/cfgs/applicationContext.xml");
 Person person=(Person)factory.getBean("per");
	System.out.println(person);
	System.out.println("=========================");
	Person1 person1=(Person1)factory.getBean("per1");
	System.out.println(person1);
	Class c=Person.class;
	Class c1=Person1.class;
	System.out.println("C obj class name::"+c.getClass()+"c obj data::"+c.toString());
	System.out.println("c1 obj class name ::"+c1.getClass()+"c1 obj dte::"+c1.toString());
}
}
