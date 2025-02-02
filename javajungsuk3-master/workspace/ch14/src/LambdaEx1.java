////14-1
//@FunctionalInterface
//interface MyFunction {
//	void run();  // public abstract void run();
//}
//
//@FunctionalInterface
//interface Adder {
//	int add (int a , int b);
//}
//
//class LambdaEx1 {
//	
//	static int proceed(Adder adder, int a , int b) {
//		return adder.add(a, b);
//	} 
//	
//	static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
//		f.run();
//	}
//
//	static MyFunction getMyFunction() { // 반환 타입이 MyFunction인 메서드 
//		MyFunction f = () -> System.out.println("f3.run()");
//		return f;
//	}
//
//	public static void main(String[] args) {
//		
////		Adder adder = new Adder() {
////			@Override
////			public int add(int a, int b) {
////				return a+b;
////			}
////		};
////		
////		int result = proceed(adder,2,3);
////		System.out.println("result = " + result);
//		
//		// 람다식 / -> 화살표 연산자 
////		int result = proceed((int a , int b) -> {
////			return a+b; 
////		}, 2, 3);
////		System.out.println("result = " + result);
//		
//		//람다식의 변형-1
//		// {} 바디연산자를 생략하면 자동으로 return이 된다.
////		int result = proceed((int a , int b) -> a+b, 2, 3);
//		// ( a, b) -> a+b => 객체 
//		int result = proceed(( a, b) -> a+b, 2, 3);
//		System.out.println("result = " + result);
//		
//		
//		
////		int result = proceed(new Adder() {
////			
////			@Override
////			public int add(int a, int b) {
////				return a+b;
////			}
////		}, 2, 3);
////		
////		System.out.println("result = " + result);
//		
//		
//		// 람다식으로 MyFunction의 run()을 구현
//		MyFunction f1 = ()-> System.out.println("f1.run()");
//
//		MyFunction f2 = new MyFunction() {  // 익명클래스로 run()을 구현
//			public void run() {   // public을 반드시 붙여야 함
//				System.out.println("f2.run()");
//			}
//		};
//
//		MyFunction f3 = getMyFunction();
//
//		f1.run();
//		f2.run();
//		f3.run();
//
//		execute(f1);
//		execute( ()-> System.out.println("run()") );
//	}
//}
