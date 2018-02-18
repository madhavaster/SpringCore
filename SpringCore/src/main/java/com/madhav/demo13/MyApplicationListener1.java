package com.madhav.demo13;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
@Component
public class MyApplicationListener1 implements ApplicationListener<ContextRefreshedEvent>{
	@Override
	public void onApplicationEvent(ContextRefreshedEvent event) {
		System.out.println("MyApplicationListener1 is listening ContextRefreshedEvent");
	} 
}