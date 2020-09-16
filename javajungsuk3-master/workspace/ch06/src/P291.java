//
//public class P291 {
//	public static void main(String[] args) {
//	
//		Superman s = new Superman(); // new 클래스 생성자중의 하나 (전달할 파라미터)
//		Superman s2 = new Superman("Clark");
//		
//		// 객체를 생성하는 시점에 객체의 멤버변수 네임에 할당할 값을 전달하면서 새 객체를 만드는 방법이다.
//	}
//}
//
//class Spiderman{
//	// 생성자를 아무것도 명시하지 않으면 컴파일러가 자동으로 디폴트 생성자를 추가해 준다.
//	// public Spiderman() {}
//}
//
//class Superman extends Object {
//	String name;
//
//	// 생성자 : new 연산자로 객체를 생성할때 처리해야 하는 코드를 위한 일종의 메소드이다.
//	// 대문자로 시작한다. 이름은 클래스명과 동일해야 한다.
//	// 생성자명 앞에 리턴자료형 표기가 없다.
//	public Superman() {
//		System.out.println("Superman() called.");
//		
//	}
//	public Superman(String name) {
//		super(); // super는 부모객체를 지칭하는 키워드, super() 부모 클래스의 디폴트 생성자를 호출
//		this.name = name; // this는 객체 자기자신을 지칭하는 키워드
//		System.out.println("Superman(String name) called.");
//	}
//	
//	
//}
