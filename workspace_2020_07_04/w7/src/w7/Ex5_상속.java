package w7;/*�Ļ���ü���忡���� �θ��� public�� public�̰�
�θ��� private�� private�̴�.
�θ������ �켱���� :   �μ����� ������ >  �μ��ִ� ������
 */
public class Ex5_��� {

	public static void main(String[] args) {
		Student p=new Student();
		Student q=new Student("ȫ �� ��",20,"000-1111-2222",75.8);
		System.out.println("p--");
		p.disp();
		System.out.println("q--");
		q.disp();
	}
}
class Person{
	private String name;
	private int age;
	public int getAge(){ return age; }
	public String  getName(){ return name; }
	public Person() {System.out.println("�θ��� �μ����� ������...");}
	public Person(String name,int age){
		this.name=name; this.age=age;
		System.out.println("�θ��� �μ��ִ� ������...");
	}
}
class Student extends Person{
	private String tel;
	private double weight;
	public Student() {System.out.println("�ڳ��� �μ����� ������...");}
	public Student(String name,int age,String tel,double weight){
		super(name,age);//�θ��� �μ��ִ� ������ ����� ȣ��!!
		this.tel=tel;
		this.weight=weight;
		System.out.println("�ڳ��� �μ��ִ� ������...");
	}
	public void disp(){
		System.out.println("��    �� : "+getName() );
		System.out.println("��    �� : "+getAge() );
		System.out.println("�� �� ó : "+tel);
		System.out.println("ü    �� : "+weight);
		System.out.println();
	}
}



