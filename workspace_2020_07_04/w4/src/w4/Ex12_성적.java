package w4;

import java.util.Scanner;

/*
 * 이름? 홍 길 동
 * 국어,영어? 100 100
 * -----------------
 * 이름 : xxx
 * 평균 : xxx   평가  : xxx
 * 
 *     계속하시겠습니까?(Y/y/N/n) a
 *     계속하시겠습니까?(Y/y/N/n) b
 *     계속하시겠습니까?(Y/y/N/n) Y
 * 이름? 
 * ...
 * 계속하시겠습니까?(Y/y/N/n) N 
 * 작업 종료
 *  
 */

public class Ex12_성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);

		while(true) {
			System.out.printf("이름? ");
			String name = sc.nextLine();
			System.out.println("국어, 영어? ");
			int kor = tc.nextInt(); int eng = tc.nextInt();
			
			float avg = (float)(kor+eng)/2; //== (kor+eng)/2.0f;
			char grade='@';
			
				switch((int)avg/10) {
					case 10:
					case	 9:grade='A';break;
					case	 8:grade='B';break;
					case	 7:grade='C';break;
					case	 6:grade='D';break;
					default:grade='F';break;
				}//switch (평가)
			
			System.out.println("---------------------------------");
			System.out.printf("이름: %s\n",name);
			System.out.printf("평균 : %5.1f \t 평가: %c\n\n",avg,grade);
			String ch = "@";
			
				do {
				System.out.print("계속하시겠습니까?(Y/y/N/n)");
				
				ch = tc.next().toLowerCase();
				}while(ch.equals("y") ==false && ch.equals("n")==false);
			if(ch.equals("n")) break;
			
			
		}//while
		System.out.println("종료");
		sc.close();
		tc.close();
	}

}
