package com.spring.base.music;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Player {
	
	@Autowired
	private Instrument instrument;
	
	public void play() {
		instrument.play();
	}

	public void playInstrument() {
		// TODO Auto-generated method stub
		
	}

}
