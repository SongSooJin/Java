package w7;/*Point객체배열을 생성후 아래처럼!
x :  0   y :   0
x :  2   y :   5
x :  4   y : 10
x :  6   y : 15
x :  8   y : 20
*/
public class Ex2_객체배열 {
	
	static final int SI =5;
	public static void main(String[] args) {
		
		Point p[]=new Point[SI];//Point객체배열의 선언 
		for(int i=0;i<SI;i++) {
			p[i]=new Point(i*2,i*5);//Point객체의 생성 
		}
		for(int i=0;i<SI;i++) {
			System.out.printf("x : %2d\ty : %2d\n",p[i].getX(),p[i].getY() );
		}
	}
	
}
