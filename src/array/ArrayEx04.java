package array;

import java.util.Scanner;

public class ArrayEx04 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		int sum = 0;
		double average;
		
		System.out.println("5���� ������ �Է��ϼ��� : ");
		for(int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}
		
		average = (double) sum / 5;
		System.out.println("�Է��� ������ �հ� : " + sum);
		System.out.println("�Է��� ������ ��� : " + average);
	}

}
