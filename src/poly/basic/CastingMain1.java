package poly.basic;

public class CastingMain1 {

	public static void main(String[] args) {
		// �θ� ������ �ڽ� �ν��Ͻ� ����(������ ����)
		Parent poly = new Child();
		// ��, �ڽ��� ����� ȣ���� �� ����. ������ ���� �߻�
		// poly.childMethod();
		
		// �ٿ�ĳ����(�θ� Ÿ�� -> �ڽ� Ÿ��)
		Child child = (Child) poly;
		child.childMethod();
	}

}
