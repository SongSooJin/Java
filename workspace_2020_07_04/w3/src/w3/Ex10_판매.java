package w3;

import java.util.Scanner;

/*
 * 코드? a
 * 수량? 10
 * --------------
 * 코드 : x       품명 : xxx
 * 수량 : x       단가 : xxx     금액 : xxx 
 * 코드? 입력값없이 엔터키를 누르면 종료
 * 
 */

public class Ex10_판매 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		
		String line="------------------";
		String pname="";
		int dan,hap;
		dan=hap=0; //할당순서 우-->좌
		
		while(true) {
			System.out.print("코드? ");
			String code = sc.nextLine();
			if(code.equals("")) break;
			// nextLine():문자열의 입력시 엔터키 누르기전까지의 모든 문자열을 할당
			System.out.print("수량? ");
			int su = tc.nextInt();
			String tcode = code.toLowerCase();
			
				if(tcode.equals("a")) {
					pname = "지우개";
					dan = 800;
				}
				else if(tcode.equals("b")) {
					pname = "노트";
					dan = 2000;
				}
				else if(tcode.equals("c")) {
					pname = "연필";
					dan = 1200;
				}
				else if(tcode.equals("d")) {
					pname = "볼펜";
					dan = 2100;
				}
				else {
					pname = "샤프";
					dan = 4500;
				}
				
			hap = su*dan;
			System.out.println(line);
			System.out.printf("코드 : %3s \t 품명 : %s\n",tcode,pname);
			System.out.printf("수량 : %3d \t 단가 : %4d \t 금액 : %d\n\n",su,dan,hap);
			
		}//while
		
		System.out.println("종료");
		sc.close();
		tc.close();
		
	}

}


/*
 * 코드가 a(A)면 품명은 지우개, 단가 800원
 * 코드가 b(B)면 품명은 노트, 단가 2000원
 * 코드가 c(C)면 품명은 연필, 단가 1200원
 * 코드가 d(D)면 품명은 볼펜, 단가 2100원
 * 그 외의 코드면 품명은 샤프, 단가 4500원
 * 금액 = 수량 * 단가
 */