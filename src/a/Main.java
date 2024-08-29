package a;

public class Main {

	public static void main(String[] args) {
		// 생성자 매개변수에 맞게 인자를 삽입해준다
		// User user = new User("송진우", 10, "아몰랑"); // 클래스 생성
		User user = new User();
		user.setName("힘들어");
		user.setAge(30);
		
		
		System.out.println(user.getName());
		System.out.println(user.age);
		
	}

}
