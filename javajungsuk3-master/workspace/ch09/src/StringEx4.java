//import java.util.Arrays;
//import java.util.StringJoiner;
//
//class StringEx4 {
//	public static void main(String[] args) {
//		String animals = "dog,cat,bear";
//		
//		String[] arr   = animals.split(",");
//		System.out.println(Arrays.toString(arr));
//		
//		System.out.println(String.join("-", arr));
//		System.out.println(String.join("-", "가" , "나" , "다" , "라"));
//		/*
//		 * String java.lang.String.join(CharSequence delimiter, CharSequence... elements)
//		 * 	스트링은 CharSequence 인터페이스 구현체 이므로 CharSequence를 달라고 할때
//		 * 대신 스트링 객체를 줄 수 있다.
//		 *	
//		 * */
//		StringJoiner sj = new StringJoiner("/","[","]");
//		for(String s : arr)
//			sj.add(s);
//
//		System.out.println(sj.toString());
//	}
//}
