package ref;

public class VarChange01 {

	public static void main(String[] args) {

		int a = 10;
		int b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// a ����
		a = 20;
		System.out.println("���� a = 20");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
		// a ����
				b = 30;
				System.out.println("���� b = 30");
				System.out.println("a = " + a);
				System.out.println("b = " + b); 
	}

}





