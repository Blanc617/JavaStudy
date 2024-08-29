package genegic.ex01;

public class BoxMain2 {

	public static void main(String[] args) {
		ObjectBox integerBox = new ObjectBox();
		integerBox.set(10);
		
		// Object -> Integer 캐스팅
		Integer integer = (Integer) integerBox.get();
		System.out.println("integer = " + integer);
		
		ObjectBox stringBox = new ObjectBox();
		stringBox.set("hello");
		
		// Object -> String 캐스팅
		String str = (String) stringBox.get();
		System.out.println("str = " + str);
		
		
		
		
	}

}
