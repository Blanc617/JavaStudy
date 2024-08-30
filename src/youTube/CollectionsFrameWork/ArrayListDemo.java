package youTube.CollectionsFrameWork;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		String[] arrayObj = new String[3];
		arrayObj[0] = "one";
		arrayObj[1] = "two";
		arrayObj[2] = "three";
		for(int i = 0; i < arrayObj.length; i++) {
			System.out.println(arrayObj[i]);
		}
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("hello");
		al.add("boy");
		al.add("girl");
		for(int i = 0; i < al.size(); i++) {
			String value = al.get(i);
			System.out.println(value);
		}
				
	}

}
