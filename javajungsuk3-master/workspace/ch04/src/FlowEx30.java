////4-30
//class FlowEx30 {
//	public static void main(String[] args) { 
//		int sum = 0;
//		int i = 0; ;
//
//		while(true) {
//			if(sum > 100) {
//				break; //가장 가까운 반복문을 탈출하는 것을 의미
//			}
//			++i; // i = i+1;			1,2,3...
//			sum += i; // sum = sum+i;	1,3,6...
//		} // end of while
//
//		System.out.println("i=" + i);
//		System.out.println("sum=" + sum);
//
//		// 1,2,3...100 까지의 정수중에 홀수의 합을 출력하시오.
//		// 0+1+2+3...=99+100
//		// for문 / while문으로 구해보세요.
//		int hap = 0;
//		for(int j = 1; j<=100; j++) {
//			// hap = 0 + 1
//			// hap = 1 + 2
//			// hap = 3 + 3
//			// hap = 6 + 4
//			if( j %2==1) {
//				hap += j;
//			}
//		}
//		System.out.println("hap=" + hap);
//		
//		
//		
//		// 1,2,3....100 까지의 정수중에 3의 배수가 몇개인지 출력하시오.
//		
//		int count = 0;
//		for(int j = 1; j<=100; j++) {
//			System.out.println(j % 3);
//			if( j %3==0) {
//				count++;
//			}
//		}
//		System.out.println("hap=" + hap);
//		
//	}   
//	
//}
