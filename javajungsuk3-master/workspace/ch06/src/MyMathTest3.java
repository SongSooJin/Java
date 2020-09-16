//
//class MyMathTest3 {
//	public static void main(String args[]) {
//	 mycalculator calc = new mycalculator();
//	 int result = calc.add(2, 3);
//	 System.out.println(result);
//	 System.out.println(calc.add(2D, 3));
//	 
//	 result = mycalculator.multiply(2, 3);
//	 System.out.println(result);
//	
//	}
//}
//// 둘의 차이는 multiply라는 앞에 static을 붙였기 때문이다. static변수는 프로그램 시작 전 자동으로 메모리에 로드 되기 때문에이다.
//class mycalculator {
//	// 인스턴스 메소드 : 클래스가 객체가 되어야 이용 할 수 있는 메소드 ]
//	// 클래스에 new해서 사용해야함 
//	// 메로드 오버로딩(Method Over Loading) : 메소드명은 같지만 파라미터정의가 다른 다수의 메소드를 서비스하는 방법 
//	int add (int a, int b) {
//		System.out.println("#1");
//		return a+b;
//	}
//	
//	//시그너처 (Signature) : 메소드를 유일하게 구분하는 부분 = 메소드명 + 파라미터 정의 부분 
//	double add (double a, int b) {
//		System.out.println("#2");
//		return a+b;
//	}
//	
//	static int multiply (int a,int b) {
//		
//		return a *b;
//	}
//	
//}