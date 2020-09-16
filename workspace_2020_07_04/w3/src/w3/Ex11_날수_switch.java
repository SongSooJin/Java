package w3;

import java.util.Scanner;

/*
 * 월을 입력받고, 월에 해당하는 날수를 분류하고, 아래처럼 출력
 * 월? 5
 * 5월은 31일까지이다.
 * 월? 2
 * 2월은 28일까지이다.
 * ...
 * 월? 13
 * 	   월의 입력범위(1~12)오류...다시 월? 13
 * 	   월의 입력범위(1~12)오류...다시 월? -1
 * 	   월의 입력범위(1~12)오류...다시 월? 4
 * 4월은 30일까지이다.
 * 월? -999를 입력시
 * 종료
 * 
 */
public class Ex11_날수_switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int days = 0;
		
		while(true) {
			System.out.print("월? ");
			int month = sc.nextInt();
			
			if(month==-999) break;
			//if(month<1 || month>12) {
			// 연산우선순위 : 관계연산자 > 논리연산자, 논리연산자 우선순위 : ! > &&> || 
			if( !(month>=1 && month<=12)){
				System.out.print("\t월의 입력범위(1~12)오류... 다시 ");
				continue;
			}
			
			switch(month) {
			case 2:days = 28;break;
			case 4:
			case 6:
			case 9:
			case 11:days = 30;break;
			default:days = 31;
			}//switch
			
//				if(month==2)
//					days = 28;
//				else if (month==4 || month==6 || month==9 || month==11)
//					days = 30;
//				else
//					days = 31;
				
				System.out.printf("%2d월은 %d일 까지이다.\n\n",month,days);
		}//while
		
		System.out.println("종료");
		sc.close();
		
		
	}

}


/*
28일 : 2월
30일 : 4,6,9,11월
31일 : 1,3,5,7,8,10,12월
*/


/*
 * switch~case : 다중if의 대부분은 switch로 구현 가능
 * 형식) switch(조건식) {
 * 	case 값1 : 문1;break;
 * 	case 값2 : 문2;break;
 * 	case 값3 : 문3;break;
 * ...
 * default:문장;[break;생략가능]
 * 
 * }
 * 
 * 1) 조건식의 결과는 반드시 int,char,String만 가능
 * 2) case다음에는 int형 literal,char형 literal,String형 literal만 가능
 *      주의 : case다음에 올수 없는것 = 실수, 관계연산자, 논리연산자, 열거형연산자(,) 
 * 3) break는 switch{}을 벗어나게 한다 
 * 	    break를 생략시 : 그아래의 문장중 최초로 만나는 break의 앞 문장을 
 * 								무조건 실행후 break를 만나 switch{}문을 벗어남
 * 
 */