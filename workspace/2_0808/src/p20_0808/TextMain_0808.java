package p20_0808;

public class TextMain_0808 {
	
	public static void main(String[] args) {
		// new Car(); Car ���赵�� ����Ͽ� �� ��ü�� �����.
		// ��ü�� Heep �޸𸮿����� ���������. ��ü�� ������ Heep�޸𸮿� ���������.
		
		Car car = new Car();
		
		Client client = new Client();
		//client.name = "������";
		
		car.openDoor(client);
		car.run();

	}
}
