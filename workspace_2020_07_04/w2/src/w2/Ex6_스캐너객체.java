package w2;

/*
 * a와 b를 입력하여 변수에 할당 후 아래처럼 나타내기
 * 정수 a를 입력 : 123
 * 정수 b를 입력 : 21
 * -----------------
 * a + b = xxx
 * a - b = xxx
 */

import java.util.Scanner;

public class Ex6_스캐너객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//new연산자가 생성함수로 Scanner객체를 생성후, 그 위치 정보를 
		//Scanner객체 레퍼런스변수에게 반환
		
		while(true) {
		System.out.print("정수 a를 입력 : "); 	int a = sc.nextInt(); // 객체레퍼런스.메소드();
		System.out.print("정수 b를 입력 : ");    int b = sc.nextInt(); // 객체레퍼런스.메소드();
		System.out.print("글자 c를 입력 : ");    String c = sc.next(); // 객체레퍼런스.메소드();
		
		if(a == b) 
			break;
		System.out.println("---------------");
		System.out.printf("a +b : %d\n",a+b);
		System.out.printf("a -b : %d\n",a-b);
		System.out.printf("c : %s\n\n",c);
		}// while
		
		System.out.println("작업을 종료합니다.");
		sc.close(); //닫기
		
	}

}


/*
 * 반복문 - while
 * 형식)
 * while(조건식) {
 * 문장1;
 * 문장2;
 * }
 * ...
 * 조건식을 만족하면 while의 {}안을 실행후, while의 조건식으로 분기
 * 조건식을 만족못하면 while의 {}이후의 문장을 실행
 * 
 * 반복문안에서 break
 * break를 만나면 반복문을 벗어나게 함
 * 
 * 단순 if
 * if(조건식)
 * {참1; 참2;}
 * ...
 * 조건식을 만족하면 참을 실행
 * 조건식을 만족못하면 단순if 다음문을 실행
 * 
 * 관계연산자 : >,>=,<,<=,==(같다),!=(같지않다)
 */