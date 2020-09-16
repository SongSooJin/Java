package w10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread1 extends Thread {
	JLabel timerLabel; // 타이머 값이 출력되는 레이블
	public TimerThread1(JLabel timerLabel) {
		this.timerLabel = timerLabel; 
	}

	// 스레드 코드. run()이 종료하면 스레드 종료
	public void run() {
		int n=0; // 타이머 카운트 값
		while(true) { // 무한 루프
			timerLabel.setText(Integer.toString(n)); 
			n++; // 카운트 증가	
			try {
				Thread.sleep(1000); // 1초동안 잠을 잔다.
			}
			catch(InterruptedException e) {	return;}
		}	
	}
}


class ThreadTimerEx extends JFrame {
	static final long serialVersionUID=0L;
	public ThreadTimerEx() {
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		
		setTitle("Thread를 상속받은 타이머 스레드 예제");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,150);
		setVisible(true);
		
		// 타이머 값을 출력할 레이블 생성
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread1 th = new TimerThread1(timerLabel);
		th.start(); // 타이머 스레드의 실행을 시작하게 한다.

	}
}

public class Ex15_ThreadTimerEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new ThreadTimerEx();
	}

}
