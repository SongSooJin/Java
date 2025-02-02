package w10;

import java.util.Vector;

public class Ex16_Vector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector<Integer>();
		System.out.println(v.capacity()); // 저장할수 있는 용량의 크기 10 , 사이즈를 정하지 않으면 자동 10개의방 생성
		v.add(7); 
		v.add(new Integer(4));
		v.add(-1);
		// 7 4 -1
		
		int s = v.size(); //요소의 개수
		int c = v.capacity(); // 용량의 개수
		System.out.println("요소의 개수 : "+v.size()); // 요소의 개수 : 3
		System.out.println("용량의 크기 : "+v.capacity()); //용량의 크기 : 10
		
		v.add(2,100); // 요소중간에 삽입 , 2번째에 100삽입 , 단 v.size()보다 큰곳에 삽입 불가 
		System.out.println("요소의 개수 : "+v.size()); // 요소의 개수 : 4 ,인덱스 =  7 4 100 -1
		v.remove(3); // 3번째 값 삭제 
		System.out.println("요소의 개수 : "+v.size()); // 요소의 개수 : 3 ,인덱스 =  7 4 100
		
//		Integer obj = v.get(2);
//		int i = obj.intValue();
//		System.out.println("2번째 값 : "+obj.intValue()); // 2번째 값 : 100
	//	v.add(new Integer(4));
		v.add(4); 
		int k = v.get(3); // Integer 타입이 int 타입으로 자동 언박싱, k = 4

		System.out.println("요소의 개수 : "+v.size()); // 요소의 개수 : 4 ,인덱스 =  7 4 100 4
		
	}

}
