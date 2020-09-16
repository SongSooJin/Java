package w8;

public class CallByValue {

	static void increase(int m) {
		m++;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int n=10;
			increase(n); // call by value
			System.out.println("n : "+n); // 10
	}

}
