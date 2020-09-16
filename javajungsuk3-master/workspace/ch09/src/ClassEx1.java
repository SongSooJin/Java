//final class Card3 {
//	String kind;
//	int num;
//
//	Card3() {
//		this("SPADE", 1);
//	}
//
//	Card3(String kind, int num) {
//		this.kind = kind;
//		this.num  = num;
//	}
//
//	public String toString() {
//		return kind + ":" + num;
//	}
//}
//
//class ClassEx1 {
//	public static void main(String[] args) throws Exception {
//		Card3 c  = new Card3("HEART", 3);       // new연산자로 객체 생성
//						// c. = Card3 / getClass = Object
//		Class<? extends Card3> cObj = c.getClass();
//		/*
//		 * Class<? extends Card3> java.lang.Object.getClass()
//		 * Class<취급하는 자료형>
//		 * Class 설계도로 만든 객체인데 이 객체는 Card3.class 와 관련된 모든 정보를 취급하거나 또는  
//		 * 그 자식(extends) 객체들 중에 하나(?)일 수도 있다.
//		 * */
//		
//		Card3 c2 = Card3.class.newInstance();   
//		// Class객체를 통해서 객체 생성
//		// Card3 c2  = new Card3();
//
//		System.out.println(c);
//		System.out.println(c2);
//		System.out.println(cObj.getName());
//		System.out.println(cObj.toGenericString());
//		System.out.println(cObj.toString());		
//	}
//}
