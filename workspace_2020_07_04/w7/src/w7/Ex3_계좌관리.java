package w7;
import java.util.Scanner;
public class Ex3_���°��� {
	static Scanner sc=new Scanner(System.in); //������ ��ĳ�ʰ�ü ������ ���� 
	static Scanner tc=new Scanner(System.in); 
	static Account p[]=new Account[10];//������ ��ü�迭�� ���۷��� ����  
	static int inx=0;//������  ÷�ں�������  
	static void menu() {
		System.out.println("\n --�޴�--");System.out.println("1. ���°���");
		System.out.println("2. �Ա�");System.out.println("3. ���");
		System.out.println("4. ������ȸ");System.out.println("5. ��ü ������ȸ");
		System.out.println("6. �۾�����\n");
	}
	static void makeAccid(){		
		System.out.println("#���°��� �۾��Դϴ�.\n");
		boolean sw;String accid="@@@";
     do
     {
			System.out.print("���¹�ȣ? ");accid=sc.next();
			 sw=false;//�ߺ����� üũ�� �ʱ�ġ 
			for(int i=0;i<inx;i++) {
				if( accid.equals(p[i].getAccid()) ) {
					System.out.print("\t�ߺ�������! ... �ٽ� ");
					sw=true;break;
				}//if
			}//for i			
      }while(sw );
		System.out.print("�� �� ��? ");String name=tc.nextLine();
		System.out.print("�����ݾ�? ");long money=sc.nextLong();
		p[inx]=new Account(accid,name,money);
		//System.out.println("inx : "+inx);//p[0],p[1],p[2]
		inx++;//3  	
		System.out.println("#���°��� �۾��Ϸ�.");
	}
	static void allInq() {
		System.out.println("#��ü ������ȸ �۾��Դϴ�.\n");
		if( inx==0 ) {
			System.out.println("\t������ ���°�x... #��ü ������ȸ �۾��Ұ�!!!!");
			return;//allInq()�Լ��� ȣ����ġ�� ����!!
		}		
		for(int i=0;i<inx;i++) {
			p[i].disp();
		}
		System.out.println("#��ü ������ȸ �۾��Ϸ�.");
	}
	static void oneInq() {
		System.out.println("#������ȸ �۾��Դϴ�.\n");
		if( inx==0 ) {
			System.out.println("\t������ ���°�x... #������ȸ �۾��Ұ�!!!!");
			return;//allInq()�Լ��� ȣ����ġ�� ����!!
		}		
		System.out.print("��ȸ ���¹�ȣ? ");String accid=sc.next();
		int i;
		boolean sw=false;//ã�ƺ����� �ʱ�ġ ���� 
			for(i=0;i<inx;i++) {
				if(   accid.equals(  p[i]. getAccid()  )  ) {sw=true;break;}
			}
		if(sw==false) {
			System.out.println("\t��ȸ ���´� �������� �ʾƿ�!!!"); 
			return;
		}
		else 
		  p[i].disp();		
		System.out.println("#������ȸ �۾��Ϸ�.");
	}
	static void ipkum(){
		System.out.println("#�Ա� �۾��Դϴ�.\n");
		if( inx==0 ) {
			System.out.println("\t������ ���°�x... #�Ա� �۾��Ұ�!!!!");
			return;//ipkum()�Լ��� ȣ����ġ�� ����!!
		}	
		boolean tw=false;long money=0L;
     while(true) {
		System.out.print("���¹�ȣ? ");String accid=sc.next();
		if(tw==false) {
			System.out.print("�� �� ��? ");money=sc.nextLong();
		}
		int i;
		boolean sw=false;//����ã���� �ʱ�ġ 
			for( i=0;i<inx;i++) {
				if( accid.equals(  p[i]. getAccid() ) ) {sw=true; break;}
			}//for
		if(sw==false) {
			tw=true;
			System.out.print("\t�Ա� ���� �������� x... �ٽ� ");
			continue;
		}
		else {//�Աݰ��� ���� 
			p[i].addMoney(money);			   
	       System.out.printf("\t�Ա��� �ܾ� : %d��\n",p[i].getBalance());
	       break;
		  }
     }//while 
	  System.out.println("#�Ա� �۾��Ϸ�.");
	}
	static void chulkum(){
		System.out.println("#��� �۾��Դϴ�.\n");
		if( inx==0 ) {
			System.out.println("\t������ ���°�x... #��� �۾��Ұ�!!!!");
			return;//chulkum()�Լ��� ȣ����ġ�� ����!!
		}	
		boolean tw=false;long money=0L;
     while(true) {
		System.out.print("���¹�ȣ? ");String accid=sc.next();
		if(tw==false) {
			System.out.print("�� �� ��? ");money=sc.nextLong();
		}
		int i;
		boolean sw=false;//����ã���� �ʱ�ġ 
			for( i=0;i<inx;i++) {
				if( accid.equals(  p[i]. getAccid() ) ) {sw=true; break;}
			}//for
		if(sw==false) {
			tw=true;
			System.out.print("\t��� ���� �������� x... �ٽ� ");
			continue;
		}
		else {//��ݰ��� ���� 
			if(p[i].getBalance() ==0) {
				System.out.printf("\t�ܾ� :����, %d�� ��ݺҰ�!", p[i].getBalance()); 
				return;
			}
			  while( money>p[i].getBalance() ){//��ݾ�>�ܾ�
				System.out.printf("\t�ܾ׺��� ��ݺҰ�!...���ް��ɱݾ� : %d��  �ٽ� ",
						p[i].getBalance()); 
			    System.out.print("�� �� ��? ");money=sc.nextLong();			   
			  }//while 
			p[i].minusMoney(money);			   
	       System.out.printf("\t����� �ܾ� : %d��\n",p[i].getBalance());
	       break;
		 }//else
     }//while 
	  System.out.println("#��� �۾��Ϸ�.");
	}
	public static void main(String[] args) {		     
		while(true) {
			menu();
			System.out.print("�۾�����? ");int jNo=sc.nextInt();
			switch( jNo ) {
				case 1:makeAccid();break;
				case 2:ipkum();break;
				case 3:chulkum();break;
				case 4:oneInq();break;
				case 5:allInq();break;
				default: System.out.println("�۾��� �����մϴ�.");				              
				              return;
			}//switch
		}//while 
	}
}


/*
 *   --�޴�--
1. ���°���
2. �Ա�
3. ���
4. ������ȸ
5. ��ü ������ȸ
6. �۾�����
�۾�����? 1
#���°��� �۾��Դϴ�.
���¹�ȣ? 11-11  
�� �� ��? ȫ �� ��
�����ݾ�? 10000
#���°��� �۾��Ϸ�.
�޴����̰�
�۾�����? 1
#���°��� �۾��Դϴ�.
���¹�ȣ? 11-11  (�ߺ�����x)
    �ߺ�������! ... �ٽ� ���¹�ȣ? 11-11
    �ߺ�������! ... �ٽ� ���¹�ȣ? 11-11
    �ߺ�������! ... �ٽ� ���¹�ȣ? 22-22
�� �� ��? ����
�����ݾ�? 50000
#���°��� �۾��Ϸ�.
�޴����̰�
�۾�����? 2
#�Ա� �۾��Դϴ�.
���¹�ȣ? 11-11  (���°���x)
�� �� ��? 5000
    �Ա��� �ܾ� : 15000��
#�Ա� �۾��Ϸ�.
�޴����̰�
�۾�����? 3
#��� �۾��Դϴ�.
���¹�ȣ? 11-11  (���°���x)
�� �� ��? 5000   (�ܾ׺���)
    ����� �ܾ� : 10000��
#��� �۾��Ϸ�.
�޴����̰�
�۾�����? 4
#������ȸ �۾��Դϴ�.
���¹�ȣ? 11-11  (���°���x)
���¹�ȣ : 11-11  ���� : xxx    �ܾ� : xxxxxx��
#������ȸ �۾��Ϸ�.
�޴����̰�
�۾�����? 5
#��ü ������ȸ �۾��Դϴ�.
���¹�ȣ : 11-11  ���� : xxx    �ܾ� : xxxxxx��
....
#��ü ������ȸ �۾��Ϸ�.
�޴����̰�
�۾�����? 9
�۾��� �����մϴ�.


 */
