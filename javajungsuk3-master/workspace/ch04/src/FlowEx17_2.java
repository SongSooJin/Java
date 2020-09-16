//import java.util.*;
//
//class FlowEx17_2 {
//	public static void main(String[] args) {
//
//		// *****
//		// *****
//		// *****
//
//		for (int i = 1; i <= 3; i++) { // 행개수
//			for (int j = 0; j < 5; j++) { // 열 개수
//				System.out.print("*");
//			}
//
//			System.out.println();
//		}
//
//		System.out.println();
//
//		// ***
//		// ***
//		// ***
//
//		for (int i = 1; i <= 3; i++) { // 행개수
//			for (int j = 1; j <= 3; j++) { // 열 개수
//				System.out.print("*");
//			}
//
//			System.out.println("");
//		}
//
//		System.out.println();
//
//		// * 1행==> 1개
//		// ** 2행==> 2개
//		// *** 3행==> 3개
//
//		for (int i = 1; i <= 3; i++) { // 행개수
//			for (int j = 1; j <= i; j++) { // 열 개수
//				System.out.print("*");
//			}
//
//			System.out.println("");
//		}
//
//		System.out.println();
//
//		// *** 1행==> 3개
//		// ** 2행==> 2개
//		// * 3행==> 1개
//
//		for (int i = 1; i <= 3; i++) { // 행개수
//			for (int j = 0; j <= 3 - i; j++) { // 열 개수
//				System.out.print("*");
//			}
//
//			System.out.println("");
//		}
//
//		System.out.println();
//		// 	* 1행==> 1개
//		// *** 2행==> 3개
//		// 	* 3행==> 1개
//
//
//		for (int i = 1; i <= 3; i++) { // 행개수
//			for (int j = 1; j <= 3; j++) { // 열 개수
//				//System.out.print("*");
//
//				if ( i %2 == 1) {
//					System.out.print(" * ");
//					break;
//				}
//				else {
//					System.out.print("*");
//				}
//			
//			}
//			System.out.println();
//		}
//
//	} // main의 끝
//
//}
