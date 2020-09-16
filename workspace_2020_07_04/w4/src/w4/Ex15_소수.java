package w4;


/*
 * 수를 입력받아 할당후, 그수가 소수인지를 판별후 출력하라

  * 수? 13
 * 13: 소수임
 * 수? 11
 * ...
 * 수? 1보다 작은수의 입력시 종료
 */


import java.util.Scanner;

public class Ex15_소수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String pan = "@";
		
		while(true) {
			System.out.printf("수? ");
			int su = sc.nextInt();
			
			if(su<1) break;
			int count=0; //약수의 갯수를 구할변수의 초기값 0

			for(int i=1;i<=su;i++) {
				if(su%i==0) 
				count++; //++count; ==count=count+1; == count+=1;	
			}//for
			
			pan=(count ==2)?"소수":"소수아님";//1)약수의 갯수가 2개뿐인 수
//				if(count == 2) //약수의 갯수가 2개뿐인수
//					pan ="소수";
//				else
//					pan="소수아님";
				System.out.printf("%d : %s\n",su,pan);
				System.out.printf("약수의 갯수 : %d\n\n",count);
			}//while
			
			System.out.println("종료");
			sc.close();
		
		
	}

}

/*
소수 
1) 약수가 2개뿐인 수 
2) 1과 자신으로만 나눠지는 수
*/