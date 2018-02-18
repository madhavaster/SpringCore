package com.madhav.demo13;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;
@Component
public class Triangle implements ApplicationEventPublisherAware{
	private ApplicationEventPublisher publisher;
	public void m1() {
		MyEvent event = new MyEvent(this);
		publisher.publishEvent(event);
	}
	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
		publisher=applicationEventPublisher;
	}
}