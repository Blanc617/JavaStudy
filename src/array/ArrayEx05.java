package array;

import java.util.Scanner;

public class ArrayEx05 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է� ���� ������ ������ �Է� : ");
		int count = scanner.nextInt();
		
		int[] numbers = new int[count];
		int sum = 0;
		double average;
		
		System.out.println(count + "���� ������ �Է� : ");
		for(int i = 0; i < count; i++) {
			numbers[i] = scanner.nextInt();
			sum += numbers[i];
		}
		
		average = (double) sum / count;
		System.out.println("�Է��� ������ �հ� : " + sum);
		System.out.println("�Է��� ������ ��� : " + average);
	}

}







