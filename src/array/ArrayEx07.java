package array;

import java.util.Scanner;

public class ArrayEx07 {

	public static void main(String[] args) {

		// 4명의 학생의 국어, 수학, 영어 점수를 입력받아
		// 각 학생의 총점과 평균을 구하시오
		// 2차원 배열 사용
		
		Scanner scanner = new Scanner(System.in);
		int[][] scores = new int[4][3];
		String[] subjects = {"국어", "영어", "수학"};
		
		for(int i = 0; i < 4; i++) {
			System.out.println((i+1) + "번 학생의 성적을 입력 : ");
			for(int j = 0; j < 3; j++) {
				System.out.println(subjects[j] + " 점수 : ");
				scores[i][j] = scanner.nextInt();
			}
		}
		
		
		
	}

}
