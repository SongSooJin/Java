package w10;

import java.util.Vector;

public class Ex16_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity()); // �����Ҽ� �ִ� �뷮�� ũ�� 10 , ����� ������ ������ �ڵ� 10���ǹ� ����
		v.add(7); 
		v.add(new Integer(4));
		v.add(-1);
		// 7 4 -1
		
		int s = v.size(); //����� ����
		int c = v.capacity(); // �뷮�� ����
		System.out.println("����� ���� : "+v.size()); // ����� ���� : 3
		System.out.println("�뷮�� ũ�� : "+v.capacity()); //�뷮�� ũ�� : 10
		
		v.add(2,100); // ����߰��� ���� , 2��°�� 100���� , �� v.size()���� ū���� ���� �Ұ� 
		System.out.println("����� ���� : "+v.size()); // ����� ���� : 4 ,�ε��� =  7 4 100 -1
		v.remove(3); // 3��° �� ���� 
		System.out.println("����� ���� : "+v.size()); // ����� ���� : 3 ,�ε��� =  7 4 100
		
//		Integer obj = v.get(2);
//		int i = obj.intValue();
//		System.out.println("2��° �� : "+obj.intValue()); // 2��° �� : 100
	//	v.add(new Integer(4));
		v.add(4); 
		int k = v.get(3); // Integer Ÿ���� int Ÿ������ �ڵ� ��ڽ�, k = 4

		System.out.println("����� ���� : "+v.size()); // ����� ���� : 4 ,�ε��� =  7 4 100 4
		
	}

}