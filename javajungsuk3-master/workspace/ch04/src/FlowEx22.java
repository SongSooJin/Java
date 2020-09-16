//class FlowEx22 {
//	public static void main(String[] args) { 
//		// [] : 배열(Array), 배열도 객체다.
//		// 배열은 다수의 데이터를 보관 할 수 있는데 , 선언시 설정한 자료형의 데이터만 보관 할 수 있다.
//		// new 설계도() 처럼 선언하지 않고 만드는 객체 2가지 기억하나요?
//		// String name = "홍길동";
//		
//		int[] arr = {10,20,30,40,50};
//		int sum = 0;
//	
//		for(int i=0;i<arr.length;i++) { // i<5   0,1,2,3,4
//			// 배열을 참조하는 변수 [인덱스] : 인덱스는 0부터 시작한다.
//			System.out.printf("%d ", arr[i]);
//		}
//		System.out.println();		
//
//		// 진보된 for문은 회전수를 제어하는 변수(i)가 필요없다. 배열의 길이만큼 자동으로 회전한다.
//		for(int tmp : arr) {
//			System.out.printf("%d ", tmp);
//			sum += tmp;
//		}
//		System.out.println();		
//		System.out.println("sum="+sum);
//	} // main의 끝
//}
