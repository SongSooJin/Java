package w5;

import java.util.Scanner;

/*
 * 5���� �⺻�ڷḦ �Է��Ͽ� �迭��ü�� �Ҵ���, ���ǿ� ���� ó���� ���
 * 1��° data�Է�  --> �ڵ� ? a
 *  						   ����? 10
 * 2��° data�Է�  --> �ڵ� ? b
 *  						   ����? 30
 * 3��° data�Է�  --> �ڵ� ? c
 *  						   ����? 90
 * ...
 *     *�Ǹź���*
 * �ڵ� ǰ�� ���� �ܰ� �ݾ�
 * a...
 * b...
 * ...
 * -------------------- 
 * ������ �Ѱ�  : xxx
 * �ݾ��� �Ѱ� : xxx      
 */

public class Ex6_�Ǹ� {
	
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
		
		for(int i=0; i<CN; i++) { //5�� �Է��� �ޱ�����
			System.out.printf("%d��° data�Է� -->", i+1);
			System.out.print("�ڵ�? "); code[i]=sc.next();
			System.out.print("\t\t ����? "); su[i]=sc.nextInt();
			
				switch( code[i].toLowerCase()) {
					case "a": pname[i]="���찳";dan[i]=800;break;
					case "b": pname[i]="��Ʈ";dan[i]=2000;break;
					case "c": pname[i]="����";dan[i]=1200;break;
					case "d": pname[i]="����";dan[i]=2100;break;		
					default:pname[i]="����";dan[i]=4500;break;
				}//switch
				
		      kum[i] = su[i]*dan[i];
		      totsu += su[i];
		      totkum += kum[i];
				
		}//for
		System.out.println(" \n                     *�Ǹź���*");
		System.out.println("�ڵ� \t ǰ�� \t ���� \t �ܰ� \t    �ݾ�");
		
		for(int i=0; i<CN; i++) { //5���� �Է¹������� �����ֱ����� 
			System.out.printf("%3s \t %3s \t %3d \t %4d \t %8d\n",
					code[i],pname[i],su[i],dan[i],kum[i]);
		}//for
		System.out.printf("������ �Ѱ� : %8d\n",totsu);
		System.out.printf("�ݾ��� �Ѱ� : %8d\n",totkum);
		sc.close();
	}

}



/*
 * �ڵ尡 a(A)�� ǰ���� ���찳, �ܰ� 800��
 * �ڵ尡 b(B)�� ǰ���� ��Ʈ, �ܰ� 2000��
 * �ڵ尡 c(C)�� ǰ���� ����, �ܰ� 1200��
 * �ڵ尡 d(D)�� ǰ���� ����, �ܰ� 2100��
 * �� ���� �ڵ�� ǰ���� ����, �ܰ� 4500��
 * �ݾ� = ���� * �ܰ�
 */
