package Class;

public class ClassStart02 {

	public static void main(String[] args) {

		String[] studentNames = {"학생1", "학생2"};
		int[] ages = {15, 16};
		int[] grades = {90,80};
		
		for(int i = 0; i < ages.length; i++) {
			System.out.println("이름 : " + studentNames[i] + "나이 : " + ages[i]
					+ "성적 : " + grades[i]);
		}
	}

}
