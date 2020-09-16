package w3;

import java.util.Scanner;

/*
 * 평가는 점수가 90이상이면 A, 80이상이면 B, 70이상이면 C, 60이상이면 D, 60미만이면 F를 부여
 * 점수? 94
 * 점수 : 94 평가 : A
 * 점수 ? 105
 * 점수의 입력범위(0~100)오류.. 다시 점수? -1
 * 점수의 입력범위(0~100)오류.. 다시 점수? 105
 * 점수의 입력범위(0~100)오류.. 다시 점수? 85
 * 점수 : 94 평가 : B
 * ...
 * 점수가 -999(음수)이면
 * 종료합니다.
 */

public class Ex13_평가 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char grade = '@';
		
		while(true) {
			System.out.print("점수? ");
			int score = sc.nextInt();
			
			if(score==-999) break;
			if(score<0 || score>100) {
				System.out.print("\t점수의 입력범위(0~100)오류... 다시 ");
				continue; //while의 조건식으로 분기 
			}
					switch(score/10) { // 99/10 --> 9, 90/10 --> 9
					case 10:
					case 9:grade = 'A';break; // 90~99
					case 8:grade = 'B';break; // 80~89
					case 7:grade = 'C';break; // 70~79
					case 6:grade = 'D';break; // 60~69
					default:grade = 'F';break; // 0~59
					}
			
//					if(score>=90)
//						grade  = 'A';
//					else if (score >=80)
//						grade = 'B';
//					else if (score >=70)
//						grade = 'C';
//					else if (score >=60)
//						grade = 'D';
//					else 
//						grade = 'F';
			
				System.out.printf("점수 : %3d \t 평가 : %c\n\n",score,grade);
				
		}//while
		
		System.out.println("종료합니다.");
		sc.close();
		
		
	}

}
