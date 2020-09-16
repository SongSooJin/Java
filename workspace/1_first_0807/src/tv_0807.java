// C언어의 구조체(Structure): 여러값을 모아서 하나로 사용하는 방법으로
// 자바클래스에서 속성만 정의해서 사용하는 것과 같다.
public class tv_0807 {
	
	//속성(값)
	String 크기="50";
	String 길이="10";
	String 높이="5";
	String 색상="검은색";
	
	//기능(동작,행위)
	public void 켜기() {
		System.out.println("tv가 켜진다.");
		
	}
	public void 끄기() {
		System.out.println("tv가 꺼진다.");
	}
	public void 채널변경하기() {
		System.out.println("tv 채널이 바뀐다.");
	}

}
