package com.in28minutes.learnspringframework.examples.e1;

import java.util.Arrays;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
class NormalClass{
	
}

//prototype ใช้สำหรับการสร้าง multiple objects
@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
class PrototypeClass{
	
}

@Configuration
@ComponentScan
//ComponentScan สามารถค้นหา component ใน package ที่เราระบุไว้ ถ้าไม่ระบุจะใช้ package ปัจจุบัน
public class BeanScopesLauncherApplication {
	public static void main(String[] args) {
		try (var context = new AnnotationConfigApplicationContext(BeanScopesLauncherApplication.class)) {
			System.out.println(context.getBean(NormalClass.class));
			System.out.println(context.getBean(NormalClass.class));
			
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			System.out.println(context.getBean(PrototypeClass.class));
			
			
//			var n1 = new NormalClass();
//			var p1 = new PrototypeClass();
//			var p2 = new PrototypeClass();
//			var p3 = new PrototypeClass();
//			System.out.println(n1);
//			System.out.println(n1);
//			
//			System.out.println(p1);
//			System.out.println(p2);
//			System.out.println(p3);
		}
	}

}
