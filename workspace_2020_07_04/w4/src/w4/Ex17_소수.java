package w4;

/*
 * 1~100������ ���� �Ҽ��� ���
 */


public class Ex17_�Ҽ� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0;
		for(int su = 1;su<=100;su++) {
	
			boolean sw=false; //���������� �ʱⰪ
			int i;
			
				for(i=2;i<su;i++) { //2)1�� �ڽ��� �����ϰ� ���� �� 
					if(su%i==0) { sw=true;  break;}
				}//for i
			
			if(sw == false && i == su) {
				System.out.printf("%d ",su);
				count++;
			}
		}//for su
		System.out.println("�� ���� : "+count);
		
	}

}
