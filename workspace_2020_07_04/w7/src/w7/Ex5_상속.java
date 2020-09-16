package w7;/*파생객체입장에서는 부모의 public은 public이고
부모의 private은 private이다.
부모생성자 우선순위 :   인수없는 생성자 >  인수있는 생성자
 */
public class Ex5_상속 {

	public static void main(String[] args) {
		Student p=new Student();
		Student q=new Student("홍 길 동",20,"000-1111-2222",75.8);
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
	public Person() {System.out.println("부모의 인수없는 생성자...");}
	public Person(String name,int age){
		this.name=name; this.age=age;
		System.out.println("부모의 인수있는 생성자...");
	}
}
class Student extends Person{
	private String tel;
	private double weight;
	public Student() {System.out.println("자녀의 인수없는 생성자...");}
	public Student(String name,int age,String tel,double weight){
		super(name,age);//부모의 인수있는 생성자 명시적 호출!!
		this.tel=tel;
		this.weight=weight;
		System.out.println("자녀의 인수있는 생성자...");
	}
	public void disp(){
		System.out.println("이    름 : "+getName() );
		System.out.println("나    이 : "+getAge() );
		System.out.println("연 락 처 : "+tel);
		System.out.println("체    중 : "+weight);
		System.out.println();
	}
}



