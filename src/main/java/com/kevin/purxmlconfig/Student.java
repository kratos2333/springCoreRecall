package com.kevin.purxmlconfig;

public class Student implements Human {

	private Mood myMood;
	private String firstName;
	private String LastName;
	
	public Student(Mood mood){
		this.myMood = mood;
	}
	@Override
	public void speak() {
		System.out.println("I am a student");
	}
	public Mood getMyMood() {
		return myMood;
	}
	
	public void init() {
		System.out.println("This is the init method inside student.");
	}
	
	// The destroy method will not get called as the student's scope is prototype
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
