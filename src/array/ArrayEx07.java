package array;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {

		// 4���� �л��� ����, ����, ���� ������ �Է¹޾�
		// �� �л��� ������ ����� ���Ͻÿ�
		// 2���� �迭 ���
		
		Scanner scanner = new Scanner(System.in);
		int[][] scores = new int[4][3];
		String[] subjects = {"����", "����", "����"};
		
		for(int i = 0; i < 4; i++) {
			System.out.println((i+1) + "�� �л��� ������ �Է� : ");
			for(int j = 0; j < 3; j++) {
				System.out.println(subjects[j] + " ���� : ");
				scores[i][j] = scanner.nextInt();
			}
		}
		
		
		
	}

}
