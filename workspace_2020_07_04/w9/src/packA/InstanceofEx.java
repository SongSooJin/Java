package packA;

public class InstanceofEx {
	
	static void print(Person p) {
		if(p instanceof Person) 
			System.out.print("Person ");
		if(p instanceof Student) 
			System.out.print("Student ");
		if(p instanceof Researcher) 
			System.out.print("Researcher ");
		if(p instanceof Professor) 
			System.out.print("Professor ");
		System.out.println();
	}


	public static void main(String[] args) {
		
		System.out.print("new Student() -> "); 		print(new Student());
		// Person p = new Student(); ��ĳ����
		System.out.print("new Researcher() -> "); print(new Researcher());
		System.out.print("new Professor() -> "); 	print(new Professor());
	}

}
