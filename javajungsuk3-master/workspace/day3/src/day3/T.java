//package day3;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class T {
//	public static void main(String[] args) {
//
//		/*
//		 * ���׸��� �ڵ��Ҷ� Ÿ�� �������� Ȯ���ϱ� ���� ����ϴ� �����
//		 * ������ �ϸ� ���׸����� ���尡 ��� �������.	
//       * ���� ���׸��� ����ĳ������ �������� �ʴ´�
//       */
//		
//		
//		List<? extends Object> names;
//
//		names = new ArrayList<String>();
//		names = new ArrayList<Integer>();
//		names.add(null);
//
//		List<Object> names2;
////		names2 =  new ArrayList<String>();
////		names2 =  new ArrayList<Integer>();
////		names2.add(null);
//
//	}
//}
//
//class mybox <T extends Object> {
//	List<T> list = new ArrayList<T>();
//
//	public T getLAst(List<T> data) {
//		return list.get(list.size() - 1);
//	}
//
//	public void setList(List<? extends Object> data) {
//		list = (List<T>)data;
//	}
//}
//
