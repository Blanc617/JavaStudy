package poly.ex3;

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
	}
	// ������ �ʴ� �κ�
	private static void soundAnimal(AbstractAnimal animal) {
		System.out.println("���� �Ҹ� �׽�Ʈ ����");
		animal.sound();
	}

}
