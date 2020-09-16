package w8;

/*
 * protected멤버변수 : 자녀 class변수
 * 
 */

public class Ex7_protected멤버변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SS p=new SS();
		SS q=new SS("홍 길 동",20,"000-1111-2222",75.8);
		System.out.println("p--");
		p.disp();
		System.out.println("q--");
		q.disp();
	}
}

class Person{
	private String name;
	protected int age;	
	public String  getName(){ return name; }
	public Person() {System.out.println("부모의 인수없는 생성자...");}
	public Person(String name){
		this.name=name; 
		System.out.println("부모의 인수있는 생성자...");
	}
}
class SS extends Person{
	private String tel;
	private double weight;
	public double getWight(){return weight;}
	public String getTel(){ return tel;  }
	public SS() {System.out.println("자녀의 인수없는 생성자...");}
	public SS(String name,int age,String tel,double weight){
		super(name);//부모의 인수있는 생성자 명시적 호출!!
		this.age=age;
		this.tel=tel;
		this.weight=weight;
		System.out.println("자녀의 인수있는 생성자...");
	}
	public void disp(){
		System.out.println("이    름 : "+getName() );
		System.out.println("나    이 : "+age );
		System.out.println("연 락 처 : "+tel);
		System.out.println("체    중 : "+weight);
		System.out.println();
	}

}
