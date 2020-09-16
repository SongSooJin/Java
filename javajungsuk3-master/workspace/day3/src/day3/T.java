//package day3;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class T {
//	public static void main(String[] args) {
//
//		/*
//		 * 지네릭은 코딩할때 타입 안정성을 확보하기 위해 사용하는 기술로
//		 * 컴파일 하면 지네릭관련 콬드가 모두 사라진다.	
//       * 따라서 지네릭은 오토캐스팅을 지원하지 않는다
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
