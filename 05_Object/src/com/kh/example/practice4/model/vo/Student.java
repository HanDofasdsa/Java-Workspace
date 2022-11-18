package com.kh.example.practice4.model.vo;

public class Student {

	private int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;

	{
		grade = 3;
		classroom = 7;
		name = "동히";
		height = 180.2;
		gender = 'm';
	}

	public Student() {

	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public String InFormation() {
		return grade + " " + classroom + " " + name + " " + height + " " + gender;
	}
}
