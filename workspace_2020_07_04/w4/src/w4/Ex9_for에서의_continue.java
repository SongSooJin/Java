package w4;

/*
 * 
 *  for������ continue;
 * :continue�� ������ continue���ϴ� �������� �ʰ�, for�� ���������� �б�
 * 
 * 
 * 100~200������ �� �� 7�� ����� �ƴѼ��� ���� ���϶�. 
 * 13043
 *
 */
public class Ex9_for������_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int hap=0;
		for(int i=100; i<=200; i++) {
			if(i%7==0)  continue;
				System.out.printf("%d ",i);
				hap+=i;
			//if
		
		}//for
		System.out.printf("7�� ����� �ƴ� ���� �� : %d",hap); //13043

	}

}

/*
 * while������ continue;
 * :continue�� ������ continue���ϴ� �������� �ʰ�, while�� ���ǽ����� �б�
 * 
 * for������ continue;
 * :continue�� ������ continue���ϴ� �������� �ʰ�, for�� ���������� �б�
 */


/*
 * int hap=0;
		for(int i=100; i<=200; i++) {
			if(i%7!=0) {
				//System.out.printf("%d ",i);
				hap+=i;
			}//if
		
		}//for
		System.out.printf("7�� ����� �ƴ� ���� �� : %d",hap); //13043
 */