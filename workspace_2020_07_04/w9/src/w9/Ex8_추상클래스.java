package w9;

/*
 * abstract
 * 
 * 추상 클래스는 온전한 클래스가 아니기 때문에 인스턴스를 생성할 수 없음
 *
 */

public class Ex8_추상클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//JComponent p = new JComponent(); 추상 클래스의 인스턴스 생성 불가
		JComponent q ; // 오류 없음. 추상 클래스의 레퍼런스 선언

		
	}

}


//추상 메소드 없는 추상 클래스
abstract class JComponent { 
	String name;
	void load(String name ) {
		this.name= name;
	}
}
