////0-4
//public class TextReturn {
//	
//	public static void main(String[] args) {
//		
//		int a = 10; // int는 4바이트
//		short b  = (short)a; // short는 2바이트
//		long c = a; // long은 8바이트 
//		
//		System.out.println(TextReturn.add(2,3));
//		System.out.println(add(2,3)); // 이용하는 로직이 제공하는 로직과 하나의 클래스내에 존재 할 때 클래스명을 생략이 가능하다.
//	
//		print("Hello World!!!!!!!!!!");
//		print("");
//	}
//						// 메소드명 + 파라미터
//						// print(String string)  이부분이 시그너처 
//	private static void print(String string) {
//		if (string.equals("")) { // 빈문자열 일 때 화면 출력작업을 하지 않는다.
//			return; //  메소르 로직처리를 끝내라. (여기서 코드수행을 멈춰라.)
//		}
//		
//		System.out.println("==========================");
//		System.out.println(string);
//		System.out.println("==========================");
//		
//	}
//
//	static short  add(int i , int  j) {
//
////		int result = i + j;
////		return result;
//		
//		return (short) ( i + j );
//	}
//	
//	
//	
//}
