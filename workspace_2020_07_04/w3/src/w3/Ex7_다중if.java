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

public class Ex7_다중if {

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
					if(score>=90)
						grade  = 'A';
					else if (score >=80)
						grade = 'B';
					else if (score >=70)
						grade = 'C';
					else if (score >=60)
						grade = 'D';
					else 
						grade = 'F';
			
				System.out.printf("점수 : %3d \t 평가 : %c\n\n",score,grade);
				
		}//while
		
		System.out.println("종료합니다.");
		sc.close();
	}

}


/*
 * 다중if
 * 
 * if(조건1)
 * 참1;
 * else if(조건2)
 * 참2;
 * else if(조건3)
 * 참3;
 * else
 * 문장;
 *...
 *조건1을 만족하면 참1을 실행후 다중if 다음문을 실행
 *조건1을 만족못하면 조건2를 만족하는지 ? 
 *			조건2를 만족하면 참2실행후 다중if 다음문을 실행
 * 			조건2를 만족못하면 조건3을 만족하는지?
 * ...
 * 위의 열거조건을 만족못하면 else 이하의 문장을 실행
 * 
 * 
 * 논리 연산자 : ! && || ^(배타적or)
 * 1) 조건1 || 조건2 || 조건3 : 열거 조건중 하나라도 참이면 참
 * 2) 조건1 && 조건2 && 조건3 : 모든 열거 조건을 만족해야 참
 * 3) !(조건식) : 조건식의 결과가 참이면 거짓으로, 조건식의 결과가 거짓이면 참으로
 * 4) 조건1 ^ 조건2 : 서로의 결과가 달라야 참, 서로의 결과가 같으면 거짓
 * 
 * 
 * 
 * while에서의 continue;
 * continue를 만나면 continue이하는 실행하지 않고, while의 조건식으로 분기 
 * 
 */
