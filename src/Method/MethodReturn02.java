package Method;

public class MethodReturn02 {

	public static void main(String[] args) {
		
		age(10);
		
	}

	public static void age(int a) {
		if(a < 18) {
			System.out.println("미성년자는 출입이 불가합니다.");
			return;
		}else {
			System.out.println("입장하세요");
		}
		
	}
}
