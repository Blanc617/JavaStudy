package array;

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int[] students = {90,80,70,60,50};
		
		int total = 0;
		int average = total / 5;
		for(int i = 0; i < students.length; i++) {
			total += students[i];
			average = total / 5;
		}
		System.out.println("Á¡¼ö ÃÑÇÕ : " + total);
		System.out.println("Á¡¼ö Æò±Õ : " + average);
		
//		int student1 = 90;
//		int student2 = 80;
//		int student3 = 70;
//		int student4 = 60;
//		int student5 = 50;
		
//		int total = student1 + student2 + student3+ student4 + student5;
//		double average = (double) total / 5;
//		
//		System.out.println("Á¡¼ö ÃÑÇÕ " + total);
//		System.out.println("Á¡¼ö Æò±Õ " + average);

		
	}

}
