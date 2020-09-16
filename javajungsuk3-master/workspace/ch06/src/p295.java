//
//public class p295 {
//	public static void main(String[] args) {
//		User user = new User();
////		user.id; // The field User.id is not visible
////		user.password;
////		user.email;
//		
//
//		System.out.println(user.getId());
//		System.out.println(user.getPassword());
//		System.out.println(user.getEmail());
//		
//		User u1 = new User();
//		User u2 = new User();
//		User u3 = new User();
//		
//		System.out.println(u1.getId());
//		System.out.println(u2.getId());
//		System.out.println(u3.getId());
//		
//		User u4 = new User("Go");
//		User u5 = new User("Cat");
//		User u6 = new User("TOY");
//	
//		System.out.println(u4.getId());
//		System.out.println(u5.getId());
//		System.out.println(u6.getId());
//	}
//}
//
///*
// * java Bean 규약
// * 자바빈은 프레임워크 코드와 개발자의 코드의 연동시 
// * 무리없이 연결되도록 데이터를 보관하는 클래스의 
// * 멤버변수, getter/setter 메소드를 선언하는 약속
// * */
//
//class User {
//	// private : 접근제어자(멤버변수에 누가 접근할수 있는지 여부를 결정하는 키워드)
//	// 일반적으로 멤버변수에 직접 접근하는 것을 막기위해 설정한다.
//	private String id = "Toom";
//	private String password = "1234";
//	// 멤버변수는 자동으로 초기화되는데 String  참조형이므로 null이 할당된다.
//	private String email;
//	
//	public User() {
//	
//	}
//	
//	public User(String id) {
//		this.id = id;
//	//	id = nick;
//		
//	}
//	
//	// getter 메소드 선언하는 방법
//	// get + 멤버변수명 (단, 멤버변수 맨 앞글자는 대문자로)
//	public String getId() { 
//		return id;
//	}
//	
//	// setter 메소드 선언하는 방법
//	// set + 멤버변수명 (단, 멤버변수 맨 앞글자는 대문자로)
//	public void setId(String id) {
//		this.id = id;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	
//}