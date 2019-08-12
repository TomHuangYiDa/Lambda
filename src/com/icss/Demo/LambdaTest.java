package com.icss.Demo;

public class LambdaTest {

	public static void main(String[] args) {
		LambdaTest lab = new LambdaTest();
		// ��������
		MathOperation addition = (int a, int b) -> a + b;
		// ������������
		MathOperation subtraction = (a, b) -> a - b;
		// �������еķ������
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};
		// û�д����ż��������
		MathOperation division = (int a, int b) -> a / b;

		System.out.println("10+5=" + lab.operate(10, 5, addition));
		System.out.println("10-5=" + lab.operate(10, 5, subtraction));
		System.out.println("10*5=" + lab.operate(10, 5, multiplication));
		System.out.println("10/5=" + lab.operate(10, 5, division));

		// ��������
		GreetingService greetingService1 = message -> System.out.println("Hello" + message);

		// ������
		GreetingService greetingService2 = (message) -> System.out.println("Hello" + message);

		greetingService1.sayMessage("Runoob");
		greetingService2.sayMessage("Google");
	}

	private int operate(int a, int b, MathOperation addition) {
		return addition.operation(a, b);
	}

	public interface MathOperation {
		int operation(int a, int b);
	}

	public interface GreetingService {
		void sayMessage(String message);
	}
}
