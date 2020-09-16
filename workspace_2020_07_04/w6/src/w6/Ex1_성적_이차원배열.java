package w6;

import java.util.Scanner;

public class Ex1_성적_이차원배열 {
	
	static final int SI = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);

		 int a[][]=new int[SI][5];
		 String name[] = new String[SI];
		 int kor[] = new int[SI];
		 int eng[] = new int[SI];
		 int tot[] = new int[SI];
		 float avg[] = new float[SI];
		 char grade[] = new char[SI];
		 int maxkor = -999;
		 int mineng = 999;
		 int rn[] = new int[SI];
		 int temp;
		 String tname="@@";
		 char tgrade = '@';
		 float tavg=0.0F;
		 
		 
		 for(int i=0; i<SI; i++) {
			 System.out.printf("#%d)\n",i+1);
			 System.out.print("번호?"); a[i][0]=sc.nextInt();
			 System.out.print("이름?"); name[i]=tc.nextLine();
			 System.out.print("국어,영어?"); a[i][1]=sc.nextInt(); a[i][2]=sc.nextInt();
			 a[i][3] = a[i][1]+a[i][2];
			 avg[i] = (float)a[i][3]/2;
			 
			 switch ((int)avg[i]/10) { //(int)99.5F --> 99, 99/10 -->9
				case 10:
				case 9: grade[i]='A';break;
				case 8: grade[i]='B';break;
				case 7: grade[i]='C';break;
				case 6: grade[i]='D';break;	
				default:grade[i]='F';break;
			}//switch
			 
		if(maxkor < a[i][1]) 
			maxkor = a[i][1];
		if(mineng > a[i][2])
			mineng = a[i][2];
		}//for
		 
		 //모든 학생의 총점이 결정된후에 등수 구하기
		 for(int i=0;i<SI;i++) {
			 a[i][4] = 1; //비교전 초기치 1등
			 for(int j=0; j<SI;j++) {
				 if(a[i][3] < a[j][3]) a[i][4]++;
			 }//for j	
		 }//for i
		 
		 System.out.println(" \n                          *성적표* ");
		 System.out.println("번호\t 이름 \t 국어 \t 영어 \t 총점 \t    평균\t  평가 \t 등수");
		 for(int i=0; i<SI; i++) {
			 System.out.printf("%3d \t %s\t",a[i][0],name[i]);
			 	for(int j=1;j<=3;j++) {
			 		System.out.printf("%3d \t",a[i][j]);
			 	}//for j		
			 System.out.printf("%5.1f \t %3c \t %3d\n",avg[i],grade[i],a[i][4]);
		 }//for i
		 
		 System.out.println("-------------------------------------------");
		 System.out.printf("국어 최고점수 : %3d\n",maxkor);
		 System.out.printf("영어 최저점수 : %3d\n",mineng);
		 
//		 //등수순으로 출력하기
		 for(int i=0; i<SI-1;i++) {
			 for(int j=i+1;j<SI;j++) {
				 if(a[i][4] > a[j][4]) { // 5>1 
					
					tname = name[i]; name[i] = name[j]; name[j] = tname;
					tavg = avg[i]; avg[i] = avg[j]; avg[j] = tavg;
					tgrade = grade[i]; grade[i] = grade[j]; grade[j] = tgrade;
					
					for(int k=0;k<a[i].length ;k++) {
						temp = a[i][k]; a[i][k] = a[j][k]; a[j][k] = temp;
					}//for k
//					temp = a[i][0]; a[i][0] = a[j][0]; a[j][0] = temp;
//					temp = a[i][1]; a[i][1] = a[j][1]; a[j][1] = temp;
//					temp = a[i][2]; a[i][2] = a[j][2]; a[j][2] = temp;
//					temp = a[i][3]; a[i][3] = a[j][3]; a[j][3] = temp;
//					temp = a[i][4]; a[i][4] = a[j][4]; a[j][4] = temp;
				 }//if
			 }//for j
		 }//for i
		 
		 System.out.println(" \n                          *성적표(등수순)* ");
		 System.out.println("번호\t 이름 \t 국어 \t 영어 \t 총점 \t    평균\t  평가 \t 등수");
		 for(int i=0; i<SI; i++) {
			 System.out.printf("%3d \t %s\t",a[i][0],name[i]);
			 	for(int j=1;j<=3;j++) {
			 		System.out.printf("%3d \t",a[i][j]);
			 	}//for j		
			 System.out.printf("%5.1f \t %3c \t %3d\n",avg[i],grade[i],a[i][4]);
		 }//for i
		 
		 sc.close();tc.close();
		

	}

}
