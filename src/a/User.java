package a;

public class User {
	
	String name;
	int age;
	String hobby;
	
	// 디폴트 생성자
	public User() {
		
	}
	
	// 클래스의 생성자
	public User(String _name, int _age, String _hobby) {
		this.name = _name;
		this.age = _age;
		this.hobby = _hobby;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}

	

}
