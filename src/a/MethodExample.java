package a;

public class MethodExample {

	public static void main(String[] args) {
//		String a = "hello";
//		String b = "hongdroid";
//		
//		System.out.println(a + b);
		
		MethodExample methodExample = new MethodExample(); // Ŭ���� ����
		methodExample.StrCombine("song", "jinu");  // �޼ҵ� ���� (String Ÿ���� 2���� �Ѱ���
		
		String bb = methodExample.StrHongdroid("jin","oo");
		System.out.println(bb);
	}
	
	// �޼ҵ� ���� ��
	// �޼ҵ带 ����� ����
	// 1. ���������� ���ؼ�
	// 2. �������� ��������
	// 3. ĸ��ȭ ( ���� ������ �ߺ��� �ڵ带 �ۼ��� �ʿ� x)
	public void StrCombine(String a, String b) { // void�� ������ �޼ҵ�
		String result = a + b;
		
		System.out.println(result);
	}
	
	public String StrHongdroid(String a, String b) {
		String result = a + b;
		return result;
	}
}




