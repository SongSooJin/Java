//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Consumer;
//// Lambda(람다) : 객체하나 메소드하나
//class LambdaEx4 {
//	
//	public static void main(String[] args) 	{
//		
//		ArrayList<Integer> list = new ArrayList<>();
//		for(int i=0;i<10;i++)
//			list.add(i);
//		
//		for (Integer i : list) {
//			System.out.print(i + ",");
//		}
//		System.out.println("\n-----------------");
//	
//		Consumer<Integer> action = new Consumer<Integer>() {
//			@Override
//			public void accept(Integer i) {
//				System.out.print(i+",");
//			}
//		};
//		
//		// list의 모든 요소를 출력
//		list.forEach(action);
//		System.out.println();
//		
//		list.forEach(i->System.out.print(i+",")); // 반복 꺼내서 쓰자 
//		System.out.println();
//		
//		System.out.println("\n-----------------");
//
//		// list에서 2 또는 3의 배수를 제거한다.
//		// 객체지향 프로그래밍 VS 함수형 프로그램
//		// 함수형 프로그래밍은 함수를 순수한 상태로 분리한 다음
//		// 조립해서 사용한는 기술로 로직의 재 사용성을 극대화할 수 있는 기술이다.
//		// 객체지향 프로그래밍에서 자주 사용한는 유틸 클래스와 비슷하며
//		// 함수 재 사용성을 극대화 하기 위해서 객체 당 하나의 메소드만 배치하는
//		// 형태를 띄게 된다.
//		list.removeIf(x -> x%2==0 || x%3==0); // 실체는 객체 
//		System.out.println(list);
//
//		list.replaceAll(i->i*10); // list의 각 요소에 10을 곱한다. // 값을 바꿀수 있음
//		System.out.println(list);
//
//		Map<String, String> map = new HashMap<>();
//		map.put("1", "1");
//		map.put("2", "2");
//		map.put("3", "3");
//		map.put("4", "4");
//
//		// map의 모든 요소를 {k,v}의 형식으로 출력한다.
//		map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
//		System.out.println();
//		
//	}
//	
//}
