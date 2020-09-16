package w7;
import java.util.Scanner;
public class Ex3_계좌관리 {
	static Scanner sc=new Scanner(System.in); //전역의 스캐너객체 생성및 선언 
	static Scanner tc=new Scanner(System.in); 
	static Account p[]=new Account[10];//전역의 객체배열의 레퍼런스 선언  
	static int inx=0;//전역의  첨자변수선언  
	static void menu() {
		System.out.println("\n --메뉴--");System.out.println("1. 계좌개설");
		System.out.println("2. 입금");System.out.println("3. 출금");
		System.out.println("4. 계좌조회");System.out.println("5. 전체 계좌조회");
		System.out.println("6. 작업종료\n");
	}
	static void makeAccid(){		
		System.out.println("#계좌개설 작업입니다.\n");
		boolean sw;String accid="@@@";
     do
     {
			System.out.print("계좌번호? ");accid=sc.next();
			 sw=false;//중복계좌 체크전 초기치 
			for(int i=0;i<inx;i++) {
				if( accid.equals(p[i].getAccid()) ) {
					System.out.print("\t중복계좌임! ... 다시 ");
					sw=true;break;
				}//if
			}//for i			
      }while(sw );
		System.out.print("고 객 명? ");String name=tc.nextLine();
		System.out.print("개설금액? ");long money=sc.nextLong();
		p[inx]=new Account(accid,name,money);
		//System.out.println("inx : "+inx);//p[0],p[1],p[2]
		inx++;//3  	
		System.out.println("#계좌개설 작업완료.");
	}
	static void allInq() {
		System.out.println("#전체 계좌조회 작업입니다.\n");
		if( inx==0 ) {
			System.out.println("\t개설된 계좌가x... #전체 계좌조회 작업불가!!!!");
			return;//allInq()함수의 호출위치로 복귀!!
		}		
		for(int i=0;i<inx;i++) {
			p[i].disp();
		}
		System.out.println("#전체 계좌조회 작업완료.");
	}
	static void oneInq() {
		System.out.println("#계좌조회 작업입니다.\n");
		if( inx==0 ) {
			System.out.println("\t개설된 계좌가x... #계좌조회 작업불가!!!!");
			return;//allInq()함수의 호출위치로 복귀!!
		}		
		System.out.print("조회 계좌번호? ");String accid=sc.next();
		int i;
		boolean sw=false;//찾아보기전 초기치 설정 
			for(i=0;i<inx;i++) {
				if(   accid.equals(  p[i]. getAccid()  )  ) {sw=true;break;}
			}
		if(sw==false) {
			System.out.println("\t조회 계좌는 존재하지 않아요!!!"); 
			return;
		}
		else 
		  p[i].disp();		
		System.out.println("#계좌조회 작업완료.");
	}
	static void ipkum(){
		System.out.println("#입금 작업입니다.\n");
		if( inx==0 ) {
			System.out.println("\t개설된 계좌가x... #입금 작업불가!!!!");
			return;//ipkum()함수의 호출위치로 복귀!!
		}	
		boolean tw=false;long money=0L;
     while(true) {
		System.out.print("계좌번호? ");String accid=sc.next();
		if(tw==false) {
			System.out.print("입 금 액? ");money=sc.nextLong();
		}
		int i;
		boolean sw=false;//계좌찾기전 초기치 
			for( i=0;i<inx;i++) {
				if( accid.equals(  p[i]. getAccid() ) ) {sw=true; break;}
			}//for
		if(sw==false) {
			tw=true;
			System.out.print("\t입금 계좌 존재하지 x... 다시 ");
			continue;
		}
		else {//입금계좌 있음 
			p[i].addMoney(money);			   
	       System.out.printf("\t입금후 잔액 : %d원\n",p[i].getBalance());
	       break;
		  }
     }//while 
	  System.out.println("#입금 작업완료.");
	}
	static void chulkum(){
		System.out.println("#출금 작업입니다.\n");
		if( inx==0 ) {
			System.out.println("\t개설된 계좌가x... #출금 작업불가!!!!");
			return;//chulkum()함수의 호출위치로 복귀!!
		}	
		boolean tw=false;long money=0L;
     while(true) {
		System.out.print("계좌번호? ");String accid=sc.next();
		if(tw==false) {
			System.out.print("출 금 액? ");money=sc.nextLong();
		}
		int i;
		boolean sw=false;//계좌찾기전 초기치 
			for( i=0;i<inx;i++) {
				if( accid.equals(  p[i]. getAccid() ) ) {sw=true; break;}
			}//for
		if(sw==false) {
			tw=true;
			System.out.print("\t출금 계좌 존재하지 x... 다시 ");
			continue;
		}
		else {//출금계좌 있음 
			if(p[i].getBalance() ==0) {
				System.out.printf("\t잔액 :부족, %d원 출금불가!", p[i].getBalance()); 
				return;
			}
			  while( money>p[i].getBalance() ){//출금액>잔액
				System.out.printf("\t잔액부족 출금불가!...지급가능금액 : %d원  다시 ",
						p[i].getBalance()); 
			    System.out.print("출 금 액? ");money=sc.nextLong();			   
			  }//while 
			p[i].minusMoney(money);			   
	       System.out.printf("\t출금후 잔액 : %d원\n",p[i].getBalance());
	       break;
		 }//else
     }//while 
	  System.out.println("#출금 작업완료.");
	}
	public static void main(String[] args) {		     
		while(true) {
			menu();
			System.out.print("작업선택? ");int jNo=sc.nextInt();
			switch( jNo ) {
				case 1:makeAccid();break;
				case 2:ipkum();break;
				case 3:chulkum();break;
				case 4:oneInq();break;
				case 5:allInq();break;
				default: System.out.println("작업을 종료합니다.");				              
				              return;
			}//switch
		}//while 
	}
}


/*
 *   --메뉴--
1. 계좌개설
2. 입금
3. 출금
4. 계좌조회
5. 전체 계좌조회
6. 작업종료
작업선택? 1
#계좌개설 작업입니다.
계좌번호? 11-11  
고 객 명? 홍 길 동
개설금액? 10000
#계좌개설 작업완료.
메뉴보이고
작업선택? 1
#계좌개설 작업입니다.
계좌번호? 11-11  (중복계좌x)
    중복계좌임! ... 다시 계좌번호? 11-11
    중복계좌임! ... 다시 계좌번호? 11-11
    중복계좌임! ... 다시 계좌번호? 22-22
고 객 명? 이이
개설금액? 50000
#계좌개설 작업완료.
메뉴보이고
작업선택? 2
#입금 작업입니다.
계좌번호? 11-11  (없는계좌x)
입 금 액? 5000
    입금후 잔액 : 15000원
#입금 작업완료.
메뉴보이고
작업선택? 3
#출금 작업입니다.
계좌번호? 11-11  (없는계좌x)
출 금 액? 5000   (잔액부족)
    출금후 잔액 : 10000원
#출금 작업완료.
메뉴보이고
작업선택? 4
#계좌조회 작업입니다.
계좌번호? 11-11  (없는계좌x)
계좌번호 : 11-11  고객명 : xxx    잔액 : xxxxxx원
#계좌조회 작업완료.
메뉴보이고
작업선택? 5
#전체 계좌조회 작업입니다.
계좌번호 : 11-11  고객명 : xxx    잔액 : xxxxxx원
....
#전체 계좌조회 작업완료.
메뉴보이고
작업선택? 9
작업을 종료합니다.


 */
