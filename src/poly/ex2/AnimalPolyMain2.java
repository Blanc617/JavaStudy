package poly.ex2;

public class AnimalPolyMain2 {

	public static void main(String[] args) {

		Animal[] animalArr = {new Dog(), new Cat(), new Cow()};
		
		for (Animal a : animalArr) {
			System.out.println("동물 소리 테스트 시작");
			a.sound();
			System.out.println("동물 소리 테스트 종료");

		}
		
	}

}
