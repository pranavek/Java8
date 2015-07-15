package com.prnv.lambda;

import java.util.ArrayList;
import java.util.List;

import com.prnv.entity.Student;

/**
 * @author pranavek
 * Find maximum value inside a collection
 */
public class InternalIteration {

	static List<Student> students = new ArrayList<Student>();

	public static void init() {
		Student s = new Student(2013, 7.0);
		students.add(s);
		s = new Student(2013, 5.0);
		students.add(s);
		s = new Student(2013, 8.0);
		students.add(s);
	}

	public static void main(String[] args) {
		init();
		double highestScore = students.stream()
				.filter((Student s) -> s.getGradeYear() == 2013)
				.map((Student s) -> s.getScore())
				.max(Double::compareTo).get();

		System.out.println("The higest score is"+highestScore);
	}

}
