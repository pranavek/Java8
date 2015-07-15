package com.prnv.entity;

import java.util.ArrayList;
import java.util.List;

public class Student {

	List<Student> students = new ArrayList<Student>();

	public Student(){}
	
	public Student(int gradeYear, double score) {
		this.gradeYear = gradeYear;
		this.score = score;
	}

	private int gradeYear;

	private double score;

	public void setGradeYear(int gradeYear) {
		this.gradeYear = gradeYear;
	}

	public void setScore(double score) {
		this.score = score;
	}

	public int getGradeYear() {
		return this.gradeYear;
	}

	public double getScore() {
		return this.score;
	}

	public List<Student> getStudents() {
		Student s = new Student(2013, 7.0);
		students.add(s);
		s = new Student(2013, 5.0);
		students.add(s);
		s = new Student(2013, 8.0);
		students.add(s);
		return students;
	}

}