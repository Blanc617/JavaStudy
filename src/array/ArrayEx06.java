package array;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		// ���� ���� ��, ū �� ã��
		// n���� ������ �Է� �޾� �迭�� ������ ��
		// �迭 ������ ���� ���� ���� ���� ū ���� ���
		// ��� ����
		// �Է� ���� ������ ������ �Է� : 3
		// 3���� ������ �Է� : 1 2 3 
		// ���� ���� ���� : 1
		// ���� ū ���� : 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("�Է� ���� ������ ������ �Է� : ");
		int n = scanner.nextInt();
		
		int[] numbers = new int[n];
		int minNumber, maxNumber;
		
		System.out.println(n + "���� ������ �Է��ϼ��� : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		
		
		
	}

}
