package w5;

public class Ex3_일차원배열객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ia[] = new int[5]; //정수형의 배열객체를 생성 및 선언 ==  int []ia = new int[5];
		System.out.printf("ia배열의 요소의 갯수 : %d\n",ia.length); //5
		System.out.printf("ia--\n");
		for (int i=0;i<ia.length;i++) {
			System.out.printf("ia[%d] : %d\n",i,ia[i]);		
		}
		
		double da[]; //double형의 일차원레퍼런스변수 da의 선언
		da = new double[7]; // double형의 일차원배열 객체 생성
		System.out.printf("\nda--\n");
		for (int i=0;i<da.length;i++) {
			System.out.printf("da[%d] : %.1f\n",i,da[i]);
		}
		
		char ca[] =  new char[8]; // char형의 일차원배열 객체 생성
		System.out.printf("\nca--\n");
		for (int i=0;i<ca.length;i++) {
			System.out.printf("ca[%d] : %c\n",i,ca[i]);
		}

		String sa[] =  {"복숭아","바나나","딸기","오렌지"}; // double형의 일차원배열 객체 생성
		System.out.printf("\nsa--\n");
		for (int i=0;i<sa.length;i++) {
			System.out.printf("sa[%d] : %s\n",i,sa[i]);
		}
		
		
	}

}
