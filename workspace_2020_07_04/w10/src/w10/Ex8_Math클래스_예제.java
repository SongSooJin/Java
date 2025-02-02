package w10;

public class Ex8_Math클래스_예제 {

	public static void main(String[] args) {
		System.out.println(Math.abs(-3.14)); 	// 절댓값 구하기
		System.out.println(Math.sqrt(9.0)); 		// 9의 제곱근 = 3.0(double형)
		System.out.println(Math.E); 	// 2.718281828459045
		System.out.println();
		System.out.println(2.718281828459045*2.718281828459045);
		System.out.println(Math.exp(2)); 	// e의2승
		System.out.println(Math.round(3.14)); // 반올림
		System.out.println();
		
		// [1, 45] 사이의 정수형 난수 6개 발생
		System.out.print("이번주 행운의 번호는 ");
		for (int i=0; i<=6; i++) {
			int n = (int)(Math.random()*(45-1+1) + 1); // 난수 발생
			System.out.print(n+" ");
		}
		
	}
}
