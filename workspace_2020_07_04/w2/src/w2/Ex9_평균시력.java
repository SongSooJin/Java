package w2;

import java.util.Scanner;

/*
 * 이름? 홍 길 동
 * 좌,우 시력? 1.2 1.3
 * ------------------
 * 'x x x'님의
 * 평균 시력은 \1.25\ 입니다. 
 */
public class Ex9_평균시력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Scanner tc = new Scanner(System.in);
		
		//String name = sc.nextLine();
		
		String line = "------------------------";
		
		while(true) {
			System.out.print("이름? "); String name = sc.nextLine();
			if(name.equals("")) break;
			
			System.out.print("좌,우 시력?");double a = tc.nextDouble(); double b = tc.nextDouble();
			
			double avg = (a+b)/2; //연산우선순위 : () > *,/,% > +,-
			System.out.println(line);
			System.out.printf("\'%s\'님의\n",name);
			System.out.printf("평균 시력은 \\%.2f\\입니다.\n",avg);
			//System.out.println("평균 시력은 \\"+avg+"\\ 입니다.");
		}// while
		System.out.println("종료되었습니다.");
		sc.close();
		tc.close();
	}

}
