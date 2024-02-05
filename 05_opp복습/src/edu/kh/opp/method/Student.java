package edu.kh.opp.method;

public class Student {

	// 필드
	
	public static String schoolName = "KH대학교"

	public static final int MIN_VALUE = 0;
	public static final int MAX_VALUE= 100;
	
	public String name;
	public String studentNumber;
	public char gender;
	public int java;
	public int html;
	
	
	
	public Student() {}
	
	public Student(String name, String studentNumber, char gender) {
		this.name = name;
		this.studentNumber = studentNumber;
		this.gender = gender;	
		
		
	}
	
	public void setname(String name) {
		this.name = name;
	}
	
	public void setstudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	
	public void setgender(char gender) {
		this.gender = gender;
	}
	
	public void setjava(int java) {
		
	}
	
	public void sethtml(int html) {
		
	}
	
	public String getName(){
		return name;
	}
	
	public String getStudentNumber() {
		return studentNumber;
	}
	
	public char getGender() {
		return gender;
	}
	
	public int getJava() {
		return java;
	}
	
	public int getHtml() {
		return html;
	}
	
}
