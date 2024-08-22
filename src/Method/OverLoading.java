package Method;

public class OverLoading {

	public static void main(String[] args) {
		
		System.out.println(add(1,2));
		System.out.println(add(1,4,6));

	}

	public static int add(int a, int b) {
		System.out.println("1번 호출");
		return a + b;
	}
	
	public static int add(int x, int y, int z) {
		System.out.println("2번 호출");
		return x + y + z;
	}
}
