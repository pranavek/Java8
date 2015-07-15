package com.prnv.lambda;

import java.util.List;

import com.prnv.entity.Student;

/**
 * @author pranavek Find maximum value inside a collection
 */
public class InternalIteration {

	public static void main(String[] args) {
		Student student = new Student();
		List<Student> students = student.getStudents();
		
		double highestScore = students.stream()
				.filter((Student s) -> s.getGradeYear() == 2013)
				.map((Student s) -> s.getScore())
				.max(Double::compareTo).get();

		System.out.println("The higest score is" + highestScore);
	}

}
