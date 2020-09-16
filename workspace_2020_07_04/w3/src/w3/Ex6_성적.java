package w3;

import java.util.Scanner;

/*
 * 4개의 기본값을 입력하여 변수에 할당후, 아래처럼 출력
 * 비고는 평균이 85이상이면 집으로... 그외는 면담요망!의 문자열을 출력
 * 이름? 홍 길 동
 * 시험지 유형? a
 * 국어, 영어?? 95 100
 * ------------------
 * 이름:xxx 시험지 유형:x(대문자)
 * 국어:xxx 영어:xxx
 * 총점:xxx 평균:xxx.x
 * 비고:xxx
 * ...
 * 이름? 아무런 입력없이 enter key누르면 종료
 * 작업종료
 * */

public class Ex6_성적 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		
		String bigo="",line = "-------------------";
		
		while(true) {
			System.out.print("이름? "); String name = sc.nextLine();
			// nextLine() : 입력받는 값에 공백이 있다면 허용하는 메소드 , \n전까지의 모든 문자열을 name에 할당
			// 반복문을 쓸경우 \n이 적용되어 다음 입력받는것으로 실행되기 때문에 입력을 두개 받는다.
			
			// if(name == "") break; 무시 error
		    if(name.equals("")) break;
			System.out.print("시험지유형? ");
			String ty=tc.next();
			// 스캐너 객체의 메소드의 반환값이 char형은 없다.
			System.out.print("국어,영어?? "); 
			int kor = tc.nextInt(); 
			int eng = tc.nextInt();
			
			int tot = kor+eng;
			float avg = tot/2.0f;
			
			bigo=(avg>=85)?"집으로..":"면담요망!";
	//			if(avg>=85)
	//				bigo="집으로..";
	//			else
	//				bigo="면담요망!";
				
			
			System.out.println(line);
			System.out.printf("이름: %s\t시험지유형: %s\n",name,ty.toUpperCase());
			// toUpperCase() : 문자열을 대문자로 변환 함수 , toLowerCase() : 문자열을 소문자로 변환 함수
			System.out.printf("국어: %3d \t영어: %3d\n",kor,eng);
			System.out.printf("총점: %3d \t평균: %5.1f\n",tot,avg);
			System.out.printf("비고: %s\n\n",bigo);
			
		}// while
		
		System.out.println("작업종료");
		sc.close();
		tc.close();
		
		
	}

}
