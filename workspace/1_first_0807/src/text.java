
public class text {

	public static void main(String[] args) {
		//설계도를 사용하여 사이버 세계에서 사용할 수있는 실체를 만든다.
		// TODO Auto-generated method stub
		new tv_0807();
		//tv 설계도를 사용하여 new 새 객체를 메모리에 할당하여 만든다.
		//이 객체는 개발자가 지정 할 수 있는 방법이 없으므로 이용할 수 없다.
		
	tv_0807 x =	new tv_0807();
	// 새롭게 만들어진 객체에 x라는 태그를 붙여 놓는다.
	// 개발자는 이 태그명으로 tv 객체를 지칭하여 사용할 수 있다.
	// tv_0807 x 코드의 의미는 x가 가리키는 대상은 tv 설계도로 만들어진 객체다라는 의미.
	
	x.켜기();
	// x가 가리키는 대상은 객체이다.
	// 객체는 그 안에 다수의 상태와 기능을 갖는다.
	//객체가 갖고 있는 상태와 기능들 중에서 특정한 것을 사용하기 위해서. 표현법 다음에 해당 상태/기능을 정의한다.
	
	String color= x.색상;
	System.out.println(color);
	
	}

}
