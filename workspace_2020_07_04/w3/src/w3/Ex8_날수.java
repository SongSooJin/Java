package w3;
/*
 * ���� �Է¹ް�, ���� �ش��ϴ� ������ �з��ϰ�, �Ʒ�ó�� ���
 * ��? 5
 * 5���� 31�ϱ����̴�.
 * ��? 2
 * 2���� 28�ϱ����̴�.
 * ...
 * ��? 13
 * 	   ���� �Է¹���(1~12)����...�ٽ� ��? 13
 * 	   ���� �Է¹���(1~12)����...�ٽ� ��? -1
 * 	   ���� �Է¹���(1~12)����...�ٽ� ��? 4
 * 4���� 30�ϱ����̴�.
 * ��? -999�� �Է½�
 * ����
 * 
 */

import java.util.Scanner;

public class Ex8_���� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int days = 0;
		
		while(true) {
			System.out.print("��? ");
			int month = sc.nextInt();
			
			if(month==-999) break;
			//if(month<1 || month>12) {
			// ����켱���� : ���迬���� > ��������, �������� �켱���� : ! > &&> || 
			if( !(month>=1 && month<=12)){
				System.out.print("\t���� �Է¹���(1~12)����... �ٽ� ");
				continue;
			}
				if(month==2)
					days = 28;
				else if (month==4 || month==6 || month==9 || month==11)
					days = 30;
				else
					days = 31;
				
				System.out.printf("%2d���� %d�� �����̴�.\n\n",month,days);
		}//while
		
		System.out.println("����");
		sc.close();
	}

}

/*
28�� : 2��
30�� : 4,6,9,11��
31�� : 1,3,5,7,8,10,12��
*/