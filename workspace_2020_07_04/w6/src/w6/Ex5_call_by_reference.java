package w6;
/*
 * a�迭�� ���� ������Լ����� ���ϰ� ����� ���ο��� 
 * 
 * ���۷����� ġȯ : int ta[]=a;
 * main()�� �������� a�迭�� ������ ������Լ����� ta��� �̸����� ����
 */
public class Ex5_call_by_reference {

	static int sum(int ta[]){
		int s=0;
	for(int i=0;i<ta.length;i++) {
		s +=ta[i];
				}
	return s;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1,2,3,4,5};
		int n= sum(a); //call by reference
		System.out.println("�� : " +n);
	}

}