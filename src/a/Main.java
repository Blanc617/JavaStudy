package a;

public class Main {

	public static void main(String[] args) {
		// ������ �Ű������� �°� ���ڸ� �������ش�
		// User user = new User("������", 10, "�Ƹ���"); // Ŭ���� ����
		User user = new User();
		user.setName("�����");
		user.setAge(30);
		
		
		System.out.println(user.getName());
		System.out.println(user.age);
		
	}

}
