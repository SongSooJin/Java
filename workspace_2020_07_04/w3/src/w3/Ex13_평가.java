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

public class Ex13_�� {

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
					switch(score/10) { // 99/10 --> 9, 90/10 --> 9
					case 10:
					case 9:grade = 'A';break; // 90~99
					case 8:grade = 'B';break; // 80~89
					case 7:grade = 'C';break; // 70~79
					case 6:grade = 'D';break; // 60~69
					default:grade = 'F';break; // 0~59
					}
			
//					if(score>=90)
//						grade  = 'A';
//					else if (score >=80)
//						grade = 'B';
//					else if (score >=70)
//						grade = 'C';
//					else if (score >=60)
//						grade = 'D';
//					else 
//						grade = 'F';
			
				System.out.printf("���� : %3d \t �� : %c\n\n",score,grade);
				
		}//while
		
		System.out.println("�����մϴ�.");
		sc.close();
		
		
	}

}
