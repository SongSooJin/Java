
public class HelloWorld {
	
//1-1	// 클래스가 직접 갖고있는 멤버변수의 메모리 로드 시점은
//	// 클래스가 인스턴스 화 되어 객체가 될때 같이 메모리에 로드된다.
//	static String title = "Hello World";
//	
//	//static이 붙어있으면 메모리가 자동 처리,프로그램 시작전에 
//	// 메소드가 실행되기 위해서는 메소드가 소프트웨어 코드로 작동하기 위해서 미리 메모리에 로드되어야 한다.
//	// static : 키워드가 붙어 있는 변수, 메소드를 프로그램 시작전 (기동메소드 전) 자동으로 메모리에 로드하여 
//	// 실행될 수있도록 준비한다. 
//	// 같은 클래스의 다수의 변수와 다수의 메소드가 있을 때 static키워드가 붙어 있는 변수, 메소드만 단독으로 메모리에 로드된다.
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// Cannot make a static reference to the non-static field title
//		// main 메소드는 static 키워드를 붙여서 메모리에 할당되고 사용할수 있으나
//		// main 메소드 내에서 사용하려는 title 변수는 static 키워드가 붙어 있지 않으므로
//		// 메모리에 할당되어 있지 않고 따라서 사용할수없다.
//		// static 키워드가 붙어 있는 메소드에서 static 키워드가 붙어 있지 않은  변수를 참조할수없다.
//		System.out.println(title);
//		
//		// public final static PrintStream out = null;
//		// PrintStream 클래스로 만든 out이라는 객체
//		new HelloWorld();
//	}

	// static 키워드로 프로그램 시작전 메모리에 로드된 자원은 프로그램 종료 전까지 메모리를 차지한다.
	// 즉,메모리 낭비의 원인이 되므로 남용해서는 안된다.
	// static으로 메모리에 로드하는 대상은 모든 클래스의 메소드에서 사용하는 전역자원이 그 대상이 된다.
	static String name = "Sonata";
	 String color = "Red";
	
	
}
