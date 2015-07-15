package com.prnv.lambda;

public class ExpressionSyntax {

	public static void main(String[] args) {

		Runnable runnable = () -> System.out.println("Howdy Mr. Lambda!");
		runnable.run();

		MathOperations sum = (int a, int b) -> a + b;
		System.out.println(sum.operate(10, 20));

	}

}

interface MathOperations {
	int operate(int a, int b);
}
