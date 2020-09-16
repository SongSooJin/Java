////	프로그램을 실행하면 콘솔에 다음처럼 출력하도록 createArray(length, startNumber) 메소드를
////	완성하세요.
//
////	[10, 11, 12, 13, 14]
//import java.util.Arrays;
//
//public class Test2 {
//
//		public static void main(String[] args) {
//			
//			int length = 5;
//			int startNumber = 10;
//			
//			int[] ary = createArray(length, startNumber);
//			
//			System.out.println(Arrays.toString(ary));
//		}
//		
//		// 반환 자료형 타입 이름 매개변수
//		static int[] createArray(int length, int startNumber) {
//			
//			int[] a = new int[length];
//			
//			for(int i=0; i<5;i++) {
//				a[i] = startNumber+i;
//			}
//			
//			return a;
//		}
//		
//
//}
//
