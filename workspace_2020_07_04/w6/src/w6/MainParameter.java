package w6;

/*
 * 170.5
 * 168.8
 * 182.3
 * 176.8
 * 163.9
 */

public class MainParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum = 0.0;
		for(int i=0;i<args.length;i++) {
			System.out.printf(args[i] +"\n");
//			double height = (double)args[i]; //error
			//��Ʈ�������� �⺻�ڷ��� double��
			double height = Double.parseDouble(args[i]);
			sum += height;
		}
		
		System.out.printf("��� ���� : %.2f\n",sum/args.length );
		
	}

}
