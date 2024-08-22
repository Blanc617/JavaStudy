package poly.ex4;

public class AbstractMain {

	public static void main(String[] args) {

		// �߻�Ŭ���� ���� �Ұ�
		// AbstractAnimal animal = new AbstractAnimal();
	
		
		Dog dog = new Dog();
		Cat cat = new Cat();
		Cow cow = new Cow();
		
		cat.sound();
		cat.move();
		
		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(cow);
		
		moveAnimal(dog);
		moveAnimal(cat);
		moveAnimal(cow);
		
	}
	// ������ �ʴ� �κ�
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		animal.sound();
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
	}
	
	// ������ �ʴ� �κ�
		private static void moveAnimal(AbstractAnimal animal) {
			System.out.println("���� �̵� �׽�Ʈ ����");
			animal.move();
			System.out.println("���� �̵� �׽�Ʈ ����");

		}

}
