package com.madhav.demo14;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
@Aspect
public class LoggingAspect {
	@Before("execution(public * *(..))")
	public void log() {
		System.out.println("log()");
	}
}