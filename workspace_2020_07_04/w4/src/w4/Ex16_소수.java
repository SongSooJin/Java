package w4;
/*
 * ���� �Է¹޾� �Ҵ���, �׼��� �Ҽ������� �Ǻ��� ����϶�

  * ��? 13
 * 13: �Ҽ���
 * ��? 11
 * ...
 * ��? 1���� �������� �Է½� ����
 */

import java.util.Scanner;

public class Ex16_�Ҽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		String pan = "@";
		
		while(true) {
			System.out.printf("��? ");
			int su = sc.nextInt();
			
			if(su<1) break;
			boolean sw=false; //���������� �ʱⰪ
			int i;
			
			for(i=2;i<su;i++) { //2)1�� �ڽ��� �����ϰ� ���� �� 
				if(su%i==0) { sw=true;  break;}
			}//for
			
		 //pan=(sw == false && su != 1)?"�Ҽ�":"�Ҽ��ƴ�";
			pan=(sw == false && i == su)?"�Ҽ�":"�Ҽ��ƴ�";
				System.out.printf("%d : %s\n",su,pan);
			}//while
			
			System.out.println("����");
			sc.close();
		

	}

}


/*
 * �Ҽ� 
1) ����� 2������ �� 
2) 1�� �ڽ����θ� �������� ��
*/