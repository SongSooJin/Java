//package p491;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class p491 {
//	
//	public static void main(String[] args) {
//	
//		int[] nums = {10, 20, 30};
//		// java.lang.ArrayIndexOutOfBoundsException
//		// nums[nums.length] = 40;
//		
//		// 빠른 속도가 최우선이라면 배열을 사용하지만 그렇지 않은 경우
//		// 취급이 편한 도구를 선호하게 된다. 대안으로 Collection 클래스들을 대신 사용한다.
//		
//		// 동적배열
//		// <Integer> : <취급하는자료형> : 지네릭, 기초타입지원하지 않음
//		List<Integer> number = new ArrayList<Integer>(); 
//		number.add(10); 	 // 자동으로 new Integer(10)로 처리됨
//		number.add(20);
//		number.add(30);
//		number.add(number.size()-1,40);
//		number.add(new Integer(100));
//		
//		// 기본 자료형  8개를 객체타입으로 취급할 수 있도록 각 자료형마다 대응하는 클래스가 있다.
//		// 이들간의 형변환은 완전 전자동이다.
//		int a = 10;
//		Integer aa = a; 	// 원시타입 ==> 오토박싱(auto boxing) ==> 객체타입
//		a = aa; 	// 객체타입 ==> 오토언박싱(auto unboxing) ==> 원시타입
//		
//		Number bb= new Integer(100);
//		int b = (int)bb;
//		
//		double x = add(2,3);
//	
//	}
//
//	private static double add(int i, Number j) {
//		
//		return  i+j.doubleValue();
//	}
//	
//}
