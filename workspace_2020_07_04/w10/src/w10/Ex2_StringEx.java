package w10;

public class Ex2_StringEx {

	public static void main(String[] args) {
		
		String a = new String(" C#");
		String b = new String(",C++ ");

		System.out.println(a + "의 길이는 " + a.length()); // 문자열의 길이(문자 개수)
		System.out.println(a.contains("#")); // true
		System.out.println(a.contains("")); // true
		System.out.println(a.contains("*")); // false
		// contains() : 문자열의 포함 관계묻는 함수 , 문자열에서 ()문자열이 있는지
		System.out.println("-------------------------------------");
		
		a = a.concat(b); // 문자열 연결  : 공백C#,C++공백
		System.out.println(a); // 공백C#,C++공백
		System.out.println(a.length()); // 공백C#,C++공백 = 8
		System.out.println("-------------------------------------");

		a = a.trim(); // 문자열 앞 뒤의 공백 제거
		System.out.println(a); // C#,C++
		System.out.println(a.length()); // 6
		System.out.println("-------------------------------------");

		a = a.replace("C#","Java"); // replace() :문자열 대치, 원래 C#이 있는 자리에 ,뒤에 문자열로 바꿔라
		System.out.println(a); // Java,C++
		System.out.println("-------------------------------------");

		String s[] = a.split(","); // split() : 문자열 분리, ,기준으로 분리해라
		for (int i=0; i<s.length; i++) {
			System.out.println("분리된 문자열" + i + ": " + s[i]);
			// 분리된 문자열0: Java , s[0] = "Java"
			// 분리된 문자열1: C++ , , s[1] = "C++"
		}
		System.out.println("-------------------------------------");

		a = a.substring(5); 
		// substring() : 인덱스 5부터 끝까지 서브 스트링 리턴
		// a = Java,C++ = 5번인 C부터 문자열 리턴
		System.out.println(a); //C++
		System.out.println("-------------------------------------");

		char c = a.charAt(2); 
		// charAt() : 인덱스 2의 문자 리턴
		// a = C++ = 2번인 +문자 리턴
		System.out.println(c); // + 
		System.out.println(a.charAt(0)); // C 		
		System.out.println("-------------------------------------");
		
	}

}
