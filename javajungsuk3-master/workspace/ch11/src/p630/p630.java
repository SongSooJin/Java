//package p630;
//
//import java.util.Arrays;
//
//public class p630 {
//
//	public static void main(String[] args) {
//		User u1 = new User("David", 30);
//		User u2 = new User("John", 20);
//		User u3 = new User("Brad", 40);
//		
//		User[] users = {u1, u2, u3};
//		print(users);
//		
//		Arrays.sort(users);
//		print(users);
//	}
//
//	private static void print(User[] users) {
//		for (User user : users) {
//			System.out.print(user + " ,");
//		}
//		System.out.println( );
//	}
//	
//	
//}
//
//class User implements Comparable<User> {
//	String name;
//	int age;
//	
//	public User(String name, int age) {
//		super();
//		this.name = name;
//		this.age = age;
//	}
//	
//	@Override
//	public  String toString() {
//		return "User {name=" + name +" ," + age + "}";
//		
//	}
//
//	@Override
//	public int compareTo(User o) {
//		if (this.age == o.age) {
//			return 0;
//			}
//		else if (this.age > o.age) {
//			return 1;
//			} 
//		else {
//			return -1;
//			}
//		
//	}
//	
//	
//}