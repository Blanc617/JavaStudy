package poly.basic;

public class PolyMain {

	public static void main(String[] args) {
		// �θ� ������ �θ� �ν��Ͻ� ����
		System.out.println("Parent -> Parent");
		Parent parent = new Parent();
		parent.parentMethod();
		
		// �ڽ� ������ �ڽ� �ν��Ͻ� ����
		System.out.println("Child -> Child");
		Child child = new Child();
		child.parentMethod();
		child.childMethod();
		
		// �θ� ������ �ڽ� �ν��Ͻ� ����(������ ����)
		System.out.println("Parent -> Child");
		Parent poly = new Child();
		poly.parentMethod();
	}

}
