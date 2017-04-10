package com.kevin.purejavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
//@ComponentScan("com.kevin.purejavaconfig")  if enable this we don't need the content in this configuration class
@PropertySource("classpath:messages.properties")
public class HumanConfig {
	
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public Mood happyMood(){
		HappyMood happyMood = new HappyMood();
		return happyMood;
	}
	
	@Bean
	public Human student(){
		Student student = new Student(happyMood());
		return student;
	}
	
	@Bean
	public Mood sadMood(){
		SadMood sadMood = new SadMood();
		return sadMood;
	}
	
	@Bean
	public Teacher teacher(){
		Teacher teacher = new Teacher(sadMood());
		return teacher;
	}
}
