package w5;

public class Ex8_���ڿ���_�� {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1="apple";
		String s2="zoo";
		String s3="rain";
		int n=s1.compareTo(s2);
		
		System.out.println("n : " +n); //-25 ����
		n=s2.compareTo(s1);
		System.out.println("n : " +n); //25 ���
		n=s1.compareTo(s3);
		System.out.println("n : " +n); //-17 ���
		n=s2.compareTo("zoo");
		System.out.println("n : " +n); //0
	}

}
