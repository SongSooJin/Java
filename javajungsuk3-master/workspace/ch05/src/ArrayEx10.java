////5-10
//import java.util.Arrays;
//
//class ArrayEx10 {
//	public static void main(String[] args) {
////		example();
//
//		int[] nums = { 1, 4, 7, 3, 2 };
//		System.out.println(Arrays.toString(nums));
//		System.out.println("=====================");
//
//		// �迭�� �����ִ� ������ �������� �����Ͽ� ����Ͻÿ�.
//
//		for (int k = 0; k < nums.length - 1; k++) {
//			for (int i = 0; i < nums.length - 1 - k; i++) {
//				if (nums[i] > nums[i + 1]) {
//					int temp = nums[i + 1];
//					nums[i + 1] = nums[i];
//					nums[i] = temp;
//				}
//			}
//			System.out.println(Arrays.toString(nums));
//		}
//		
////
////		for (int i = 0; i < nums.length - 1 - 0; i++) {
////			if (nums[i] > nums[i + 1]) {
////				int temp = nums[i + 1];
////				nums[i + 1] = nums[i];
////				nums[i] = temp;
////			}
////		}
////		System.out.println(Arrays.toString(nums));
////		
////		for (int i = 0; i < nums.length - 1 - 1; i++) {
////			if (nums[i] > nums[i + 1]) {
////				int temp = nums[i + 1];
////				nums[i + 1] = nums[i];
////				nums[i] = temp;
////			}
////		}
////		System.out.println(Arrays.toString(nums));
////		
////		for (int i = 0; i < nums.length - 1 - 1; i++) {
////			if (nums[i] > nums[i + 1]) {
////				int temp = nums[i + 1];
////				nums[i + 1] = nums[i];
////				nums[i] = temp;
////			}
////		}
////		System.out.println(Arrays.toString(nums));
//
//		System.out.println("�迭�� ���� �ִ� ���߿� ���� ū ���� : " + nums[nums.length - 1]);
//		System.out.println("���� ��� :" + Arrays.toString(nums));
//
//		// [1,,2,3,4,7]
//
//	}
//
//	private static void example() {
//		// TODO Auto-generated method stub
//		int[] numArr = new int[10];
//
//		for (int i = 0; i < numArr.length; i++) {
//			// System.out.print(numArr[i] = (int)(Math.random() * 10));
//			numArr[i] = (int) (Math.random() * 10);
//		}
//
//		// System.out.println();
//		System.out.println(Arrays.toString(numArr));
//		System.out.println("==============================");
//
//		// �����Ʈ
//		for (int i = 0; i < numArr.length - 1; i++) {
//			// boolean changed = false; // �ڸ��ٲ��� �߻��ߴ����� üũ�Ѵ�.
//
//			for (int j = 0; j < numArr.length - 1 - i; j++) {
//				if (numArr[j] > numArr[j + 1]) { // ���� ���� ������ ���� �ٲ۴�.
//					int temp = numArr[j];
//					numArr[j] = numArr[j + 1];
//					numArr[j + 1] = temp;
//					// changed = true; // �ڸ��ٲ��� �߻������� changed�� true��.
//					System.out.println("\t" + Arrays.toString(numArr));
//				}
//
//			} // end for j
//
////			if (!changed) break;	// �ڸ��ٲ��� ������ �ݺ����� �����.
////
////			for(int k=0; k<numArr.length;k++)
////				System.out.print(numArr[k]); // ���ĵ� ����� ����Ѵ�.
////			System.out.println();
//
//			System.out.println("\t===========================");
//			System.out.println("\t" + Arrays.toString(numArr));
//
//		} // end for i
//
//	} // main�� ��
//}
