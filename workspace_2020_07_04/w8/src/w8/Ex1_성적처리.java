package w8;

import java.util.Scanner;

public class Ex1_����ó�� {
	 	//���α׷� �ε� ���� �̹� �޸𸮿� �������� 
		static Scanner sc = new Scanner(System.in);  
		static Scanner tc = new Scanner(System.in);  
		//������ ��ĳ�ʰ�ü ������ ���� 
		//�������� ��ĳ�ʴ� ���α׷� ����� ���� ���� ���� ���� ���� �ʿ�� ����.
		static Sungjuk p[] = new Sungjuk[10];
		static Sungjuk won[] = new Sungjuk[10];
		// �������� ��ü ���۷��� �迭�� ����
		static int inx=0; // �������� ÷�ں��� ���� 
		
		 static void menu() {
			 System.out.println();
			 System.out.println(" --�޴�--");
			 System.out.println("1. �⺻data�Է�");
			 System.out.println("2. �⺻data�Է�");
			 System.out.println("3. ����ǥ ���");
			 System.out.println("4. ��ȣǥ ���");
			 System.out.println("5. ����ǥ ���(�����)");
			 System.out.println("6. �۾�����");
			 System.out.println();
		 }
		
		 static void baseInput(){		
				System.out.println("#�⺻data�Է� �۾��Դϴ�.");
				int hno;
		        while(true) { 
					System.out.print("��ȣ? ");  hno=sc.nextInt();
					boolean sw=false;//�ߺ���ȣ üũ�� �ʱ�ġ 
					for(int i=0;i<inx;i++) {
						if(p[i].getHno() == hno) {
							System.out.print("\t�ߺ���ȣ��! ... �ٽ� ");
							sw=true;break;
						}
					}//for
					if(sw) continue;
					else 
						break;
		        }//while 
				System.out.print("�̸�? "); String name=tc.nextLine();
				System.out.print("����, ����?? ");int kor=sc.nextInt();
				int eng=sc.nextInt();		
				p[inx]=new Sungjuk(hno,name,kor,eng);
				p[inx].calc();//p[0],p[1],p[2]
				rank();	
				won[inx]=p[inx];
				inx++;//3
				System.out.println("#�⺻data�Է� �۾��Ϸ�.");
			}
			static void rank(){
				for(int i=0;i<=inx ;i++) {
					int soon=1;//���� 1��
					for(int j=0;j<=inx;j++) {
						if( p[i].getTot() <  p[j].getTot() ) soon++;
					}//for j
					p[i].setRn(soon);
				}//for i
			}
			static void baseOutput(){
				System.out.println("#�⺻data��� �۾��Դϴ�.");
				if(inx==0) {
					System.out.println("\t������ü �����Ƿ� ... #�⺻data��� �۾��Ұ�!!!");
					return;// baseOutput()ȣ����ġ�� ����!!!
				}
				System.out.println("��ȣ\t�̸�\t����\t����");
				for(int i=0;i<inx;i++) {
					won[i].disp1();
					System.out.println();
				}
				System.out.println("#�⺻data��� �۾��Ϸ�.");
			}
			static void scoreReport(){
				System.out.println("#����ǥ ��� �۾��Դϴ�.");
				if(inx==0) {
					System.out.println("\t������ü �����Ƿ� ... #����ǥ ��� �۾��Ұ�!!!");
					return;// scoreReport()ȣ����ġ�� ����!!!
				}		
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t���\t��\t���");
				for(int i=0;i<inx;i++) {
					won[i].disp1();
					won[i].disp2();
				}
				System.out.println("#����ǥ ��� �۾��Ϸ�.");
			}
			static void hno_Inq(){
				System.out.println("#��ȣ�� ��ȸ �۾��Դϴ�.");
				if(inx==0) {
					System.out.println("\t������ü �����Ƿ� ... #��ȣ�� ��ȸ �۾��Ұ�!!!");
					return;// hno_Inq()ȣ����ġ�� ����!!!
				}		
				System.out.print("��ȸ ��ȣ? ");int hno=sc.nextInt();
				int i;
				for( i=0;i<inx;i++) {
					if(p[i].getHno()==hno) break;
				}		
				if(i == inx) {
					System.out.println("\t��ȸ��ȣ�� �������� �ʾƿ�.");
					return;
				}
				else {
					System.out.println("��ȣ\t�̸�\t����\t����\t����\t���\t��\t���");
					p[i].disp1();
					p[i].disp2();
				}
				System.out.println("#��ȣ�� ��ȸ �۾��Ϸ�.");
			}
			static void rn_sort_scoreReport(){
				System.out.println("#����ǥ ���(�����) �۾��Դϴ�.");
				if(inx==0) {
					System.out.println("\t������ü �����Ƿ� ... #����ǥ ���(�����) �۾��Ұ�!!!");
					return;// rn_sort_scoreReport()ȣ����ġ�� ����!!!
				}	
				//�����ϱ�
				Sungjuk temp;//����!!
				for(int i=0;i<inx-1 ;i++) {
					for(int j=i+1;j<inx;j++) {
						if(p[i].getRn() >    p[j].getRn())//2> 1
						{//�ٲٱ�� ���۷����� ġȯ����!!!
							temp=p[i];
							p[i]=p[j];
							p[j]=temp;
						}
					}//for j
				}//for i
				System.out.println("��ȣ\t�̸�\t����\t����\t����\t���\t��\t���");
				for(int i=0;i<inx;i++) {
					p[i].disp1();
					p[i].disp2();
				}		
				System.out.println("#����ǥ ���(�����) �۾��Ϸ�.");
			}
			public static void main(String[] args) {		
				while(true) {
					menu();
					System.out.print("�۾�����? ");int jobNo=sc.nextInt();
					switch(jobNo) {
						case 1:baseInput();break;
						case 2:baseOutput();break;
						case 3:scoreReport();break;
						case 4:hno_Inq();break;
						case 5:rn_sort_scoreReport();break;
						default:System.out.println("�۾��� �����մϴ�.");
						             return;
					}//switch
				}//while 
				
	}

}


/*
  --�޴�--
1. �⺻data�Է�
2. �⺻data�Է�
3. ����ǥ ���
4. ��ȣǥ ���
5. ����ǥ ���(�����)
6. �۾�����
�۾�����? 1
#�⺻data �۾��Դϴ�.
��ȣ? 11-11  
�̸�? ȫ �� ��
����,����? 100 100
#�⺻data �۾��Ϸ�.
�޴����̰�
�۾�����? 1
#�⺻data �۾��Դϴ�.
��ȣ? 11  (�ߺ���ȣx)
    �ߺ���ȣ��! ... �ٽ� ��ȣ? 11
    �ߺ���ȣ��! ... �ٽ� ��ȣ? 11
    �ߺ���ȣ��! ... �ٽ� ��ȣ? 22
�̸�? ����
����,����? 50 100
#�⺻data �۾��Ϸ�.
�޴����̰�
�۾�����? 2
#�⺻data ��� �۾��Դϴ�.
��ȣ   �̸�    ����   ����
111
... 
#�⺻data ��� �۾��Ϸ�
�޴����̰�
�۾�����? 3
#����ǥ ��� �۾��Դϴ�.
��ȣ   �̸�  ����   ����   ����    ��   ��    ���
11
...
#����ǥ �۾��Ϸ�.
�޴����̰�
�۾�����? 4
#��ȣ�� ��ȸ �۾��Դϴ�.
��ȣ? 11 (���� ��ȣx)
��ȣ   �̸�  ����   ����   ����    ��   ��    ���
11
...
#��ȣ�� ��ȸ �۾��Ϸ�.
�޴����̰�
�۾�����? 5
#����ǥ ���(�����) �۾��Դϴ�.
��ȣ   �̸�  ����   ����   ����    ��   ��    ���
xx

....
#����ǥ ���(�����) �۾��Ϸ�.
�޴����̰�
�۾�����? 9
�۾��� �����մϴ�.



 
*/