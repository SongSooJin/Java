package w3;

import java.util.Scanner;

/*
 * �ڵ�? a
 * ����? 10
 * --------------
 * �ڵ� : x       ǰ�� : xxx
 * ���� : x       �ܰ� : xxx     �ݾ� : xxx 
 * �ڵ�? �Է°����� ����Ű�� ������ ����
 * 
 */
public class Ex9_�Ǹ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		
		String line="------------------";
		String pname="";
		int dan,hap;
		dan=hap=0; //�Ҵ���� ��-->��
		
		while(true) {
			System.out.print("�ڵ�? ");
			String code = sc.nextLine();
			if(code.equals("")) break;
			// nextLine():���ڿ��� �Է½� ����Ű �������������� ��� ���ڿ��� �Ҵ�
			System.out.print("����? ");
			int su = tc.nextInt();
			
				if(code.equals("a") || code.equals("A")) {
					pname = "���찳";
					dan = 800;
				}
				else if(code.equals("b") || code.equals("B")) {
					pname = "��Ʈ";
					dan = 2000;
				}
				else if(code.equals("c") || code.equals("C")) {
					pname = "����";
					dan = 1200;
				}
				else if(code.equals("d") || code.equals("D")) {
					pname = "����";
					dan = 2100;
				}
				else {
					pname = "����";
					dan = 4500;
				}
				
			hap = su*dan;
			System.out.println(line);
			System.out.printf("�ڵ� : %3s \t ǰ�� : %s\n",code,pname);
			System.out.printf("���� : %3d \t �ܰ� : %4d \t �ݾ� : %d\n\n",su,dan,hap);
			
		}//while
		
		System.out.println("����");
		sc.close();
		tc.close();
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