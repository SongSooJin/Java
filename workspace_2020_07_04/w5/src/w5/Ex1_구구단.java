package w5;

//import java.util.Scanner;

/*
 *   2단
-----------------
2 x 1 =  2
2 x 2 =  4
2 x 3 =  6
2 x 4 =  8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
  3단
-----------------
3 x 1 =  3
...
9 x 9 = 81
더 빨리 변하는 것을 안의 for로 한다
 * 
 * 
 */

public class Ex1_구구단 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Scanner sc = new Scanner(System.in);
		
		for(int i=2; i<=9;i++) {
			System.out.printf("  %d단\n",i);
			System.out.println("-----------------");
			for(int j=1; j<=9; j++) {
				System.out.printf("%d x %d = %2d\n",i,j,i*j);
			}//for j
			System.out.println("enter key를 누르시오");
			//String st = sc.nextLine();
		}//for i
		
		
	}

}
