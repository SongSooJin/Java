package w10;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerThread1 extends Thread {
	JLabel timerLabel; // Ÿ�̸� ���� ��µǴ� ���̺�
	public TimerThread1(JLabel timerLabel) {
		this.timerLabel = timerLabel; 
	}

	// ������ �ڵ�. run()�� �����ϸ� ������ ����
	public void run() {
		int n=0; // Ÿ�̸� ī��Ʈ ��
		while(true) { // ���� ����
			timerLabel.setText(Integer.toString(n)); 
			n++; // ī��Ʈ ����	
			try {
				Thread.sleep(1000); // 1�ʵ��� ���� �ܴ�.
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
		
		setTitle("Thread�� ��ӹ��� Ÿ�̸� ������ ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(250,150);
		setVisible(true);
		
		// Ÿ�̸� ���� ����� ���̺� ����
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		TimerThread1 th = new TimerThread1(timerLabel);
		th.start(); // Ÿ�̸� �������� ������ �����ϰ� �Ѵ�.

	}
}

public class Ex15_ThreadTimerEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		new ThreadTimerEx();
	}

}
