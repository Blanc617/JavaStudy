package genegic.ex01;

public class BoxMain2 {

	public static void main(String[] args) {
		ObjectBox integerBox = new ObjectBox();
		integerBox.set(10);
		
		// Object -> Integer ĳ����
		Integer integer = (Integer) integerBox.get();
		System.out.println("integer = " + integer);
		
		ObjectBox stringBox = new ObjectBox();
		stringBox.set("hello");
		
		// Object -> String ĳ����
		String str = (String) stringBox.get();
		System.out.println("str = " + str);
		
		
		
		
	}

}
