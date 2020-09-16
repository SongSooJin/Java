////5-1
//class ArrayEx01 {
//	public static void main(String[] args) { 
//		
//		// 배열()
//		// 같은 자료형의 데티어 여러개를 허ㅏ하나로 몪어서 다루는 객체입니다.
//
//		
//		String[] names = new String[3]; // 배열 선언시 반드시 보관하는 게이터
//		names[0] = "Spring";
//		names[1] = "Summer";
//		names[2] = "Autumn";
//		
//		//Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
//			//Duplicate local variable names
//		names[3]= "x";
//
//		
//		int[] score = new int[5];
//		int k = 1;
//
//		score[0] = 50;
//		score[1] = 60;
//		score[k+1] = 70;   // score[2] = 70
//		score[3] = 80;
//		score[4] = 90;
//
//		int tmp = score[k+2] + score[4];  // int tmp = score[3] + score[4]
//
//	    // for문으로 배열의 모든 요소를 출력한다.
//		for(int i=0; i < 5; i++) {
//			System.out.printf("score[%d]:%d%n",i, score[i]);		
//		}
//
//		System.out.printf("tmp:%d%n", tmp);
//		System.out.printf("score[%d]:%d%n",7,score[7]); //index의 범위를 벗어난 값
//	} // main
//}
