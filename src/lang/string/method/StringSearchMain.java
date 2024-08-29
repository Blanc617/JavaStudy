package lang.string.method;

public class StringSearchMain {

	public static void main(String[] args) {
		String str = "Hello, java! welcome to java";
		
		System.out.println("'java'의 첫번째 인덱스" + str.indexOf("java"));
		System.out.println("'java'의 마지막 인덱스" + str.lastIndexOf("java"));
		
	}

}
