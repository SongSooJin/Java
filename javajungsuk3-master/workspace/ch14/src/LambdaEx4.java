//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Consumer;
//// Lambda(����) : ��ü�ϳ� �޼ҵ��ϳ�
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
//		// list�� ��� ��Ҹ� ���
//		list.forEach(action);
//		System.out.println();
//		
//		list.forEach(i->System.out.print(i+",")); // �ݺ� ������ ���� 
//		System.out.println();
//		
//		System.out.println("\n-----------------");
//
//		// list���� 2 �Ǵ� 3�� ����� �����Ѵ�.
//		// ��ü���� ���α׷��� VS �Լ��� ���α׷�
//		// �Լ��� ���α׷����� �Լ��� ������ ���·� �и��� ����
//		// �����ؼ� ����Ѵ� ����� ������ �� ��뼺�� �ش�ȭ�� �� �ִ� ����̴�.
//		// ��ü���� ���α׷��ֿ��� ���� ����Ѵ� ��ƿ Ŭ������ ����ϸ�
//		// �Լ� �� ��뼺�� �ش�ȭ �ϱ� ���ؼ� ��ü �� �ϳ��� �޼ҵ常 ��ġ�ϴ�
//		// ���¸� ��� �ȴ�.
//		list.removeIf(x -> x%2==0 || x%3==0); // ��ü�� ��ü 
//		System.out.println(list);
//
//		list.replaceAll(i->i*10); // list�� �� ��ҿ� 10�� ���Ѵ�. // ���� �ٲܼ� ����
//		System.out.println(list);
//
//		Map<String, String> map = new HashMap<>();
//		map.put("1", "1");
//		map.put("2", "2");
//		map.put("3", "3");
//		map.put("4", "4");
//
//		// map�� ��� ��Ҹ� {k,v}�� �������� ����Ѵ�.
//		map.forEach((k,v)-> System.out.print("{"+k+","+v+"},"));
//		System.out.println();
//		
//	}
//	
//}
