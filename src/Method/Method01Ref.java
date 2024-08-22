package Method;

public class Method01Ref {

	public static void main(String[] args) {
		

		printHeader();
		System.out.println("프로그램 동작 중");
		printFooter();
		
	}
	
	public static void printHeader() {
		System.out.println("= 프로그램을 시작합니다");
	}
	
	public static void printFooter() {
		System.out.println("= 프로그램을 종료합니다");
	}
}
