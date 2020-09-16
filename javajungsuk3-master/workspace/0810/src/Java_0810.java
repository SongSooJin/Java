
////0-1
//public class Java_0810 {
//	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		// 클래스 설계도를 사용하여 객체를 만드는 문법
//		// new 클래스명 ()
//		
//	new Dog();
//	
//	// 힙 메모리에 만들어진 객체럴 실제로 사용하려면 그 객체를 가리키는  변수를 통해서 접근해야 된다.
//	
//	Dog myDog = new Dog();
//	
//	String breed = "멍멍이";
//	
//	// . : 객체가 갖고있는 변수,메소드에 접근하는 방법
//	// 메소드 호출하는 문법
//	// 메소드명(필요할 경우 파라미터를 전달)
//	myDog.run(breed);
//
//	}
//	
//}
//
//// 관찰대상 실체를 보고 설계도 class를 만든다.
//// 클래스란 (class) : 객체를 만들기 위한 설계도
//// 객체 (Object) : 여러개의 변수(상태)와 메소드(기능)를 갖고 있으며 변수와 메소드를 위한 메모리를 차지하고 있는 상태
//// 클래스를 만드는 문법
//// class 클래스명 {
////
//// }
//class Cat {
//	
//}
//
//class Dog{
//	// 변수를 만드는 문법
//	// 자료형 변수명 = 값
//	// 자료형 : 해당변수가 취급하는 데이터의 종류 및 크기 
//	String breed = "Jindo";
//	int age = '2';
//	
//	// 자료형의 종류
//	// 크키가 한정되어 있는 자료형 : 원시타입 자료형
//	// true, false ==> boolean
//	// 정수 ==> byte(1), short(2),  int(4), long(8),
//	// 실수 ==> float(4), double(8)
//	// 한글자 => char(2)
//	
//	// 크기가 무한한 자료형 : 참조타입 자료형
//	// 배열 ==> []
//	// 객체 (Object) => new 클래스명()
//	// 문자열 ==> String
//	
//	// 메소드를 만드는 문법
//	// 리턴자료형 메소드명(파라미터) {
//	//
//	//}	
//	
//	// 파라미터 : 메소드가 호출되어 가동할때 외부로부터 받는 값
//	// void : 해당 메소드는 return 하는 값이 없다.
//	void run(String breed) { //(String breed) = "멍멍이"
//		System.out.println(breed + "개가 달린다.");
//	}
//	
//	String order() {
//		return "막대기";
//	}
//	
//	
//}


//public class Java_0810 {
//	
//	public static void main(String[] args) {
//	
//		Bicycle b = new Bicycle();
//	
//		b.speedup(10);
//		
//		b.printState();
//	
//	}
//
//}
//
////자전거 설계도
//class Bicycle {
//	int speed = 0; // 멤버변수 : 특정값으로 초기화 하지 않으면 미리 전해진 기본값으로 자동으로 초기화 된다.
//	
//	// 변수를 만드는 문법
//	// 자료형 변수명 = 값
//
//	void speedup(int increment) { // 파라미터 변수 : 외부에서 전달한 값이 자동으로 할당된다. 
//		
//		speed = speed + increment;
//		
//	}
//	void printState() {
//		int mySpeed = speed; // 지역변수 : 직접 값을 할당한 후에 사용해야한다.
//		System.out.printf("speed= %d ", mySpeed);
//	}
//}






