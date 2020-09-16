package w10;

/*
 * StringTokenizer
 * 
 * 구분 문자를 기준으로 문자열을 분리하는 클래스
 * 구분 문자(delimiter) : 문자열을 구분할 때 사용되는 문자
 * 토큰(token) : 구분 문자로 분리된 문자열
 */

import java.util.StringTokenizer;

public class Ex5_StringTokenizer클래스 {

	public static void main(String[] args) {
		
		String query = "name=kitae&addr=seoul&age=21";
		StringTokenizer st = new StringTokenizer(query, "&");

		int n = st.countTokens(); 					// countTokens() : 분리된 토큰 개수, 토큰 개수 알아내기
		System.out.println("토큰 개수 = " + n); // 토큰 개수 = 3

		while(st.hasMoreTokens()) { 
			String token = st.nextToken(); 		// nextToken() : 토큰 얻기 , 다음 토큰 얻어내기
			System.out.println(token); 				// 토큰 출력
		}

		System.out.println("----------------------------------------");
		
		String query1 = "name=kitae&addr=seoul&age=21";
		StringTokenizer st1 = new StringTokenizer(query1, "&="); // 구문 문자는 2개 , '&'와 '=' 


		int n1 = st1.countTokens(); 					// countTokens() : 분리된 토큰 개수, 토큰 개수 알아내기
		System.out.println("토큰 개수 = " + n1); // 토큰 개수 = 6

		while(st1.hasMoreTokens()) { 
			String token = st1.nextToken(); 		// nextToken() : 토큰 얻기 , 다음 토큰 얻어내기
			System.out.println(token); 				// 토큰 출력
		}


	}

}
