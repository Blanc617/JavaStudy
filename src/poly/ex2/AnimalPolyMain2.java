package poly.ex2;

public class AnimalPolyMain2 {

	public static void main(String[] args) {

		Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
		
		for (Animal a : animalArr) {
			System.out.println("���� �Ҹ� �׽�Ʈ ����");
			a.sound();
			System.out.println("���� �Ҹ� �׽�Ʈ ����");

		}
		
	}

}
