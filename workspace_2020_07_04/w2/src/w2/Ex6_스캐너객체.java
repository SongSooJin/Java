package w2;

/*
 * a�� b�� �Է��Ͽ� ������ �Ҵ� �� �Ʒ�ó�� ��Ÿ����
 * ���� a�� �Է� : 123
 * ���� b�� �Է� : 21
 * -----------------
 * a + b = xxx
 * a - b = xxx
 */

import java.util.Scanner;

public class Ex6_��ĳ�ʰ�ü {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		//new�����ڰ� �����Լ��� Scanner��ü�� ������, �� ��ġ ������ 
		//Scanner��ü ���۷����������� ��ȯ
		
		while(true) {
		System.out.print("���� a�� �Է� : "); 	int a = sc.nextInt(); // ��ü���۷���.�޼ҵ�();
		System.out.print("���� b�� �Է� : ");    int b = sc.nextInt(); // ��ü���۷���.�޼ҵ�();
		System.out.print("���� c�� �Է� : ");    String c = sc.next(); // ��ü���۷���.�޼ҵ�();
		
		if(a == b) 
			break;
		System.out.println("---------------");
		System.out.printf("a +b : %d\n",a+b);
		System.out.printf("a -b : %d\n",a-b);
		System.out.printf("c : %s\n\n",c);
		}// while
		
		System.out.println("�۾��� �����մϴ�.");
		sc.close(); //�ݱ�
		
	}

}


/*
 * �ݺ��� - while
 * ����)
 * while(���ǽ�) {
 * ����1;
 * ����2;
 * }
 * ...
 * ���ǽ��� �����ϸ� while�� {}���� ������, while�� ���ǽ����� �б�
 * ���ǽ��� �������ϸ� while�� {}������ ������ ����
 * 
 * �ݺ����ȿ��� break
 * break�� ������ �ݺ����� ����� ��
 * 
 * �ܼ� if
 * if(���ǽ�)
 * {��1; ��2;}
 * ...
 * ���ǽ��� �����ϸ� ���� ����
 * ���ǽ��� �������ϸ� �ܼ�if �������� ����
 * 
 * ���迬���� : >,>=,<,<=,==(����),!=(�����ʴ�)
 */