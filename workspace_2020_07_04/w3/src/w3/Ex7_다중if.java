package w3;

import java.util.Scanner;

/*
 * �򰡴� ������ 90�̻��̸� A, 80�̻��̸� B, 70�̻��̸� C, 60�̻��̸� D, 60�̸��̸� F�� �ο�
 * ����? 94
 * ���� : 94 �� : A
 * ���� ? 105
 * ������ �Է¹���(0~100)����.. �ٽ� ����? -1
 * ������ �Է¹���(0~100)����.. �ٽ� ����? 105
 * ������ �Է¹���(0~100)����.. �ٽ� ����? 85
 * ���� : 94 �� : B
 * ...
 * ������ -999(����)�̸�
 * �����մϴ�.
 */

public class Ex7_����if {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		char grade = '@';
		
		while(true) {
			System.out.print("����? ");
			int score = sc.nextInt();
			
			if(score==-999) break;
			if(score<0 || score>100) {
				System.out.print("\t������ �Է¹���(0~100)����... �ٽ� ");
				continue; //while�� ���ǽ����� �б� 
			}
					if(score>=90)
						grade  = 'A';
					else if (score >=80)
						grade = 'B';
					else if (score >=70)
						grade = 'C';
					else if (score >=60)
						grade = 'D';
					else 
						grade = 'F';
			
				System.out.printf("���� : %3d \t �� : %c\n\n",score,grade);
				
		}//while
		
		System.out.println("�����մϴ�.");
		sc.close();
	}

}


/*
 * ����if
 * 
 * if(����1)
 * ��1;
 * else if(����2)
 * ��2;
 * else if(����3)
 * ��3;
 * else
 * ����;
 *...
 *����1�� �����ϸ� ��1�� ������ ����if �������� ����
 *����1�� �������ϸ� ����2�� �����ϴ��� ? 
 *			����2�� �����ϸ� ��2������ ����if �������� ����
 * 			����2�� �������ϸ� ����3�� �����ϴ���?
 * ...
 * ���� ���������� �������ϸ� else ������ ������ ����
 * 
 * 
 * �� ������ : ! && || ^(��Ÿ��or)
 * 1) ����1 || ����2 || ����3 : ���� ������ �ϳ��� ���̸� ��
 * 2) ����1 && ����2 && ����3 : ��� ���� ������ �����ؾ� ��
 * 3) !(���ǽ�) : ���ǽ��� ����� ���̸� ��������, ���ǽ��� ����� �����̸� ������
 * 4) ����1 ^ ����2 : ������ ����� �޶�� ��, ������ ����� ������ ����
 * 
 * 
 * 
 * while������ continue;
 * continue�� ������ continue���ϴ� �������� �ʰ�, while�� ���ǽ����� �б� 
 * 
 */
