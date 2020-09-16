package w4;

/*
 * 
 * while에서의 continue;
 * :continue를 만나면 continue이하는 실행하지 않고, while의 조건식으로 분기
 * 
 * 100~200까지의 수 중 7의 배수가 아닌수의 합을 구하라. 
 * 13043
 *
 */

public class Ex10_while에서의_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i =99;
		int hap = 0;
		while( i<200) {
			i++;
			//주의 ㅣ continue;전에 증감식이 위차하도록!
			if(i%7==0)continue;
			System.out.printf("%d ",i);
			hap+=i;
		}//while
		System.out.printf("7의 배수가 아닌 수의 합 : %d",hap); //13043
		
	}

}
