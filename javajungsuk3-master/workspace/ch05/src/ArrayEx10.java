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
//		// 배열이 갖고있는 점수를 오름차순 정렬하여 출력하시오.
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
//		System.out.println("배열이 갖고 있는 잡중에 가장 큰 숫자 : " + nums[nums.length - 1]);
//		System.out.println("최종 결과 :" + Arrays.toString(nums));
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
//		// 버블소트
//		for (int i = 0; i < numArr.length - 1; i++) {
//			// boolean changed = false; // 자리바꿈이 발생했는지를 체크한다.
//
//			for (int j = 0; j < numArr.length - 1 - i; j++) {
//				if (numArr[j] > numArr[j + 1]) { // 옆의 값이 작으면 서로 바꾼다.
//					int temp = numArr[j];
//					numArr[j] = numArr[j + 1];
//					numArr[j + 1] = temp;
//					// changed = true; // 자리바꿈이 발생했으니 changed를 true로.
//					System.out.println("\t" + Arrays.toString(numArr));
//				}
//
//			} // end for j
//
////			if (!changed) break;	// 자리바꿈이 없으면 반복문을 벗어난다.
////
////			for(int k=0; k<numArr.length;k++)
////				System.out.print(numArr[k]); // 정렬된 결과를 출력한다.
////			System.out.println();
//
//			System.out.println("\t===========================");
//			System.out.println("\t" + Arrays.toString(numArr));
//
//		} // end for i
//
//	} // main의 끝
//}
