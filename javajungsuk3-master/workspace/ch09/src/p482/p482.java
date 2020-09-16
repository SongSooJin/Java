//package p482;
//
//public class p482 {
//
//	public static void main(String[] args) {
//		/*
//		 * String 변수로 문자열을 조작하면 객체가 생성되므로 좋지 않습니다.
//		 * 문자열을 조작할 때 대신 StringBuffer , StringBuilder 를 사용합니다.
//		 * StringBuffer : 멀티 스레드 환경에서도 사용한다. 멀티 스레드에서도 안전하게 수행되기
//		 * 						위해서 코드의 부분적인 락이 걸려있기 때문에 처리속도는 StringBuilder 보다 
//		 * 						느리게 됩니다.
//		 * StringBuilder : 싱글 스레드 환경에서 사용된다.
//		 * 
//		 * */
//
//		StringBuffer sb = new StringBuffer();
//		for (int i = 0; i < 100; i++) {
//			sb.append(i);
//		}
//		System.out.println(sb.toString());
//			
//		StringBuilder stringBuilder = new StringBuilder();
//		for (int i = 0; i < 100; i++) {
//			stringBuilder.append(i);
//		}
//		System.out.println(stringBuilder.toString());
//		
//	}
//}
