package com.madhav.demo13;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
@Component
public class MyApplicationListener1 implements ApplicationListener{
	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		System.out.println("MyApplicationListener1>>>"+event);
	} 
}