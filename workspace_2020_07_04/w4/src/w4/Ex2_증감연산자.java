package w4;

public class Ex2_증감연산자 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a=50,b=70,s=100,t=200;
		a++;//++a;
		b--;//--b;
		System.out.println("a : "+a); // 51
		System.out.println("b : "+b); // 69
		System.out.println("다른것과 같이 온경우");
		System.out.println("-전위 : 먼저 자신이 값을 증감후, 연산에 참여");
		s = s + ++a; // 먼저 a가 1증가 (52), s(100)+a(52) --> s(152)
		System.out.printf("a: %d \t s: %d\n",a,s); // 52 152
		t = t+ --b; // 먼저 b가 1감소(68) , t(200)+b(68) --> t(268)
		System.out.printf("b: %d \t t: %d\n",b,t); // 68 268
		System.out.println("----------------------------------------------------");
		
		System.out.println("-후위 : 먼저 연산에 참여후, 결과를 넘기고 최종순서에 자신의 값을 증감");
		s = s + a++; // s(152)+a(52)연산후 결과를 s(204)에 넘김 --> 최종순서에 a가 1증가(53)
		System.out.printf("a: %d \t s: %d\n",a,s); // 53 204
		t = t+ b--; // t(268)+b(68)연한수 결과를 t(336)에 넘김 --> 최종순서에 b가 1감소(67)
		System.out.printf("b: %d \t t: %d\n",b,t); // 67 336
		System.out.println("----------------------------------------------------");
		
		
 		System.out.println("a :" + ++a); // 54 
		System.out.println("b :" + b--); // 67을 출력후, 최종순서에 b가 1감소
		System.out.println("b :" + b); // 66 
	}
}


/*
 * 증감연산자 : ++(1증가),--(1감소),
 * 1)전위연산자 : 
 *    ++a; == a=a+1; == a+=1;
 *    --b; == b=b-1; == b-=1;
 * 2)후위연산자 :
 *     a++; == a=a+1; == a +=1;
 *     b--; == b=b-1; == b-=1;
 * 3)변수 단독으로 온 경우 : 전위와 후위의 연산의 결과는 같다.
 * 4)다른 것과 같이 온 경우
 *     -전위 : 먼저 자신이 값을 증감후, 연산에 참여
 *     	s = s + ++a;  
 *     --연산순서
 *     	1] a가 1증가
 *     2] s +1]의 결과 더함
 *     3] 2]의 결과를 s에 넘김 
 *     -후위 : 먼저 연산에 참여후, 결과를 넘기고 최종순서에 자신의 값을 증감
 *     s = s + a++;
 *     --연산순서
 *     1] s+a
 *     2] s +1]의 결과를 넘김
 *     3] a가 1증가 
 *      
 *      
 *      
 */