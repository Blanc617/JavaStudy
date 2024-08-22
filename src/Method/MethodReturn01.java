package Method;

public class MethodReturn01 {

	public static void main(String[] args) {

		int result = odd(2);
		System.out.println(result);
	}

	public static int odd(int i) {
		if(i % 2 == 1) {
			return 100;
		} else {
			return 200;
		}
	}
}
