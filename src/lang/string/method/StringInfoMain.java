package lang.string.method;

public class StringInfoMain {

	public static void main(String[] args) {
		String str = "Hello, Java!";
		System.out.println("문자열의 길이 : " + str.length());
		System.out.println("문자열이 비어 잇는지 " + str.isEmpty());
		
		char c = str.charAt(7);
		System.out.println("7번 인덱스의 문자 = " + c);
	}

}
