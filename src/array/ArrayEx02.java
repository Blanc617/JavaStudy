package array;

import java.util.Scanner;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 5개의 정수를 입력 받아 배열에 저장하고, 입력 순서대로 출력
		// 출력시 출력 포멧은 1,2,3,4,5와 같이 ,쉼표를 사용해서 구분
		
		Scanner scanner = new Scanner(System.in);
		int[] numbers = new int[5];
		
		System.out.println("5개의 정수를 입력하세요 : ");
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = scanner.nextInt();
		}
		
		System.out.println("출력");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i]);
			System.out.print(", ");
		}

	}

}
