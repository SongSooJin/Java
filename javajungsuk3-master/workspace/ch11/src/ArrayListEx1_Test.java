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
//		// 문자열 다수(개수는 매번 달라짐)를 한꺼번에 보관한다.
//		// 오름차순 정렬(순서가 보장되어야 함)을 한 후 출력해 본다.
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
//		Collections.sort(names); // 오름차순
//
//		// iterator : 반복 / 반복작업을 수행할 때 사용할 수 있는 컬렉션의 표준기준 
//		Iterator<String> iter = names.iterator();
//		
//		while (iter.hasNext()) {
//			System.out.print(iter.next()+" ");
//			
//		}
//		System.out.println(" ");
//		Comparator<Object> comparator = Collections.reverseOrder();
//		
//		// names가 가리키는 ArrayList<String> 객체가 보관하는
//		// <String> 문자열을 두 개씩 차례대로 꺼내서 
//		// comparator 객체의 int  compare(T o1, T o2); 라는 메소드에게
//		// 파라미터로 전달하여 큰 것과 작은 것을 구분한 다음 이를 바탕으로 정렬을 수행한다.
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
//		// 문자열에 단어 a가 있으면 지워라.
//		// 메소드에게 전달하는 filter 로직을 수행하여  true이면 해당 데이터를 삭제한다.
//		Predicate<? super String> filter = new Filter();
//		// true/false 여부를 판단하는 Predicate 인터페이스 구현제의 
//		// 구현메소드 test를 사용하는것은 removeIf 메소드 내 로직이 처리한다.
//		names.removeIf(filter);
//
//		System.out.println(names);
//		// [Tom]
//
//	}
//}
//
//// Predicate : true or false 판단하여 서술 
//class Filter implements Predicate<String> {
//
//	@Override
//	public boolean test(String txt) {
//		// 문자열 안에 a라는 글자가 있다면 true를 리턴한다. ==> 해당 문자열은 삭제된다.
//		return txt.contains("a");
//		
//	}
//	
//}