package Method;

public class MethodReturn02 {

	public static void main(String[] args) {
		
		age(10);
		
	}

	public static void age(int a) {
		if(a < 18) {
			System.out.println("�̼����ڴ� ������ �Ұ��մϴ�.");
			return;
		}else {
			System.out.println("�����ϼ���");
		}
		
	}
}
