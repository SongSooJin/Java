package p;

class  Person {
	String name;
	String id;

	public Person(String name, String id) {
		this.name = name;
		this.id = id;
	 }
	
}

class  Student extends Person {
	String grade;
	String department;

	public Student(String name,String id,String grade, String department) {
		super(name,id);
		this.grade = grade;
		this.department = department;
	 }
}


public class UpcastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person  p;
		Student s = new Student("이재문","aaa","A","영문학");
		p = s; // 업캐스팅 발생
		
		System.out.println(p.name); // 오류 없음
		System.out.println(p.id); // 오류 없음
		System.out.println(s.grade); // 오류 없음
		System.out.println(s.department); // 오류 없음
		System.out.println(s.name); // 오류 없음
		//System.out.println(p.grade); // 오류

		//p.grade = "A"; // 컴파일 오류
		//p.department = "Com"; // 컴파일 오류

	}

}
