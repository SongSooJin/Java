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
//		System.out.println(String.join("-", "��" , "��" , "��" , "��"));
//		/*
//		 * String java.lang.String.join(CharSequence delimiter, CharSequence... elements)
//		 * 	��Ʈ���� CharSequence �������̽� ����ü �̹Ƿ� CharSequence�� �޶�� �Ҷ�
//		 * ��� ��Ʈ�� ��ü�� �� �� �ִ�.
//		 *	
//		 * */
//		StringJoiner sj = new StringJoiner("/","[","]");
//		for(String s : arr)
//			sj.add(s);
//
//		System.out.println(sj.toString());
//	}
//}
