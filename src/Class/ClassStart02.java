package Class;

public class ClassStart02 {

	public static void main(String[] args) {

		String[] studentNames = {"�л�1", "�л�2"};
		int[] ages = {15, 16};
		int[] grades = {90,80};
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println("�̸� : " + studentNames[i] + "���� : " + ages[i]
					+ "���� : " + grades[i]);
		}
	}

}
