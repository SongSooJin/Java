package w6;

/*
 * 10
 * 11 12 13
 * 14 15
 * 16 17 18 19
 * 
 */

public class Ex8_비정방배열객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int [4][];
		
		a[0] = new int[1];
		a[1] = new int[3];
		a[2] = new int[2];
		a[3] = new int[4];
		
		int k = 9;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			k++;
			a[i][j] = k;
			}//for j
		}// for i
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
			System.out.printf("a[%d] [%d] :  %d",i,j,a[i][j]);
			k++;
			a[i][j] = k;
			}//for j
			System.out.println();
		}// for i
	}

}
