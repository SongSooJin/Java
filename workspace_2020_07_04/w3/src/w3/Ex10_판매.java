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

public class Ex10_�Ǹ� {

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
			String tcode = code.toLowerCase();
			
				if(tcode.equals("a")) {
					pname = "���찳";
					dan = 800;
				}
				else if(tcode.equals("b")) {
					pname = "��Ʈ";
					dan = 2000;
				}
				else if(tcode.equals("c")) {
					pname = "����";
					dan = 1200;
				}
				else if(tcode.equals("d")) {
					pname = "����";
					dan = 2100;
				}
				else {
					pname = "����";
					dan = 4500;
				}
				
			hap = su*dan;
			System.out.println(line);
			System.out.printf("�ڵ� : %3s \t ǰ�� : %s\n",tcode,pname);
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