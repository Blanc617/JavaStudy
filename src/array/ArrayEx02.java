package array;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 5���� ������ �Է� �޾� �迭�� �����ϰ�, �Է� ������� ���
		// ��½� ��� ������ 1,2,3,4,5�� ���� ,��ǥ�� ����ؼ� ����
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("5���� ������ �Է��ϼ��� : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		System.out.println("���");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			System.out.print(", ");
		}

	}

}
