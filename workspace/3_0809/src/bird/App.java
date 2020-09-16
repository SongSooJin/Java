package bird;

public class App {

	public static void main(String[] args) {
		
		AngryBird bird = new AngryBird();
		Badpig pig = new Badpig();
		
		bird.forward();
		bird.forward();
		bird.turnRight();
		bird.forward();
		
		pig.sound();
	}
} 
