package w9;

class Point {
	int x, y;
	public Point(int x, int y) {
		this.x = x; this.y = y;
	}
	
	//ObjectŬ������ String toString(){}�� ����
	public String toString() {
		String ss = "("+x+","+y+")";
		return ss;
	}
	
	//ObjectŬ������ boolean equals(another Object){}�� ����
	public boolean equals(Point rb) {
//		if(x==rb.x && y==rb.y) 
//			return true;
//		else
//			return false;
		return (x==rb.x && y==rb.y)?true:false;
		}
}


public class ObjectPropertyEx {

	public static void main(String[] args) {
		Point p = new Point(2,3);
		Point q = new Point(12,13);
		System.out.println(p.getClass()); 	//class w9.Point
		System.out.println(p.getClass().getName()); 	// w9.Point // Ŭ���� �̸� 
		System.out.println(p.hashCode()); 	// 366712642 // �ؽ� �ڵ� ��
		System.out.println(q.hashCode()); 	// 1829164700 // �ؽ� �ڵ� ��
		System.out.println(p.toString()); 		// w9.Point@15db9742 // ��ü�� ���ڿ� // toString�� ������(�޼ҵ� �������̵���)-->(2,3)	
		
		//����ü + ���ڿ��� -> ����ü.toString() + ���ڿ����� �ڵ� ��ȯ
		String s = q.toString() + "��"; //String s = q + "��";
		//��ü�� �ܵ����� ��� �ϴ� ��� -> ��ü.toString()���� �ڵ���ȯ	
		System.out.println(q.toString()); // System.out.println(q); 	 
		
	}

}