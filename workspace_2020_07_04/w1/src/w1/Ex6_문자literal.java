package w1;

public class Ex6_����literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A', dh = '��'; // char���� 2byte
//		char eh='ab'; error
		System.out.printf("ch : %c\n", ch); // A
		System.out.printf("dh : %c\n", dh); // A
		System.out.printf("ch : %s\n", ch); // error
		System.out.printf("ch : %d\n", ch); // �ڹٴ� error , C����� ��� : 65(�ƽ�Ű�ڵ尪 ���)
	}

}
