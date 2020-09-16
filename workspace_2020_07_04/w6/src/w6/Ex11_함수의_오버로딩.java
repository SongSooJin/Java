package w6;
/*
 *  -- 함수의 오버로딩 : 같은 함수명 상태에서 인수의 갯수와 인수의 자료형이 다르면 
 *     							서로 다른 함수로 구별 
 */


public class Ex11_함수의_오버로딩 {
	static void func() {
		System.out.println("안뇽하세욤");
	}
	
	static void func(int a,int b) {
		System.out.printf("a: %d b: %d 합 : %d\n",a,b,a+b);
	}
	

	static void func(String a,int b) {
		for(int i=0;i<b;i++) {
		System.out.printf("a: %s b: %d\n",a,b);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		func();
		func(100,200);
		func("I LOVE YOU",5);	
		
	}

}
