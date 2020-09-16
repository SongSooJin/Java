//import java.util.Arrays;
//
//public class ArrayManager {
//	
//
//		private int[][] ary;
//
//		public ArrayManager() {}
//
//		public ArrayManager(int length) {
//			ary = new int[length][length];
//		}
//
//		public int[][] getAry() {
//			return ary;
//		}
//
//		public void setAry(int[][] ary) {
//			this.ary = ary;
//		}
//
//		public int findMaxNumber() {
//			
//			// 여기에 코드를 작성하세요.
//			   int max = ary[0][0];
//	
//			for (int i = 0; i<3; i++) {
//				for (int j=0; j<3; j++) {
//					  if (ary[i][j] > max)
//						  max = ary[i][j];
//
//				}
//			}
//			
//			return max;
//		}
//
//		public void print() {
//			for (int i = 0; i < ary.length; i++) {
//				System.out.println(Arrays.toString(ary[i]));
//			}
//		}
//	}
//
//
//
