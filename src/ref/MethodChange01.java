package ref;

public class MethodChange01 {

	public static void main(String[] args) {

		int a = 10;
		System.out.println("�޼��� ȣ�� �� : a =" + a);
		changePrimitive(a);
		System.out.println("�޼��� ȣ�� �� : a =" + a);

	}
	
	static void changePrimitive(int x) {
		x = 20;
	}

}
