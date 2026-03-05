package com.spring.base.music;

import org.springframework.stereotype.Component;

@Component
public class Guitar implements Instrument{
	
	public void play() {
		System.out.println("I'm playing guitar");
	}
	
}
