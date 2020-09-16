//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.Iterator;
//import java.util.function.Predicate;
//
//
//public class ArrayListEx1_Test {
//
//	public static void main(String[] args) {
//
//		// ���ڿ� �ټ�(������ �Ź� �޶���)�� �Ѳ����� �����Ѵ�.
//		// �������� ����(������ ����Ǿ�� ��)�� �� �� ����� ����.
//		
//		
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Tom");
//		names.add("Chris");
//		names.add("Mina");
//		
//		System.out.println(names.size());
//		
//		for ( String n : names ) {
//			System.out.print(n+" ,");
//		}
//		System.out.println("");
//		
//		System.out.println(names.toString());
//		System.out.println(names.get(names.size()-1));
//		
//		System.out.println(" ");
//		
//		names.add("Iaan");
//		System.out.println(names.toString());
//		
//		Collections.sort(names); // ��������
//
//		// iterator : �ݺ� / �ݺ��۾��� ������ �� ����� �� �ִ� �÷����� ǥ�ر��� 
//		Iterator<String> iter = names.iterator();
//		
//		while (iter.hasNext()) {
//			System.out.print(iter.next()+" ");
//			
//		}
//		System.out.println(" ");
//		Comparator<Object> comparator = Collections.reverseOrder();
//		
//		// names�� ����Ű�� ArrayList<String> ��ü�� �����ϴ�
//		// <String> ���ڿ��� �� ���� ���ʴ�� ������ 
//		// comparator ��ü�� int  compare(T o1, T o2); ��� �޼ҵ忡��
//		// �Ķ���ͷ� �����Ͽ� ū �Ͱ� ���� ���� ������ ���� �̸� �������� ������ �����Ѵ�.
//		Collections.sort(names, comparator);
//		
//		System.out.println(names);
//		// [Tom, Mina, Iaan, Chris]
//		
//		names.remove("Chris");
//		System.out.println(names);
//		// [Tom, Mina, Iaan]
//		
//		names.remove(2);
//		System.out.println(names);
//		// [Tom, Mina]
//		
//		
//		// ���ڿ��� �ܾ� a�� ������ ������.
//		// �޼ҵ忡�� �����ϴ� filter ������ �����Ͽ�  true�̸� �ش� �����͸� �����Ѵ�.
//		Predicate<? super String> filter = new Filter();
//		// true/false ���θ� �Ǵ��ϴ� Predicate �������̽� �������� 
//		// �����޼ҵ� test�� ����ϴ°��� removeIf �޼ҵ� �� ������ ó���Ѵ�.
//		names.removeIf(filter);
//
//		System.out.println(names);
//		// [Tom]
//
//	}
//}
//
//// Predicate : true or false �Ǵ��Ͽ� ���� 
//class Filter implements Predicate<String> {
//
//	@Override
//	public boolean test(String txt) {
//		// ���ڿ� �ȿ� a��� ���ڰ� �ִٸ� true�� �����Ѵ�. ==> �ش� ���ڿ��� �����ȴ�.
//		return txt.contains("a");
//		
//	}
//	
//}