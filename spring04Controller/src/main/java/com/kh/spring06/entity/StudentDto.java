package com.kh.spring06.entity;

public class StudentDto {
	private String name;
	private int age;
	private int score;
	private String when;
	public StudentDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getWhen() {
		return when;
	}
	public void setWhen(String when) {
		this.when = when;
	}
	
}
