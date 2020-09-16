package w6;

import java.util.Scanner;

public class Ex2_판매_이차원배열 {

	static final int CN=3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		
		String copn[][]=new String[CN][2];
		int a[][] = new int[CN][3];
		int totsu = 0;
		int totkum = 0;
		int temp = 0;
		String tcopn="@@@";
		
		for(int i=0; i<CN; i++) { //5번 입력을 받기위해
			System.out.printf("%d번째 data입력 -->", i+1);
			System.out.print("코드? "); copn[i][0]=sc.next();
			System.out.print("\t\t 수량? "); a[i][0]=sc.nextInt();
			
				switch( copn[i][0].toLowerCase()) {
					case "a": copn[i][1]="지우개";a[i][1]=800;break;
					case "b": copn[i][1]="노트";a[i][1]=2000;break;
					case "c": copn[i][1]="연필";a[i][1]=1200;break;
					case "d": copn[i][1]="볼펜";a[i][1]=2100;break;		
					default:copn[i][1]="샤프";a[i][1]=4500;break;
				}//switch
				
		      a[i][2] = a[i][0]*a[i][1];
		      totsu += a[i][0];
		      totkum += a[i][2];
				
		}//for
		System.out.println(" \n                     *판매보고서*");
		System.out.println("코드     \t  품명 \t          수량 \t        단가 \t        금액");
		
		for(int i=0; i<CN; i++) { //5개의 입력받은것을 보여주기위해 
			System.out.printf("%3s \t %s \t",copn[i][0],copn[i][1]);
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%8d\t",a[i][j]);
			}//for j
			System.out.printf("\n");
		}//for i
		
		System.out.printf("수량의 총계 : %8d\n",totsu);
		System.out.printf("금액의 총계 : %8d\n",totkum);
		//품명순으로 정렬하기
		for(int i=0; i<CN-1;i++) {
			for(int j=i+1;j<CN;j++) {
				if(copn[i][1].compareTo(copn[j][1])>0) { //"지우개" > "노트"
					// 바꾸기
					tcopn = copn[i][0];copn[i][0] = copn[j][0];copn[j][0] = tcopn;
					tcopn =copn[i][1];copn[i][1] = copn[j][1];copn[j][1] = tcopn;
					temp = a[i][0];a[i][0] = a[j][0];a[j][0] = temp;
					temp = a[i][1];a[i][1] = a[j][1];a[j][1] = temp;
					temp = a[i][2];a[i][2] = a[j][2];a[j][2] = temp;
				}//if
			}// for j
		}//for i
		System.out.println(" \n                     *판매보고서(품명순)*");
		System.out.println("코드     \t  품명 \t          수량 \t        단가 \t        금액");
		
		for(int i=0; i<CN; i++) { //5개의 입력받은것을 보여주기위해 
			System.out.printf("%3s \t %s \t",copn[i][0],copn[i][1]);
			for(int j=0;j<a[i].length;j++) {
				System.out.printf("%8d\t",a[i][j]);
			}//for j
			System.out.printf("\n");
		}//for i
		
		sc.close();
	}

}
