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

public class Ex15_�Ҽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String pan = "@";
		
		while(true) {
			System.out.printf("��? ");
			int su = sc.nextInt();
			
			if(su<1) break;
			int count=0; //����� ������ ���Һ����� �ʱⰪ 0

			for(int i=1;i<=su;i++) {
				if(su%i==0) 
				count++; //++count; ==count=count+1; == count+=1;	
			}//for
			
			pan=(count ==2)?"�Ҽ�":"�Ҽ��ƴ�";//1)����� ������ 2������ ��
//				if(count == 2) //����� ������ 2�����μ�
//					pan ="�Ҽ�";
//				else
//					pan="�Ҽ��ƴ�";
				System.out.printf("%d : %s\n",su,pan);
				System.out.printf("����� ���� : %d\n\n",count);
			}//while
			
			System.out.println("����");
			sc.close();
		
		
	}

}

/*
�Ҽ� 
1) ����� 2������ �� 
2) 1�� �ڽ����θ� �������� ��
*/