package a;

public class MethodExample {

	public static void main(String[] args) {
//		String a = "hello";
//		String b = "hongdroid";
//		
//		System.out.println(a + b);
		
		MethodExample methodExample = new MethodExample(); // 클래스 생성
		methodExample.StrCombine("song", "jinu");  // 메소드 실행 (String 타입을 2개를 넘겨줌
		
		String bb = methodExample.StrHongdroid("jin","oo");
		System.out.println(bb);
	}
	
	// 메소드 만든 것
	// 메소드를 만드는 이유
	// 1. 유지보수를 위해서
	// 2. 가독성이 좋아져서
	// 3. 캡슐화 ( 여러 곳에서 중복된 코드를 작성할 필요 x)
	public void StrCombine(String a, String b) { // void는 실행형 메소드
		String result = a + b;
		
		System.out.println(result);
	}
	
	public String StrHongdroid(String a, String b) {
		String result = a + b;
		return result;
	}
}




