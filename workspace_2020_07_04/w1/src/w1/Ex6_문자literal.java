package w1;

public class Ex6_문자literal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char ch = 'A', dh = '나'; // char형은 2byte
//		char eh='ab'; error
		System.out.printf("ch : %c\n", ch); // A
		System.out.printf("dh : %c\n", dh); // A
		System.out.printf("ch : %s\n", ch); // error
		System.out.printf("ch : %d\n", ch); // 자바는 error , C언어의 경우 : 65(아스키코드값 출력)
	}

}
