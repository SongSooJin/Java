package w8;
/*
 * protected멤버 : 동일 패키지와 자식 클래스에 허용
 */

public class Ex8_protected멤버 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			SS q=new SS("홍 길 동",20,"000-1111-2222",75.8);
			System.out.println("q--");
			System.out.println("이    름 : "+q.getName() );
			System.out.println("나    이 : "+q.age );
			System.out.println("연 락 처 : "+q.getTel() );
			System.out.println("체    중 : "+q.getWight() );
			
	}

}
