package com.kevin.componentscan;

import org.springframework.stereotype.Component;

@Component
public class SadMood implements Mood {

	@Override
	public void talkMyMood() {
		System.out.println("I am sad.");

	}

}
