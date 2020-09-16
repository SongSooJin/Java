package w3;

import java.util.Scanner;

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
public class Ex11_����_switch {

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
			
			switch(month) {
			case 2:days = 28;break;
			case 4:
			case 6:
			case 9:
			case 11:days = 30;break;
			default:days = 31;
			}//switch
			
//				if(month==2)
//					days = 28;
//				else if (month==4 || month==6 || month==9 || month==11)
//					days = 30;
//				else
//					days = 31;
				
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


/*
 * switch~case : ����if�� ��κ��� switch�� ���� ����
 * ����) switch(���ǽ�) {
 * 	case ��1 : ��1;break;
 * 	case ��2 : ��2;break;
 * 	case ��3 : ��3;break;
 * ...
 * default:����;[break;��������]
 * 
 * }
 * 
 * 1) ���ǽ��� ����� �ݵ�� int,char,String�� ����
 * 2) case�������� int�� literal,char�� literal,String�� literal�� ����
 *      ���� : case������ �ü� ���°� = �Ǽ�, ���迬����, ��������, ������������(,) 
 * 3) break�� switch{}�� ����� �Ѵ� 
 * 	    break�� ������ : �׾Ʒ��� ������ ���ʷ� ������ break�� �� ������ 
 * 								������ ������ break�� ���� switch{}���� ���
 * 
 */