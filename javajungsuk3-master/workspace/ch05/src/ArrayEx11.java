////5-11
//import java.util.Arrays;
//
//class ArrayEx11 {
//	public static void main(String[] args) {
//		int[] numArr  = new int[10];
//		int[] counter = new int[10]; // 배열은 객체고 객체의 멤버변수는 자료형 따라 자동으로 초기화 된다.
//		
//		System.out.println(Arrays.toString(counter));
//
//		for (int i=0; i < numArr.length ; i++ ) {
//			numArr[i] = (int)(Math.random() * 10); // 0~9의 임의의 수를 배열에 저장
//		//	System.out.print(numArr[i]);
//		}
//		System.out.println(Arrays.toString(numArr));
//
//		for (int i=0; i < numArr.length ; i++ ) {
//			counter[numArr[i]]++;
//		}
//
//		for (int i=0; i < numArr.length ; i++ ) {
//			System.out.println( i +"의 개수 :"+ counter[i]);
//		}
//	} // main의 끝
//}
