package w6;
/*
 * 반지름 : 5
 * 원의 넓이 : xx.xxx
 * 원의 둘레 : xx.xxx
 */
public class Ex13_원 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Math.PI); //
		Circle p = new Circle(5);
		System.out.printf("반지름 :  %d\n",p.getR());
		System.out.printf("원의 넓이 :  %f\n",p.getArea());
		System.out.printf("원의 둘레 :  %f\n",p.getAround());
		

	}

}

