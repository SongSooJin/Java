package w4;
/*
 * 'a'부터 'z'까지 출력
 */
public class Ex13_알파벳 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		char ch = 'a'; //-32768<=char(2)<=32767
				
				do {
					System.out.print(ch);
					ch = (char) (ch + 1); //강제적형변환 주의
				} while (ch <= 'z');
				
				
	}

}
