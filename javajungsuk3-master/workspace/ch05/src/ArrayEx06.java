////5-6
//class ArrayEx06 { 
//	public static void main(String[] args) { 
//	//	example();
//		
//		//문제 : 고객의 주문 
//		int[] score = { 79, 88, 91, 33, 100, 55, 95}; 
//		
//		// 중간 처리 코드를 작성하여 프로그램을 완성하시오.
//		int max = Integer.MIN_VALUE;
//		int min = Integer.MAX_VALUE;
//		
//		for (int i=0; i<=score.length; i++) {
//			
//			if (score[i] > max) { // 배열에서 꺼낸 값이 max보다 크면, 그 큰값을 max에 넣는다.
//				max = score[i];
//			}
//			if(score[i] < min) { // 배열에서 꺼낸 값이 min값보다 작으면 , 그 작은 값을 main에 담는다.
//				min = score[i];
//			}
//			
//		}
//	
//		System.out.println("최대값 :" + max);       
//		System.out.println("최소값 :" + min);  
//		
//		
//	}
//	private static void example() {
//		// TODO Auto-generated method stub
//		int[] score = { 79, 88, 91, 33, 100, 55, 95}; 
//
//		int max = score[0]; // 배열의 첫 번째 값으로 최대값을 초기화 한다. 
//		int min = score[0]; // 배열의 첫 번째 값으로 최소값을 초기화 한다. 
//
//		for(int i=1; i < score.length;i++) {
//			if(score[i] > max) {
//				/// max가 가진 값보다 score[i]가 가진값이 크면 그 큰값을 max에 할당한다.
//				max = score[i];	
//			} 
//			
//			else if(score[i] < min) { 
//				min = score[i]; 
//			} 
//			
//		} // end of for 
//
//		System.out.println("최대값 :" + max);       
//		System.out.println("최소값 :" + min);       
//	} // end of main 
//
//} // end of class 
