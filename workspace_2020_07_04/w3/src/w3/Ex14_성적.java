package w3;


/*
 * 4���� �⺻���� �Է��Ͽ� ������ �Ҵ���, �Ʒ�ó�� ���
 * �򰡴� ����� 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸�C, 60�̻��̸� D, �׿� 60�̸��̸� F
 * ���� ����� 85�̻��̸� ������... �׿ܴ� �����!�� ���ڿ��� ���
 * �̸�? ȫ �� ��
 * ������ ����? a
 * ����, ����?? 95 100
 * ------------------
 * �̸�:xxx ������ ����:x(�빮��)
 * ����:xxx ����:xxx
 * ����:xxx ���:xxx.x
 * ��:xxx ���:xxx
 * ...
 * �̸�? �ƹ��� �Է¾��� enter key������ ����
 * �۾�����
 * */

import java.util.Scanner;

public class Ex14_���� {

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
			char grade;
					switch((int)avg/10) {
					case 10:
					case 9:	grade='A';break;
					case 8:	grade='B';break;
					case 7:	grade='C';break;
					case 6:	grade='D';break;
					default:grade='F';break;
					}
			
			bigo=(avg>=85)?"������..":"�����!";
	//			if(avg>=85)
	//				bigo="������..";
	//			else
	//				bigo="�����!";
				
			
			System.out.println(line);
			System.out.printf("�̸�: %s \t����������: %s\n",name,ty.toUpperCase());
			// toUpperCase() : ���ڿ��� �빮�ڷ� ��ȯ �Լ� , toLowerCase() : ���ڿ��� �ҹ��ڷ� ��ȯ �Լ�
			System.out.printf("����: %3d \t����: %3d\n",kor,eng);
			System.out.printf("����: %3d \t���: %5.1f\n",tot,avg);
			System.out.printf("��: %3c \t���: %s\n\n",grade,bigo);
			
		}// while
		
		System.out.println("�۾�����");
		sc.close();
		tc.close();
		
		
	}

}
