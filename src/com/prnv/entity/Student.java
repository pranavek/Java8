package com.prnv.entity;

public class Student{

	public Student(int gradeYear,double score){
		this.gradeYear = gradeYear;
		this.score =  score;
	}
	
	private int gradeYear;

	private double score;


	public void setGradeYear(int gradeYear){
		this.gradeYear = gradeYear;
	}

	public void setScore(double score){
		this.score = score;
	}

	public int getGradeYear(){
		return this.gradeYear;
	}

	public double getScore(){
		return this.score;
	}
}