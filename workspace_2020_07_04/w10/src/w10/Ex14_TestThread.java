package w10;

public class Ex14_TestThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TimerThread th = new TimerThread();
		th.start();

	}

}


class TimerThread extends Thread {
	int n = 0;

	public void run() {
		while(true) { // ���ѷ����� �����Ѵ�.
			System.out.println(n); 
			n++;
			 try {
				sleep(1000); //1�� ���� ���� �� �� �����.
			}
			catch(InterruptedException e){return;}
		}
	}

}