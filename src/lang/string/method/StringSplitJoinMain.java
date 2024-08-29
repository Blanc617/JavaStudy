package lang.string.method;

import java.util.Iterator;

public class StringSplitJoinMain {

	public static void main(String[] args) {
		String str = "Apple, Banana, Orange";
		
		String[] splitStr = str.split(",");
		for (String s : splitStr) {
			System.out.println(s);
		}
	}

}
