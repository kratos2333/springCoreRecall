package com.kevin.componentscan;

import org.springframework.stereotype.Component;

@Component
public class HappyMood implements Mood {

	@Override
	public void talkMyMood() {
		System.out.println("I am happy!");
	}

}
