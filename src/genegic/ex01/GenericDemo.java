package genegic.ex01;

class EmployeeInfo{
	public int rank;
	EmployeeInfo(int rank){this.rank = rank;}
}

class Person<T, S>{
	public T info;
	public S id;
	Person(T info, S id){
		this.info = info;
		this.id = id;
	}
	
	// 매개변수 타입을 확정하고 싶지 않을때 U
	public <U> void printInfo(U info) {
		System.out.println(info);
	}
}


public class GenericDemo {
	public static void main(String[] args) {
		EmployeeInfo e = new EmployeeInfo(1);
		Integer i = new Integer(10);
		Person p1 = new Person(e, i);
		
		p1.printInfo(e);
		System.out.println(e);
	}
}
