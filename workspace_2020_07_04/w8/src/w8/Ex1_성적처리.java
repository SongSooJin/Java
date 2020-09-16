package w8;

import java.util.Scanner;

public class Ex1_성적처리 {
	 	//프로그램 로드 전에 이미 메모리에 잡혀있음 
		static Scanner sc = new Scanner(System.in);  
		static Scanner tc = new Scanner(System.in);  
		//전역의 스캐너객체 생성및 선언 
		//전역설정 스캐너는 프로그램 종료시 같이 종료 따라서 따로 닫을 필요는 없다.
		static Sungjuk p[] = new Sungjuk[10];
		static Sungjuk won[] = new Sungjuk[10];
		// 전역으로 객체 레퍼런스 배열의 선언
		static int inx=0; // 전역으로 첨자변수 선언 
		
		 static void menu() {
			 System.out.println();
			 System.out.println(" --메뉴--");
			 System.out.println("1. 기본data입력");
			 System.out.println("2. 기본data입력");
			 System.out.println("3. 성적표 출력");
			 System.out.println("4. 번호표 출력");
			 System.out.println("5. 성적표 출력(등수순)");
			 System.out.println("6. 작업종료");
			 System.out.println();
		 }
		
		 static void baseInput(){		
				System.out.println("#기본data입력 작업입니다.");
				int hno;
		        while(true) { 
					System.out.print("번호? ");  hno=sc.nextInt();
					boolean sw=false;//중복번호 체크전 초기치 
					for(int i=0;i<inx;i++) {
						if(p[i].getHno() == hno) {
							System.out.print("\t중복번호임! ... 다시 ");
							sw=true;break;
						}
					}//for
					if(sw) continue;
					else 
						break;
		        }//while 
				System.out.print("이름? "); String name=tc.nextLine();
				System.out.print("국어, 영어?? ");int kor=sc.nextInt();
				int eng=sc.nextInt();		
				p[inx]=new Sungjuk(hno,name,kor,eng);
				p[inx].calc();//p[0],p[1],p[2]
				rank();	
				won[inx]=p[inx];
				inx++;//3
				System.out.println("#기본data입력 작업완료.");
			}
			static void rank(){
				for(int i=0;i<=inx ;i++) {
					int soon=1;//비교전 1등
					for(int j=0;j<=inx;j++) {
						if( p[i].getTot() <  p[j].getTot() ) soon++;
					}//for j
					p[i].setRn(soon);
				}//for i
			}
			static void baseOutput(){
				System.out.println("#기본data출력 작업입니다.");
				if(inx==0) {
					System.out.println("\t생성객체 없으므로 ... #기본data출력 작업불가!!!");
					return;// baseOutput()호출위치로 복귀!!!
				}
				System.out.println("번호\t이름\t국어\t영어");
				for(int i=0;i<inx;i++) {
					won[i].disp1();
					System.out.println();
				}
				System.out.println("#기본data출력 작업완료.");
			}
			static void scoreReport(){
				System.out.println("#성적표 출력 작업입니다.");
				if(inx==0) {
					System.out.println("\t생성객체 없으므로 ... #성적표 출력 작업불가!!!");
					return;// scoreReport()호출위치로 복귀!!!
				}		
				System.out.println("번호\t이름\t국어\t영어\t총점\t평균\t평가\t등수");
				for(int i=0;i<inx;i++) {
					won[i].disp1();
					won[i].disp2();
				}
				System.out.println("#성적표 출력 작업완료.");
			}
			static void hno_Inq(){
				System.out.println("#번호로 조회 작업입니다.");
				if(inx==0) {
					System.out.println("\t생성객체 없으므로 ... #번호로 조회 작업불가!!!");
					return;// hno_Inq()호출위치로 복귀!!!
				}		
				System.out.print("조회 번호? ");int hno=sc.nextInt();
				int i;
				for( i=0;i<inx;i++) {
					if(p[i].getHno()==hno) break;
				}		
				if(i == inx) {
					System.out.println("\t조회번호는 존재하지 않아요.");
					return;
				}
				else {
					System.out.println("번호\t이름\t국어\t영어\t총점\t평균\t평가\t등수");
					p[i].disp1();
					p[i].disp2();
				}
				System.out.println("#번호로 조회 작업완료.");
			}
			static void rn_sort_scoreReport(){
				System.out.println("#성적표 출력(등수순) 작업입니다.");
				if(inx==0) {
					System.out.println("\t생성객체 없으므로 ... #성적표 출력(등수순) 작업불가!!!");
					return;// rn_sort_scoreReport()호출위치로 복귀!!!
				}	
				//정렬하기
				Sungjuk temp;//주의!!
				for(int i=0;i<inx-1 ;i++) {
					for(int j=i+1;j<inx;j++) {
						if(p[i].getRn() >    p[j].getRn())//2> 1
						{//바꾸기는 레퍼런스의 치환으로!!!
							temp=p[i];
							p[i]=p[j];
							p[j]=temp;
						}
					}//for j
				}//for i
				System.out.println("번호\t이름\t국어\t영어\t총점\t평균\t평가\t등수");
				for(int i=0;i<inx;i++) {
					p[i].disp1();
					p[i].disp2();
				}		
				System.out.println("#성적표 출력(등수순) 작업완료.");
			}
			public static void main(String[] args) {		
				while(true) {
					menu();
					System.out.print("작업선택? ");int jobNo=sc.nextInt();
					switch(jobNo) {
						case 1:baseInput();break;
						case 2:baseOutput();break;
						case 3:scoreReport();break;
						case 4:hno_Inq();break;
						case 5:rn_sort_scoreReport();break;
						default:System.out.println("작업을 종료합니다.");
						             return;
					}//switch
				}//while 
				
	}

}


/*
  --메뉴--
1. 기본data입력
2. 기본data입력
3. 성적표 출력
4. 번호표 출력
5. 성적표 출력(등수순)
6. 작업종료
작업선택? 1
#기본data 작업입니다.
번호? 11-11  
이름? 홍 길 동
국어,영어? 100 100
#기본data 작업완료.
메뉴보이고
작업선택? 1
#기본data 작업입니다.
번호? 11  (중복번호x)
    중복번호임! ... 다시 번호? 11
    중복번호임! ... 다시 번호? 11
    중복번호임! ... 다시 번호? 22
이름? 이이
국어,영어? 50 100
#기본data 작업완료.
메뉴보이고
작업선택? 2
#기본data 출력 작업입니다.
번호   이름    국어   영어
111
... 
#기본data 출력 작업완료
메뉴보이고
작업선택? 3
#성적표 출력 작업입니다.
번호   이름  국어   영어   총점    평군   평가    등수
11
...
#성적표 작업완료.
메뉴보이고
작업선택? 4
#번호로 조회 작업입니다.
번호? 11 (없는 번호x)
번호   이름  국어   영어   총점    평군   평가    등수
11
...
#번호로 조회 작업완료.
메뉴보이고
작업선택? 5
#성적표 출력(등수순) 작업입니다.
번호   이름  국어   영어   총점    평군   평가    등수
xx

....
#성적표 출력(등수순) 작업완료.
메뉴보이고
작업선택? 9
작업을 종료합니다.



 
*/