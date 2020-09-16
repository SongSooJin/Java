package w6;

public class Ex6_사용자함수에서_배열의_리턴 {
	
	static int[] makeArray() {
		
		int temp[]= new int[4];
		temp[0] = 100;
		temp[1] = 123;
		temp[2] = 156;
		temp[3] = 192;
		return temp;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int ia[];
		ia= makeArray();
		ia[3]=-52;
		for(int i=0;i<ia.length;i++)
		System.out.printf("ia[%d] : %d\n"+ia[i]);

	}


}
