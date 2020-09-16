//package ch06;
//
//import java.util.Arrays;
//
//
//public class test {
//	public static void main(String[] args) {
//		// 과제 : 미완성된 메소드 2개를 완성하시오.
//		
//		int[] ary = makeArray(10); // 정수 10개를 담고 있는 배열을 리턴하는 메소드
//		
//	
//		System.out.println(Arrays.toString(ary));
//		// 출력결과
//		// [1,2,3,4,5,6,7,8,9,10]
//		
//		
//		int operand = 10;
//		ary = evenItemsMultiply(ary, operand);
//		
//		System.out.println(Arrays.toString(ary));
//		
//		// 출력결과
//		// [1,20,3,40,5,60,7,80,9,100]
//	}
//	
//	static int[] makeArray(int length) {
//		
//		int[] nums = new int[length];
//		for (int i = 0; i < nums.length; i++) {
//			nums[i] = i+1;
//		}
//		
//		return nums;
//	}
//	
//	private static int[] evenItemsMultiply(int[] ary, int operand) {
//		
//		for(int i= 0; i<ary.length;i++) {
//			
//			if(ary[i]%2==0)
//			ary[i] = ary[i] * operand;
//		}
//		
//		
//		return ary;
//		
//		
//	}
//	
//
//	
//}
