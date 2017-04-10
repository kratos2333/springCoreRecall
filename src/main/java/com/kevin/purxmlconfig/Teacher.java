package com.kevin.purxmlconfig;

public class Teacher implements Human {
	private Mood myMood;
	
	private String firstName;
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
	
	public void init() {
		System.out.println("This is the init method inside teacher.");
	}
	
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
