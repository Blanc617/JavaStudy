package TryCatch;

public class TruyCatchStudy {

	public static void main(String[] args) {
		int intArray[] = new int[5]; // intArray라는 변수에다가 5의 공간
		
		try
		{
			intArray[3] = 10;
			intArray[6] = 1;
		}
		catch(Exception e)
		{
			System.out.println("배열 범위 초과");
		}
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}
	}

}
