package w5;
/* for ~ each
 * ����) for( �迭�� �ڷ���   ����  :�迭���۷�����    ) {
 * ��1;
 * ��2;
 * }
 * 
 */
public class Ex11_�ݺ���_for_each {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {11,23,87,99,100};
		// k�� a[0],a[1]..a[4]
		int s = 0;
		for(int k : a) {
			System.out.println("k : "+k);
			s+=k;
		}
//		for(int i=0; i<a.length; i++) {
//			s += a[i];
//			System.out.println("a[i] : "+a[i]);
//		}
		System.out.println("�� : "+s);
	}

}
