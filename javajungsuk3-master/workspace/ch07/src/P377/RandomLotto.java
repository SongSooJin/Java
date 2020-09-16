//package P377;
//
//import  java.util.Random;
//
//public class RandomLotto extends Lotto {
//
//	@Override
//	public void printNumbers(int[] number) {
//		for (int i = 0;  i< number.length; i++) {
//			System.out.print(number[i] + " ");
//		}
//		System.out.println();
//	}
//
//	@Override
//	public int[] getNumbers() {
//		
//		Random rnd = new Random();
//		
//		int[] nums = new int[6];
//		
//		for (int i = 0; i < nums.length; i++) {
//		nums[i] = rnd.nextInt(45) + 1;
//		}
//		return nums;
//	}
//
//}
