package com.kevin.purejavaconfig;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Teacher implements Human {
	
	@Autowired
	@Qualifier("sadMood")
	private Mood myMood;
	
	@Value("literalFirstName")
	private String firstName;
	
	@Value("literalLastName")
	private String LastName;

	public Teacher() {
		
	}
	
	public Teacher(Mood mood){
		this.myMood = mood;
	}
	
	@Override
	public void speak() {
		System.out.println("I am a teacher");
	}
	
	@PostConstruct
	public void init() {
		System.out.println("This is the init method inside teacher.");
	}
	
	@PreDestroy
	public void destroy(){
		System.out.println("This is the destroy method inside teacher.");
	}

	public Mood getMyMood() {
		return myMood;
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
