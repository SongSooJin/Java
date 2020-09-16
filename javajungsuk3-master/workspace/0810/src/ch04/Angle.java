package ch04;

public class Angle {
	// ¸â¹öº¯¼ö
	String name = "¿£Á©";

	// ¸â¹ö ¸Þ¼Òµå
	
	public void forward() {
		System.out.println(" ¿£Á© # forward() called.");
	}
	public void turnLeft() {
		System.out.println(" ¿£Á© # turnLeft() called.");
	}
	public void turnRight() {
		System.out.println(" ¿£Á© # turnRight() called.");
	}
	public void flower() {
		System.out.println(" ¿£Á© # flower() called.");
	}
	
	
	
	public static void main(String[] args) {
		// ¹Ì¼Ç ¼öÇàÇÏ±â : for¹® ¶Ç´Â while¹®À» ¾²¼¼¿ä
		
		Angle a = new Angle();
//		
//		a.forward();
//		a.turnLeft();
//		a.flower();
//		for (int i = 1; i <= 3; i++) {
//			a.forward();
//			a.turnLeft();
//			a.flower();
//			a.turnRight();
//			a.forward();
//			System.out.println("");
//		}
		int i = 1;
		while (i <= 3) {
			a.forward();
			a.turnLeft();
			a.flower();
			a.turnRight();
			a.forward();
			System.out.println("");
			i++;
		}
		

	}
}
