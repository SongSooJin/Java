//package p415;
//
//public class P415 {
//
//	public static void main(String[] args) {
//		int result = divide(3,0);
//		// divide 메소드를 호출했는데 메소드 처리중에 예외가 발생했고
//		// throw e; 라는 코드로 발생된 예외정보를 갖고 있는 객체를
//		// 전달하면 divide 메소드를 호출한 코드 부분에서 예외가 발생된
//		// 것으로 취급한다.  try ~ catch 구문이 없으면 자동으로
//		// throw e; 코드가 있는것과 같다.
//		// JVM에게 예외가 전달되면 콘솔에 빨간색으로 예외를 출력한다.
//		System.out.println("result = " + result);
//	}
//	
//	private static int divide(int i, int j) {
//		int result = 0;
//		try {
//			result =i / j ;
//			} 
//		catch  (RuntimeException e) {
//			// ArithmeticException e / 컨트롤 f4
//			/*
//			e.printStackTrace(); // 코드처리출력해봐
//			java.lang.ArithmeticException: / by zero
//			at p415.P415.divide(P415.java:13)
//			at p415.P415.main(P415.java:6)
//			*/
//			//System.out.println(e.getMessage());
//			
//			throw e; // 예외를 이 메소드를 호출한 측으로 전달한다.
//			}
//		return  result;
//	}
//}
//
///*
// * Object
// * 		Throwable : 예외 전파 
// * 			Exception : checked Exception
// * 							Exception 클래스와 자식 예외클래스가 발생하면
// * 							개발자가 반드시 try ~ catch 해야 한다.
// * 				RuntimeException : unchecked Exception
// * 											try ~ catch는 선택사항.
// * 					ArithmeticException : 
// * 
// * */
