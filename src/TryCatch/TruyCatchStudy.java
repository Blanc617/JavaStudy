package TryCatch;

public class TruyCatchStudy {

	public static void main(String[] args) {
		int intArray[] = new int[5]; // intArray��� �������ٰ� 5�� ����
		
		try
		{
			intArray[3] = 10;
			intArray[6] = 1;
		}
		catch(Exception e)
		{
			System.out.println("�迭 ���� �ʰ�");
		}
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("intArray[" + i + "] = " + intArray[i]);
		}
	}

}
