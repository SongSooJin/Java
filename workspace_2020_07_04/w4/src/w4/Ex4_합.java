package w4;

/*
 * 1~100까지 출력(1행에 10개씩)후 그의 합을 구하라
 * 1 2 3 ... 10
 * ...
 * 91 92... 100
 * ---------------
 * 합 : xxx
 */

public class Ex4_합 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i,hap=0; // 합을 구하는 변수의 초기값 0설정
		for(i=1;i<=100;i++) {
			
			System.out.printf(" %-3d" ,i);
			hap +=i;	//hap=hap+i;
				if(i%10==0) {
					System.out.printf("\n");
				}
		}
		System.out.println("--------------------------------------------");	
		System.out.printf("hap: %d",hap);	
		
	}

}
