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
		Student s = new Student("���繮","aaa","A","������");
		p = s; // ��ĳ���� �߻�
		
		System.out.println(p.name); // ���� ����
		System.out.println(p.id); // ���� ����
		System.out.println(s.grade); // ���� ����
		System.out.println(s.department); // ���� ����
		System.out.println(s.name); // ���� ����
		//System.out.println(p.grade); // ����

		//p.grade = "A"; // ������ ����
		//p.department = "Com"; // ������ ����

	}

}
