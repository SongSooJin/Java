package w5;
/*
 * int a[][] = new int[3][4];
 * a: 배열명
 * 3: 전체 행의 갯수
 * 4: 전체 열의 갯수
 * 
 */
public class Ex12_2차원배열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][] = new int[3][4];
		System.out.println("전체 행의 갯수 : " +a.length);
		System.out.println("0번 행의 열의 갯수 : " +a[0].length);
		System.out.println("1번 행의 열의 갯수 : " +a[1].length);
		System.out.println("2번 행의 열의 갯수 : " +a[2].length);
		System.out.println("a--------------");
		for(int i=0; i<a.length;i++) {
			for(int j=0; j<a[i].length;j++) {
				System.out.printf("a[%d][%d] : %d",i,j,a[i][j]);
			}//for j
			System.out.println();
		} //for i
		double d[][]= {{1.2,3.4},{0.0,5.5},{4.5,3.9},{4.2,2.8}};
		System.out.println("\nd--------------");
		for(int i=0; i<d.length;i++) {
			for(int j=0; j<d[i].length;j++) {
				System.out.printf("d[%d][%d] : %.1f",i,j,d[i][j]);
			}//for j
			System.out.println();
		} //for i
	}

}
