//package P345;
//
//public class test {
//
//	// 관습적으로 상수는 대문자로 변수명을 작성한다. 
//	static 
//	// final : 값의 재 할당을 금지한다.   
//	double PI = 3.14;
//	
//	public static void main(String[] args) {
//		PI = 3.141592;
//	}
//}
//
//// Printer 클래스 설계자가 이 클래스를 상속하여 기능을 확장하는 것을 원하지 않을때가 있다. 
//// 상속해서 기능확장 금지 
//// final : 클래스앞에 붙이면 이 클래스를 상속하는 클래스를 만들 수 없다.
// class Printer {
//	 // final : 메소드앞에 붙이면 이 메소드를 오버라이딩 할 수 없다.
//	 public void print (String message) {
//		System.out.println(message);
//	}
//}
//class BetterPrinter extends Printer {
//	@Override
//	 public void print (String message) {
//		// super.print(message);
//		System.out.println(message);
//	}
//}