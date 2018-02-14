package com.madhav.demo12;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;

@Component
public class Triangle implements Shape{
	@Autowired
	private Point p;
	@Autowired
	private MessageSource messageSource;
	public MessageSource getMessageSource() {
		return messageSource;
	}
	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}
	public Point getP() {
		return p;
	}
	public void setP(Point p) {
		this.p = p;
	}
	@Override
	public void draw() {
		System.out.println(messageSource.getMessage("draw", new Object[]{p.getX(),p.getY()}, "default one", null));
		System.out.println(p.getX()+"...."+p.getY());
	}
}