
public class EX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 10;
		int y = new EX().change(x);
		System.out.println(x+y);
	}
	int change(int x) {
		x = 12;
		return x;
	}
}
