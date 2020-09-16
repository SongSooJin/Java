package w5;

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
 * 
 * *     *판매보고서(등수순)*
 * 코드  품명   수량   단가     금액
 *		  노트
 * 		  볼펜.. 
 * 
 */

import java.util.Scanner;


public class Ex10_판매_품명순 {
	
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
		int temp = 0;
		String tcopn="@@@";
		
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
		//품명순으로 정렬하기
		for(int i=0; i<CN-1;i++) {
			for(int j=i+1;j<CN;j++) {
				if(pname[i].compareTo(pname[j])>0) { //"지우개" > "노트"
					// 바꾸기
					tcopn = pname[i];pname[i] = pname[j];pname[j] = tcopn;
					tcopn = code[i];code[i] = code[j];code[j] = tcopn;
					temp = su[i];su[i] = su[j];su[j] = temp;
					temp = dan[i];dan[i] = dan[j];dan[j] = temp;
					temp = kum[i];kum[i] = kum[j];kum[j] = temp;
				}//if
			}// for j
		}//for i
		System.out.println(" \n                     *판매보고서(품명순)*");
		System.out.println("코드 \t 품명 \t 수량 \t 단가 \t    금액");
		
		for(int i=0; i<CN; i++) { //5개의 입력받은것을 보여주기위해 
			System.out.printf("%3s \t %3s \t %3d \t %4d \t %8d\n",
					code[i],pname[i],su[i],dan[i],kum[i]);
		}//for
		
		sc.close();
		
	}

}
