package poly.basic;

public class CastingMain2 {
	
	public static void main(String[] args) {
		// �θ� ������ �ڽ� �ν��Ͻ� ����(������ ����)
		Parent poly = new Child();
		// ��, �ڽ��� ����� ȣ���� �� ����. ������ ���� �߻�
		// poly.childMethod();
		
		// �ٿ�ĳ����(�θ� Ÿ�� -> �ڽ� Ÿ��)
		Child child = (Child) poly;
		child.childMethod();
		
		// �Ͻ��� �ٿ�ĳ���� - �ش� �޼��带 ȣ���ϴ� ������ �ٿ�ĳ����
		((Child) poly).childMethod();
	}

}

