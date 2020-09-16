//import java.util.function.*;
//import java.util.*;
//
//class LambdaEx5 {
//	public static void main(String[] args) {
//		
//		Supplier<Integer> s1 = new Supplier<Integer>() {
//			@Override
//			public Integer get() {
//				return (int)(Math.random()*100)+1;
//			}
//		};
//		
//		// 파라미터 무 , 리턴 유, 리턴자료형은 <지네릭형>
//		Supplier<Integer>  s = () -> (int)(Math.random()*100)+1;
//		
//		// 파라미터 유, 리턴 무, 파라미터 자료형은 <지네릭형>
//		Consumer<Integer>  c = i -> System.out.print(i+", "); 
//		
//		// 파라미터 유, 리턴 유, 파라미터 자료형은 <지네릭형> 
//		// 리턴 값은 true or false
//		Predicate<Integer> p = i -> i%2==0; 
//		
//		// 파라미터 유, 리턴 유, 리턴 값은 <파라미터 자료현, 리턴 자료형>
//		Function<Integer, Integer> f = i -> i/10*10; // i의 일의 자리를 없앤다.
//
//		List<Integer> list = new ArrayList<>();	
//		makeRandomList(s, list);
//		System.out.println(list);
//		printEvenNum(p, c, list);
//		List<Integer> newList = doSomething(f, list);
//		System.out.println(newList);
//	}
//
//	static <T> List<T> doSomething(Function<T, T> f, List<T> list) {
//		List<T> newList = new ArrayList<T>(list.size());
//
//		for(T i : list) {
//			newList.add(f.apply(i));
//		}	
// 
//		return newList;
//	}
//
//	static <T> void printEvenNum(Predicate<T> p, Consumer<T> c, List<T> list) {
//		System.out.print("[");
//		for(T i : list) {
//			if(p.test(i))
//				c.accept(i);
//		}	
//		System.out.println("]");
//	}
//
//	static <T> void makeRandomList(Supplier<T> s, List<T> list) {
//		for(int i=0;i<10;i++) {
//			list.add(s.get());
//		}
//	}
//}
