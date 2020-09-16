package w7;/*파생객체 생성시, 먼저 자녀생성자로 제어가 넘어온후,
부모생성자를 자동으로 호출하여 실행후, 호출위치로 복귀후
자녀생성자 실행 

*/

public class Ex4_상속 {

	public static void main(String[] args) {
		BBB p=new BBB();//파생객체를 생성후, 객체레퍼런스변수 p에게 객체의 주소를 반환 
        
	}

}
class AAA{
	 public AAA() {System.out.println("부모생성자...");}
}
class BBB extends AAA{ //부모AAA클래스를 상속한 자녀 클래스 BBB
	 public BBB() {  System.out.println("자녀생성자...");}
}


/*
 * 1. 상속
0) 코드의 재사용
    data가 풍부
1) 부모class==base class == 기본class
    자녀class == derived class == 파생class
2) 파생객체입장에서는 부모의 public은 public이고
                            부모의 private은 private이다.


이름 (인)위에 정자로 이름 쓰고,

 */




