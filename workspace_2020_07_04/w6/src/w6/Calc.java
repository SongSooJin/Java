package w6;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i=0;i<args.length;i++) { //����� ������ ������ŭ �ݺ�
			String a = args[i];
//			System.out.println("a : " + a);
//			int n = (int)args[i]; //error
			int n = Integer.parseInt(args[i]); // ������ ������ ���ڿ��� ������ ��ȯ
//			sum +=n;  //���ڸ� ��ģ��
		}
		System.out.println("sum : " + sum);
	}

}
