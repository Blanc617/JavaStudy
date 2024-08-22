package prac;

public class PersonMain {

	public static void main(String[] args) {

		Person p = new Person("송진우", "010-12210-12");
		
		System.out.printf("이름 : %s\n", p.getName());
		System.out.printf("이름 : %s\n", p.getPhoneNumber());

	}

}
