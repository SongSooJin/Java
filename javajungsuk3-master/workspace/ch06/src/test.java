//package ch06;
//
//import java.util.Arrays;
//
//
//public class test {
//	public static void main(String[] args) {
//		// ���� : �̿ϼ��� �޼ҵ� 2���� �ϼ��Ͻÿ�.
//		
//		int[] ary = makeArray(10); // ���� 10���� ��� �ִ� �迭�� �����ϴ� �޼ҵ�
//		
//	
//		System.out.println(Arrays.toString(ary));
//		// ��°��
//		// [1,2,3,4,5,6,7,8,9,10]
//		
//		
//		int operand = 10;
//		ary = evenItemsMultiply(ary, operand);
//		
//		System.out.println(Arrays.toString(ary));
//		
//		// ��°��
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
