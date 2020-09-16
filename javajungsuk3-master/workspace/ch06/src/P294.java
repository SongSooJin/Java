//
//public class P294 {
//	public static void main(String[] args) {
//			House house1 = new House();
//			
//			System.out.println(house1.color);
//			
//			House house2 = new House("blue", 4);
//			
//			System.out.println(house2.color);
//	}
//}
//
//class House {
//	String color = "white";
//	int rooms = 3;
//	
//	public House() {
//		System.out.println("House() called.");
//	}
//	
//	
//	public House(String color, int rooms) {
//		super();
//		// this : 객체상태인 자기자신을 지칭한다. 여기선 House를 가르킴 
//		this.color = color;
//		this.rooms = rooms;
//		System.out.println("House (String color, int rooms) called.");
//	}
//
//
//	public void openDoor() {
//		System.out.println("문을 열고 들어간다.");
//	}
//}
