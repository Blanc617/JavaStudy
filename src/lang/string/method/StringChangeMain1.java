package lang.string.method;

public class StringChangeMain1 {

	public static void main(String[] args) {
		String str = "Hello java! welcome to java";
		System.out.println(str.substring(7,12));
		
		System.out.println("���ڿ� ���� " + str.concat("!!!"));
		
		System.out.println("java�� world�� ��ü " + str.replace("java","world"));
	}

}
