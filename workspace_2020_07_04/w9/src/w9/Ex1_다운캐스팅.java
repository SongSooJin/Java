package w9;

/*
 * 다운캐스팅(downcasting)
 * 
 * 슈퍼 클래스 레퍼런스를 서브 클래스 레퍼런스에 대입
 * 업캐스팅된 것을 다시 원래대로 되돌리는 것
 * 반드시 명시적 타입 변환 지정
 *
*/

public class Ex1_다운캐스팅 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
	
		Person p = new Student("이재문"); // 업캐스팅
		p.id="11aa";
		
		Student s = (Student)p; // 다운캐스팅, 강제타입변환
		s.id="88abc";
		s.grade="abcdefg";
		s.department="123456xd";
		System.out.printf("s.id : \t s.grade : ",s.id , s.grade );
	
	}

}

class Person {
	String name;
	String id;

	public Person(String name) {
	this.name = name;
	}
	
}

class Student extends Person { 
	
	String grade;
	String department;

	public Student(String name) {
		super(name);
	 }

}



