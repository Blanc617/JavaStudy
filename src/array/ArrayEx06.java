package array;

import java.util.Scanner;

public class ArrayEx06 {

	public static void main(String[] args) {
		
		// 가장 작은 수, 큰 수 찾기
		// n개의 정수를 입력 받아 배열에 저장한 후
		// 배열 내에서 가장 작은 수와 가장 큰 수를 출력
		// 결과 예시
		// 입력 받을 숫자의 개수를 입력 : 3
		// 3개의 정수를 입력 : 1 2 3 
		// 가장 작은 정수 : 1
		// 가장 큰 정수 : 3
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("입력 받을 숫자의 개수를 입력 : ");
		int n = scanner.nextInt();
		
		int[] numbers = new int[n];
		int minNumber, maxNumber;
		
		System.out.println(n + "개의 정수를 입력하세요 : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}

		
		
		
	}

}
