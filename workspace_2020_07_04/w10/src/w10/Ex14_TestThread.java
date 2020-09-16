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
		while(true) { // 무한루프를 실행한다.
			System.out.println(n); 
			n++;
			 try {
				sleep(1000); //1초 동안 잠을 잔 후 깨어난다.
			}
			catch(InterruptedException e){return;}
		}
	}

}