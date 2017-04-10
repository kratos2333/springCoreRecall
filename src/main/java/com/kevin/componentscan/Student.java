package com.kevin.componentscan;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student implements Human {

	private Mood myMood;
	
	@Value("${human.firstname}")
	private String firstName;
	
	@Value("${human.lastname}")
	private String LastName;
	
	@Autowired
	public Student(@Qualifier("happyMood")Mood mood){
		this.myMood = mood;
	}
	@Override
	public void speak() {
		System.out.println("I am a student");
	}
	public Mood getMyMood() {
		return myMood;
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This is the init method inside student.");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("This is the destroy method inside student.");
	}

	public void setMyMood(Mood myMood) {
		this.myMood = myMood;
	}
	
	public void expressMood(){
		myMood.talkMyMood();
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
		
}
