package packA;

//객체레퍼런스 instanceof 클래스타입


public class Ex2_instanceof연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p = new Professor(); //업캐스팅

		if(p instanceof Person)
			System.out.println("Person객체 ");// true
		
		if(p instanceof Student) 	// false. Student를 상속받지 않기 때문
			System.out.println("Student객체 ");// true
		
		if(p instanceof Researcher)	// true
			System.out.println("Researcher객체 ");// true
		
		if(p instanceof Professor)// true
			System.out.println("Professor객체 ");// true

		System.out.println("HELLO" instanceof String);
		//System.out.println("HELLO" instanceof int); error 기본자료형은 못쓴다
		

	}

}
