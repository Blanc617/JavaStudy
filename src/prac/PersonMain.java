package prac;

public class PersonMain {

	public static void main(String[] args) {

		Person p = new Person("������", "010-12210-12");
		
		System.out.printf("�̸� : %s\n", p.getName());
		System.out.printf("�̸� : %s\n", p.getPhoneNumber());

	}

}
