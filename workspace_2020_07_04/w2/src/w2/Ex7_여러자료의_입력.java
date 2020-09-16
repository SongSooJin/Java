package w2;

import java.util.Scanner;

/*
 * Scanner는 입력되는 키 값을 공백으로 구분되는 토큰 단위로 읽음
	공백 문자 :‘\t’, ' ’, ‘ \n’

 * */
public class Ex7_여러자료의_입력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		String line = "--------------------------";
		
		while(true ) {
			System.out.println("성씨 거주지 나이 체중 결혼여부를 입력하세요");
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
