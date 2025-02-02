//enum Direction { // 부모 클래스는 Enum
//	// 상수 : public static final
//	// 순서대로 기수가 붙는다. 0,1,2...
//	// 하나하나의 객체
//	EAST, SOUTH, WEST, NORTH
//}
//
//class EnumEx1 {
//
//	// 멤버변수
//	public static final int EAST = 0;
//	public static final int SOUTH = 1;
//	public static final int WEST = 2;
//	public static final int NORTH = 3;
//
//	public static void main(String[] args) {
//
//		// d1이 가리키는 것은 Direction 클래스의 자식 객체이다.
//		Direction d1 = Direction.EAST;
//		Direction d2 = Direction.valueOf("WEST");
//		Direction d3 = Enum.valueOf(Direction.class, "EAST");
//
//		System.out.println("d1=" + d1);
//		System.out.println("d2=" + d2);
//		System.out.println("d3=" + d3);
//
//		System.out.println("d1==d2 ? " + (d1 == d2));
//		System.out.println("d1==d3 ? " + (d1 == d3));
//		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
////		System.out.println("d2 > d3 ? "+ (d1 > d3)); // 에러
//		System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3)));
//		System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2)));
//
//		switch (d1) {
//		case EAST: // Direction.EAST라고 쓸 수 없다.
//			System.out.println("The direction is EAST.");
//			break;
//		case SOUTH:
//			System.out.println("The direction is SOUTH.");
//			break;
//		case WEST:
//			System.out.println("The direction is WEST.");
//			break;
//		case NORTH:
//			System.out.println("The direction is NORTH.");
//			break;
//		default:
//			System.out.println("Invalid direction.");
////				break;
//		}
//
//		Direction[] dArr = Direction.values();
//
//		for (Direction d : dArr) // for(Direction d : Direction.values())
//			System.out.printf("%s=%d%n", d.name(), d.ordinal());
//	}
//}
