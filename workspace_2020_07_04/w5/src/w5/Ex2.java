package w5;

/*
 * 1
 * 1 2
 * 1 2 3
 * 1 2 3 4
 * 1 2 3 4 5
 * 1 2 3 4
 * 1 2 3
 * 1 2
 * 1 
 * 
 */

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i = 1;i<=5; i++) {
			for(int j=1; j<=i;j++) {
				System.out.printf("%d " ,j);
			}//for j
			System.out.printf("\n");
		}//for i
		

		for(int i = 4;i>=1; i--) {
			for(int j=1; j<=i;j++) {
				System.out.printf("%d " ,j);
			}//for j
			System.out.printf("\n");
		}//for i
		
	}

}
