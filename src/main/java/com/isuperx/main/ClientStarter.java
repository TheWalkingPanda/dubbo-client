package com.isuperx.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.isuperx.dubbo.service.interfaces.IHelloService;

public class ClientStarter {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
		IHelloService sv = (IHelloService) context.getBean("helloService");
		sv.hello();
		System.out.println(22);
	}
}
