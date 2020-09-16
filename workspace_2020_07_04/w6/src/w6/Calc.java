package w6;

public class Calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int sum = 0;
		for(int i=0;i<args.length;i++) { //명령형 인자의 개수만큼 반복
			String a = args[i];
//			System.out.println("a : " + a);
//			int n = (int)args[i]; //error
			int n = Integer.parseInt(args[i]); // 명형행 인자인 문자열은 정수로 변환
//			sum +=n;  //숫자를 합친다
		}
		System.out.println("sum : " + sum);
	}

}
