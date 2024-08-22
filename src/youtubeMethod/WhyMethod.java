package youtubeMethod;

import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {

	public static void main(String[] args) throws IOException {
		printTwoTimes("a", "-", 10);
		System.out.println(twoTimes("a", "-"));
		printTwoTimes("a", "*", 9);
		
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		
		printTwoTimes("b", "!", 11);
		printTwoTimes("æ»≥Á«œººø‰", "%", 20);
	}
	
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		return out;
	}
	
	public static void printTwoTimes(String txt, String what, int a) {
		System.out.println(what);
		System.out.println(txt);
		System.out.println(a);
		System.out.println(txt);
	}

} 
