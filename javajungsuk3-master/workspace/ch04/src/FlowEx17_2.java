//import java.util.*;
//
//class FlowEx17_2 {
//	public static void main(String[] args) {
//
//		// *****
//		// *****
//		// *****
//
//		for (int i = 1; i <= 3; i++) { // �ళ��
//			for (int j = 0; j < 5; j++) { // �� ����
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
//		for (int i = 1; i <= 3; i++) { // �ళ��
//			for (int j = 1; j <= 3; j++) { // �� ����
//				System.out.print("*");
//			}
//
//			System.out.println("");
//		}
//
//		System.out.println();
//
//		// * 1��==> 1��
//		// ** 2��==> 2��
//		// *** 3��==> 3��
//
//		for (int i = 1; i <= 3; i++) { // �ళ��
//			for (int j = 1; j <= i; j++) { // �� ����
//				System.out.print("*");
//			}
//
//			System.out.println("");
//		}
//
//		System.out.println();
//
//		// *** 1��==> 3��
//		// ** 2��==> 2��
//		// * 3��==> 1��
//
//		for (int i = 1; i <= 3; i++) { // �ళ��
//			for (int j = 0; j <= 3 - i; j++) { // �� ����
//				System.out.print("*");
//			}
//
//			System.out.println("");
//		}
//
//		System.out.println();
//		// 	* 1��==> 1��
//		// *** 2��==> 3��
//		// 	* 3��==> 1��
//
//
//		for (int i = 1; i <= 3; i++) { // �ళ��
//			for (int j = 1; j <= 3; j++) { // �� ����
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
//	} // main�� ��
//
//}
