package w2;

import java.util.Scanner;

/*
 * Scanner�� �ԷµǴ� Ű ���� �������� ���еǴ� ��ū ������ ����
	���� ���� :��\t��, ' ��, �� \n��

 * */
public class Ex7_�����ڷ���_�Է� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String line = "--------------------------";
		
		while(true ) {
			System.out.println("���� ������ ���� ü�� ��ȥ���θ� �Է��ϼ���");
			String name = scanner.next(); // "Kim"
			String city = scanner.next(); // "Seoul"
			int age = scanner.nextInt(); // 20
			double weight = scanner.nextDouble(); // 65.1
			boolean single = scanner.nextBoolean(); // true
	
			System.out.println(line);
			System.out.println("name : "+name);
			System.out.println("city : "+city);
			System.out.println("age : "+age);
			System.out.println("weight : "+weight);
			System.out.println("single : "+single);
			System.out.println();
		}// while
		//sc.close();
	}

}
