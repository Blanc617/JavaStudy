package lang.string.method;

public class StringChangeMain1 {

	public static void main(String[] args) {
		String str = "Hello java! welcome to java";
		System.out.println(str.substring(7,12));
		
		System.out.println("문자열 결합 " + str.concat("!!!"));
		
		System.out.println("java를 world로 대체 " + str.replace("java","world"));
	}

}
