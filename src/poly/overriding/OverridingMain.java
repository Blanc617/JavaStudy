package poly.overriding;

public class OverridingMain {

	public static void main(String[] args) {
		// �ڽ� ������ �ڽ� �ν��Ͻ� ����
		Child child = new Child();
		System.out.println("Child -> Child");
		System.out.println("value = " + child.value);
		child.method();
		
		// �θ� ������ �θ� �ν��Ͻ� ����
		Parent parent = new Parent();
		System.out.println("Parent -> Parent");
		System.out.println("value = " + parent.value);
		parent.method();
		
		// �θ� ������ �ڽ� �ν��Ͻ� ����(������ ����)
		Parent poly = new Child();
		System.out.println("Parent -> Child");
		System.out.println("value = " + poly.value); // ������ �������̵� X
		poly.method(); // �޼��� �������̵�!
	}

}
