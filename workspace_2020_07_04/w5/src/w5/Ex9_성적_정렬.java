package w5;

/*
 * 5���� �⺻�ڷḦ �Է��Ͽ� �迭 ��ü�� �Ҵ��� ���
 * #1)
 * ��ȣ? 11 
 * �̸�? ȫ�浿
 * ����,����? 100 95
 * 
 * #2)
 * ��ȣ? 13
 * �̸�? ����
 * ����,����? 90 95
 * ...
 *            *����ǥ*
 * ��ȣ  �̸�    ����     ����    ����     ���        ��
 * xx   xxx   xxx   xxx   xxx   xxx.x      x
 * ...
 * ------------------------------------------
 * ���� �ְ����� : xxx
 * ���� �������� : xxx
 * 
 *        *����ǥ (�����)*
 * ��ȣ  �̸�    ����     ����    ����     ���        ��
 * xx   xxx   xxx   xxx   xxx   xxx.x      x
 * 
 */

import java.util.Scanner;


public class Ex9_����_���� {

	static final int SI = 3;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);

		 int hno[] = new int[SI];
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
			 System.out.print("��ȣ?"); hno[i]=sc.nextInt();
			 System.out.print("�̸�?"); name[i]=tc.nextLine();
			 System.out.print("����,����?"); kor[i]=sc.nextInt(); eng[i]=sc.nextInt();
			 tot[i] = kor[i]+eng[i];
			 avg[i] = (float)tot[i]/2;
			 
			 switch ((int)avg[i]/10) { //(int)99.5F --> 99, 99/10 -->9
				case 10:
				case 9: grade[i]='A';break;
				case 8: grade[i]='B';break;
				case 7: grade[i]='C';break;
				case 6: grade[i]='D';break;	
				default:grade[i]='F';break;
			}//switch
			 
		if(maxkor < kor[i]) 
			maxkor = kor[i];
		if(mineng > eng[i])
			mineng = eng[i];
		}//for
		 
		 //��� �л��� ������ �������Ŀ� ��� ���ϱ�
		 for(int i=0;i<SI;i++) {
			 rn[i] = 1; //���� �ʱ�ġ 1��
			 for(int j=0; j<SI;j++) {
				 if(tot[i] < tot[j]) rn[i]++;
			 }
		 } 
		 
		 System.out.println(" \n                          *����ǥ* ");
		 System.out.println("��ȣ\t �̸� \t ���� \t ���� \t ���� \t    ���\t  �� \t ���");
		 for(int i=0; i<SI; i++) {
			 System.out.printf("%3d \t %s\t %3d \t %3d \t %3d \t %5.1f \t %3c \t %3d\n",
					 hno[i],name[i],kor[i],eng[i],tot[i],avg[i],grade[i],rn[i]);
		 }//for
		 
		 System.out.println("-------------------------------------------");
		 System.out.printf("���� �ְ����� : %3d\n",maxkor);
		 System.out.printf("���� �������� : %3d\n",mineng);
		 
		 //��������� ����ϱ�
		 for(int i=0; i<SI-1;i++) {
			 for(int j=i+1;j<SI;j++) {
				 if(rn[i] > rn[j]) { // 5>1 
					temp = hno[i]; hno[i] = hno[j]; hno[j] = temp;
					tname = name[i]; name[i] = name[j]; name[j] = tname;
					temp = kor[i]; kor[i] = kor[j]; kor[j] = temp;
					temp =eng[i]; eng[i] = eng[j]; eng[j] = temp;
					temp = tot[i]; tot[i] = tot[j]; tot[j] = temp;
					tavg = avg[i]; avg[i] = avg[j]; avg[j] = tavg;
					tgrade = grade[i]; grade[i] = grade[j]; grade[j] = tgrade;
					temp = rn[i]; rn[i] = rn[j]; rn[j] = temp;
				 }//if
			 }//for j
		 }//for i
		 
		 System.out.println(" \n                          *����ǥ(�����)* ");
		 System.out.println("��ȣ\t �̸� \t ���� \t ���� \t ���� \t    ���\t  �� \t ���");
		 for(int i=0; i<SI; i++) {
			 System.out.printf("%3d \t %s\t %3d \t %3d \t %3d \t %5.1f \t %3c \t %3d\n",
					 hno[i],name[i],kor[i],eng[i],tot[i],avg[i],grade[i],rn[i]);
		 }//for
		 
		 sc.close();tc.close();
		
	}

}
