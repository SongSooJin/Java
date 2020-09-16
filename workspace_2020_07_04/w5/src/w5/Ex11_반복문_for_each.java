package w5;
/* for ~ each
 * 형식) for( 배열의 자료형   변수  :배열레퍼런스명    ) {
 * 문1;
 * 문2;
 * }
 * 
 */
public class Ex11_반복문_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {11,23,87,99,100};
		// k가 a[0],a[1]..a[4]
		int s = 0;
		for(int k : a) {
			System.out.println("k : "+k);
			s+=k;
		}
//		for(int i=0; i<a.length; i++) {
//			s += a[i];
//			System.out.println("a[i] : "+a[i]);
//		}
		System.out.println("합 : "+s);
	}

}
