package array;

public class Array1Ref1 {

	public static void main(String[] args) {
		int[] students; // 배열 변수 선언
		students = new int[5];
		
		// 변수 값 대입
		students[0] = 90;
		students[1] = 80;
		students[2] = 60;
		students[3] = 50;
		students[4] = 30;
		
		System.out.println("학생1 점수 : " + students[0]);
		System.out.println("학생2 점수 : " + students[1]);
	}

}
