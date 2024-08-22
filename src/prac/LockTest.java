package prac;

public class LockTest {

	public static void main(String[] args) {
		// 객체 생성
		Lock lock = new Lock("12303");
		
		// 객체 비밀번호 변경
		lock.setPassword("65432");
		
		// 객체 정보 출력
		System.out.println(lock.toString());
	}

}
