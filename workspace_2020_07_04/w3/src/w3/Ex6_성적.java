package w3;

import java.util.Scanner;

/*
 * 4���� �⺻���� �Է��Ͽ� ������ �Ҵ���, �Ʒ�ó�� ���
 * ���� ����� 85�̻��̸� ������... �׿ܴ� �����!�� ���ڿ��� ���
 * �̸�? ȫ �� ��
 * ������ ����? a
 * ����, ����?? 95 100
 * ------------------
 * �̸�:xxx ������ ����:x(�빮��)
 * ����:xxx ����:xxx
 * ����:xxx ���:xxx.x
 * ���:xxx
 * ...
 * �̸�? �ƹ��� �Է¾��� enter key������ ����
 * �۾�����
 * */

public class Ex6_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		
		String bigo="",line = "-------------------";
		
		while(true) {
			System.out.print("�̸�? "); String name = sc.nextLine();
			// nextLine() : �Է¹޴� ���� ������ �ִٸ� ����ϴ� �޼ҵ� , \n�������� ��� ���ڿ��� name�� �Ҵ�
			// �ݺ����� ����� \n�� ����Ǿ� ���� �Է¹޴°����� ����Ǳ� ������ �Է��� �ΰ� �޴´�.
			
			// if(name == "") break; ���� error
		    if(name.equals("")) break;
			System.out.print("����������? ");
			String ty=tc.next();
			// ��ĳ�� ��ü�� �޼ҵ��� ��ȯ���� char���� ����.
			System.out.print("����,����?? "); 
			int kor = tc.nextInt(); 
			int eng = tc.nextInt();
			
			int tot = kor+eng;
			float avg = tot/2.0f;
			
			bigo=(avg>=85)?"������..":"�����!";
	//			if(avg>=85)
	//				bigo="������..";
	//			else
	//				bigo="�����!";
				
			
			System.out.println(line);
			System.out.printf("�̸�: %s\t����������: %s\n",name,ty.toUpperCase());
			// toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ �Լ� , toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ �Լ�
			System.out.printf("����: %3d \t����: %3d\n",kor,eng);
			System.out.printf("����: %3d \t���: %5.1f\n",tot,avg);
			System.out.printf("���: %s\n\n",bigo);
			
		}// while
		
		System.out.println("�۾�����");
		sc.close();
		tc.close();
		
		
	}

}
