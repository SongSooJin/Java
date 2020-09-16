package p20_0808;

public class TextMain_0808 {
	
	public static void main(String[] args) {
		// new Car(); Car 설계도를 사용하여 새 객체를 만든다.
		// 객체는 Heep 메모리영역에 만들어진다. 객체는 언제나 Heep메모리에 만들어진다.
		
		Car car = new Car();
		
		Client client = new Client();
		//client.name = "일지매";
		
		car.openDoor(client);
		car.run();

	}
}
