package prac;

public class LockTest {

	public static void main(String[] args) {
		// ��ü ����
		Lock lock = new Lock("12303");
		
		// ��ü ��й�ȣ ����
		lock.setPassword("65432");
		
		// ��ü ���� ���
		System.out.println(lock.toString());
	}

}
