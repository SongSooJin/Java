package w4;

/*
 i : 10
 i : 20
 i : 30
 i : 40
 i : 50
 */

public class Ex7_�ݺ���while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
//		for(int i=10; i<=50; i+=10) {
//			System.out.println(" i : " + i);
//		}//for	
		int i=10;//�ʱⰪ
		while(i<=50) { // ���ǽ�
			//i+=10;
			//System.out.println(" i : " + i); // 20 30 40 50 60 
			System.out.println(" i : " + i); // 10 20 30 40 50
			i+=10; //������
		}//while
		System.out.println(" while���� ��� i�� : " + i); // 60
		
		
		
		
	}

}

/*
 * while,do~while : �ݺ�Ƚ���� ����ڿ� ���� �����Ǵ� ��� �ַ� ���
 * while(���ǽ�) {
 * ����1;
 * ����2;
 * }
 * 
 * 
 */
