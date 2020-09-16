package w4;

/*
i : 10
i : 20
i : 30
i : 40
i : 50
*/

public class Ex11_반복문do_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10; //초기값
		do{
			System.out.printf("i : %d\n",i);
			i+=10;  //증감식
		}while(i<=50); //조건식
		
	}

}

/*
 *  while,do~while : 반복횟수가 사용자에 의해 결정되는 경우 주로 사용
 *  do{
 *  문장1;
 *  문장2;
 *  }while(조건식);
 *  ...
 *  do의 {}을 1번은 실행후, 조건식을 만족하면 do로 올라감
 *  조건식을 만족 못하면 do~while이후의 문장을 실행
 *  
 *  
 */