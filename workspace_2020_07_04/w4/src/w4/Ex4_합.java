package w4;

/*
 * 1~100���� ���(1�࿡ 10����)�� ���� ���� ���϶�
 * 1 2 3 ... 10
 * ...
 * 91 92... 100
 * ---------------
 * �� : xxx
 */

public class Ex4_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,hap=0; // ���� ���ϴ� ������ �ʱⰪ 0����
		for(i=1;i<=100;i++) {
			
			System.out.printf(" %-3d" ,i);
			hap +=i;	//hap=hap+i;
				if(i%10==0) {
					System.out.printf("\n");
				}
		}
		System.out.println("--------------------------------------------");	
		System.out.printf("hap: %d",hap);	
		
	}

}
