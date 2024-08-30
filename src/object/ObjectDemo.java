package object;

class Student{
	String name;
	Student(String name){
		this.name = name;
	}
	public boolean equals(Object obj) {
		Student s = (Student) obj;
		return true;
	}
}
public class ObjectDemo {

	public static void main(String[] args) {
		Student s1 = new Student("ee");
		Student s2 = new Student("ee");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
