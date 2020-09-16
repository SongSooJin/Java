package w6;

public class Ex12_객체 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Sinsang p = new Sinsang(); // Sinsang객체 레퍼런스변수 p선언
		//new 연산자가 생성자함수로 객체를 생성후, 그의 위치값을 반환
		Sinsang q = new Sinsang("홍길동",20,75.8); // Sinsang객체 레퍼런스변수 p선언
		System.out.println("p--");
		p.disp();
		System.out.println("q--");
		q.disp();
		
		
	}

}

class Sinsang{
	private String name;
	private int age;
	private double weight;
	public Sinsang() {System.out.println("생성자 call!!");}
	public Sinsang(String _name,int _age,double _weight) {
		name= _name; //멤버변수=매개변수;
		age=_age;
		weight=_weight;
		System.out.println("인수있는 생성장 call!!");
	}
	public void disp() {
		System.out.printf("이름 : %s\n",name);
		System.out.printf("나이 : %s\n",age);
		System.out.printf("체중 : %s\n",weight);
	}
}


/*
 * 객체 : class의 자료형으로 생성
 * 1) class : 틀 (붕어빵틀)
 * 		class의 구성 : 멤버변수 + 멤버메소드
 * 2) 객체 : class의 자료형으로 생성 (붕어빵)
 * 3) class의 정의
 * class 클래스명 {
 * 		private 멤버변수1의 선언;
 * 		private 멤버변수2의 선언;
 * 		public 멤버메소드1의 정의
 * 		public 멤버메소드2의 정의
 *} 
 *4) 접근제어자 
 *public : 공용 / class내부든 외부든 접근가능
 *private : class전용  / class외부[main(),사용자함수]에서 접근 불가 / class내부의 멤버메소드에서만 접근가능
 *접근지정자 생략시 == default 접근지정자 : 같은 패키지 안에서는 접근 가능
 * 
 * 생성자함수
 * 1) 객체 생성시 필요
 * 2) 생정자함수명은 class명과 같고, 반환값은 없음.
 * 3) pg가 생성자 함수를 삽입하지 않으면, compiler가 자동삽입 ==default생성자
 * 		pg가 생성자 함수를 삽입하면, , compiler는 생성자함수에 관여하지 않음.  pg 가 생성자 함수를 책임지고 코딩!
 * 4) default생성자의 형태
 * 		pubilc class명() {}
 * 5) 함수의 오버로딩 성질이 있음
 * 
 * 
 * 함수의 구별
 * 1) c언어,python : 함수명으로만 구분 , 함수의 오버로딩 성질 없음
 * 2) c++,java,c# : 함수명, 인수의 갯수, 인수의 자료형, 함수의 오버로딩 성질 있음
 *     -- 함수의 오버로딩 : 같은 함수명 상태에서 인수의 갯수와 인수의 자료형이 다르면 
 *     							서로 다른 함수로 구별 
 * 
 * 
 * 객체참조레퍼런스 this :
 * 1) 객체 생성시, 생성자 함수안으로 들어가는 순간 자동으로 생기는 
 * 		객체 자신을 참조하는 레퍼런스이다.
 * 
 * 
 * 
 * 
 * 
 */