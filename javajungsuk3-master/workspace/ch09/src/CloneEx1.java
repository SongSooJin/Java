//// Cloneable : Maker Interface, ��ü�� �������� ĥ�ؼ� ��ü�� �ٸ� ��ü�� �����Ѵ�.
//
//class Point implements Cloneable {
//	int x;
//	int y;
//
//	Point(int x, int y) {
//		this.x = x;
//		this.y = y;
//	}
//
//	@Override 
//	public String toString() {
//		return "x="+x +", y="+y;
//	}
//
//	public Object clone() {
//		Object obj = null;
//		try {
//			obj = super.clone();  // clone()�� �ݵ�� ����ó���� ���־�� �Ѵ�. / Object�� Clone()
//		} catch(CloneNotSupportedException e) {}
//		return obj;
//	}
//}
//
//class CloneEx1 {
//	public static void main(String[] args){
//		Point original = new Point(3, 5);
//		System.out.println(original + "\n");
//		
//		Point copy = (Point)original.clone(); // ����(clone)�ؼ� ���ο� ��ü�� ����
//		System.out.println(copy + "\n" );
//		
//		System.out.println(original == copy); // false
//		
//		Point original2 = original; 		// ��������
//		System.out.println(original2 == original); // true
//		
//		// ��(new) ��ü�� ����� ���� ��ü�� ����������� ���� �� ��ü�� ��������� ������ �ִ´�.
//		Point original3 = (Point) original.clone();		// �������� 
//		System.out.println(original3 == original); // false
//		
//		
//	}
//}
