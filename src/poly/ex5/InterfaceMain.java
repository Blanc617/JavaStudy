package poly.ex5;

public class InterfaceMain {

	public static void main(String[] args) {
		// �������̽� ���� �Ұ�
		// InterfaceAnimal interfaceAnimal = new InterfaceAnimal();
		
		Cat cat = new Cat();
		Dog dog = new Dog();
		Cow cow = new Cow();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(cow);
		
	}
	
	// ������ �ʴ� �κ�
		private static void soundAnimal(InterfaceAnimal animal) {
			System.out.println("���� �Ҹ� �׽�Ʈ ����");
			animal.sound();
			System.out.println("���� �Ҹ� �׽�Ʈ ����");
		}

}
