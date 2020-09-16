//package p670;
//
//public class p670_1 {
//
//	public static void main(String[] args) {
//		Caculator2 <Integer> calc = new Caculator2<Integer>();
//		
//		System.out.println( calc.add(2, 3));
//		
//		System.out.println( new Caculator2<Double>().add(2.0, 3.0));
//		System.out.println( new Caculator2<Float>().add(2F, 3.0F));
//	}
//
//}
//
//// <T> : T-type 취급하는 자료형을 사용자가 결정해야 한다.
//// 지네릭은 static 안됨
//class Caculator2 <T> {
//	public T add(T a, T b) {
//		
//		return a;
//	}
//	
////	public static double add(double a, int b) {
////		return a+b;
////	}
////	public static float add(int a, float b) {
////		return a+b;
////	}
//
//
//}
//
//
