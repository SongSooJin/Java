package w4;

/*
 * 
 * while������ continue;
 * :continue�� ������ continue���ϴ� �������� �ʰ�, while�� ���ǽ����� �б�
 * 
 * 100~200������ �� �� 7�� ����� �ƴѼ��� ���� ���϶�. 
 * 13043
 *
 */

public class Ex10_while������_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =99;
		int hap = 0;
		while( i<200) {
			i++;
			//���� �� continue;���� �������� �����ϵ���!
			if(i%7==0)continue;
			System.out.printf("%d ",i);
			hap+=i;
		}//while
		System.out.printf("7�� ����� �ƴ� ���� �� : %d",hap); //13043
		
	}

}
