//package p491;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class p491 {
//	
//	public static void main(String[] args) {
//	
//		int[] nums = {10, 20, 30};
//		// java.lang.ArrayIndexOutOfBoundsException
//		// nums[nums.length] = 40;
//		
//		// ���� �ӵ��� �ֿ켱�̶�� �迭�� ��������� �׷��� ���� ���
//		// ����� ���� ������ ��ȣ�ϰ� �ȴ�. ������� Collection Ŭ�������� ��� ����Ѵ�.
//		
//		// �����迭
//		// <Integer> : <����ϴ��ڷ���> : ���׸�, ����Ÿ���������� ����
//		List<Integer> number = new ArrayList<Integer>(); 
//		number.add(10); 	 // �ڵ����� new Integer(10)�� ó����
//		number.add(20);
//		number.add(30);
//		number.add(number.size()-1,40);
//		number.add(new Integer(100));
//		
//		// �⺻ �ڷ���  8���� ��üŸ������ ����� �� �ֵ��� �� �ڷ������� �����ϴ� Ŭ������ �ִ�.
//		// �̵鰣�� ����ȯ�� ���� ���ڵ��̴�.
//		int a = 10;
//		Integer aa = a; 	// ����Ÿ�� ==> ����ڽ�(auto boxing) ==> ��üŸ��
//		a = aa; 	// ��üŸ�� ==> �����ڽ�(auto unboxing) ==> ����Ÿ��
//		
//		Number bb= new Integer(100);
//		int b = (int)bb;
//		
//		double x = add(2,3);
//	
//	}
//
//	private static double add(int i, Number j) {
//		
//		return  i+j.doubleValue();
//	}
//	
//}
