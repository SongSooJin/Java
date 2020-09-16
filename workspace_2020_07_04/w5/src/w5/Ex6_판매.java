package w5;

import java.util.Scanner;

/*
 * 5개의 기본자료를 입력하여 배열객체에 할당후, 조건에 따라 처리후 출력
 * 1번째 data입력  --> 코드 ? a
 *  						   수량? 10
 * 2번째 data입력  --> 코드 ? b
 *  						   수량? 30
 * 3번째 data입력  --> 코드 ? c
 *  						   수량? 90
 * ...
 *     *판매보고서*
 * 코드 품명 수량 단가 금액
 * a...
 * b...
 * ...
 * -------------------- 
 * 수량의 총계  : xxx
 * 금액의 총계 : xxx      
 */

public class Ex6_판매 {
	
	static final int CN=5;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String code[]=new String[CN];
		String pname[]=new String[CN];
		int su[] = new int[CN];
		int dan[] = new int[CN];
		int kum[] = new int[CN];
		int totsu = 0;
		int totkum = 0;
		
		for(int i=0; i<CN; i++) { //5번 입력을 받기위해
			System.out.printf("%d번째 data입력 -->", i+1);
			System.out.print("코드? "); code[i]=sc.next();
			System.out.print("\t\t 수량? "); su[i]=sc.nextInt();
			
				switch( code[i].toLowerCase()) {
					case "a": pname[i]="지우개";dan[i]=800;break;
					case "b": pname[i]="노트";dan[i]=2000;break;
					case "c": pname[i]="연필";dan[i]=1200;break;
					case "d": pname[i]="볼펜";dan[i]=2100;break;		
					default:pname[i]="샤프";dan[i]=4500;break;
				}//switch
				
		      kum[i] = su[i]*dan[i];
		      totsu += su[i];
		      totkum += kum[i];
				
		}//for
		System.out.println(" \n                     *판매보고서*");
		System.out.println("코드 \t 품명 \t 수량 \t 단가 \t    금액");
		
		for(int i=0; i<CN; i++) { //5개의 입력받은것을 보여주기위해 
			System.out.printf("%3s \t %3s \t %3d \t %4d \t %8d\n",
					code[i],pname[i],su[i],dan[i],kum[i]);
		}//for
		System.out.printf("수량의 총계 : %8d\n",totsu);
		System.out.printf("금액의 총계 : %8d\n",totkum);
		sc.close();
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
