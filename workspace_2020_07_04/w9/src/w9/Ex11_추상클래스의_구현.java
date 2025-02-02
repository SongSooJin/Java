package w9;

public class Ex11_추상클래스의_구현 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GoodCalc p = new GoodCalc();
		int a[] = {100,85,79,75,100}; 
		
		System.out.println( "add : " + p.add(10,20));
		System.out.println( "subtract : " + p.subtract(10,20));
		System.out.println( "average : " + p.average(a));
		System.out.println(p.average(new int [] { 2,3,5 }));
	}

}


abstract class Calculator {
	
	public abstract int add(int a, int b);
	public abstract int subtract(int a, int b);
	public abstract float average(int[] a);
	
}

class GoodCalc extends Calculator {
	public  int add(int a, int b) { return a+b;}
	public  int subtract(int a, int b) { return a-b;}
	public  float average(int[] a) {
		float s = 0.0f;
		for(int i = 0; i<a.length; i++) {
			s += a[i];
		}
		return s/a.length;
	}
	
}