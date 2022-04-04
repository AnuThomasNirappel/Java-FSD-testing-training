package com.ust1.spring.springcore.Ic.annotations;

import java.awt.Paint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsTest {

	public static void main(String[] args) {

		AbstractApplicationContext ac = new ClassPathXmlApplicationContext(
				"com/ust1/spring/springcore/lc/annotations/annotationsconfig.xml");
		Paint p = (Paint) ac.getBean("patient");
		System.out.println(p);
		ac.registerShutdownHook();
	}
}


