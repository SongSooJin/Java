//import java.util.*;
//
//class HashSetEx1 {
//	public static void main(String[] args) {
//		Object[] objArr = {
//				"1",new Integer(1),
//				"2", "2", "3", "3", "4", "4", "4" 
//				};
//		
//		Set<Object> set = new HashSet<Object>();
//
//		for(int i=0; i < objArr.length; i++) {
//			set.add(objArr[i]);	// HashSet에 objArr의 요소들을 저장한다.
//		}
//             // HashSet에 저장된 요소들을 출력한다.
//		System.out.println(set);	
//	
//		
//		Iterator<Object> iter = set.iterator();
//		while (iter.hasNext()) {
//			Object value = iter.next();
//			
//			if (value instanceof String) {
//				System.out.println("String");
//			}
//			else if (value instanceof Integer) {
//				System.out.println("Integer");
//			}
//			else {
//			System.out.println("Else");
//			}
//			
//		}
//		
//		System.out.println(" ");
//		
//		Object[] data = set.toArray();
//		for (int i = 0; i < data.length; i++) {
//			System.out.print(data[i] +  " ");
//			
//			if (data[i] instanceof String) {
//				System.out.println("String");
//			}
//			else if (data[i] instanceof Integer) {
//				System.out.println("Integer");
//			}
//			else {
//			System.out.println(data[i]);
//			}
//		}
//		
//	}
//}
