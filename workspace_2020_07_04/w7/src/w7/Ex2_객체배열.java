package w7;/*Point��ü�迭�� ������ �Ʒ�ó��!
x :  0   y :   0
x :  2   y :   5
x :  4   y : 10
x :  6   y : 15
x :  8   y : 20
*/
public class Ex2_��ü�迭 {
	
	static final int SI =5;
	public static void main(String[] args) {
		
		Point p[]=new Point[SI];//Point��ü�迭�� ���� 
		for(int i=0;i<SI;i++) {
			p[i]=new Point(i*2,i*5);//Point��ü�� ���� 
		}
		for(int i=0;i<SI;i++) {
			System.out.printf("x : %2d\ty : %2d\n",p[i].getX(),p[i].getY() );
		}
	}
	
}
