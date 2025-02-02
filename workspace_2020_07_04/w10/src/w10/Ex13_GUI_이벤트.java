package w10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class YourActionListener implements ActionListener{
	String gase = "@@@";
	static double ga = 0.0;
	static double se = 0.0;
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("입력")) {
			gase=JOptionPane.showInputDialog("가로,세로를 입력하세요");
			StringTokenizer st = new StringTokenizer(gase,",");
			se = Double.parseDouble(st.nextToken()); //문자열 10.3을 double로
			ga = Double.parseDouble(st.nextToken()); 
		}
		if(b.getText().equals("결과")) {
			String ss = "가로 : " + ga + "세로 : " + se+"\n넓이 : "+(ga*se);
			JOptionPane.showMessageDialog(null,ss);
		}
		if(b.getText().equals("종료")) {
			JOptionPane.showMessageDialog(null,"종료합니다");
			System.exit(0);//종료
		}
	}
	
}

class YourFrame extends JFrame {
	static final long serialVersionUID=0L; 
	
	public YourFrame() {
		
		Container c = getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("입력");
		b1.setBackground(Color.BLUE);
		b1.addActionListener(new YourActionListener());
		c.add(b1); 
		
		JButton b2 = new JButton("결과");
		b2.setBackground(Color.BLUE);
		b2.addActionListener(new YourActionListener());
		c.add(b2); 
		
		JButton b3 = new JButton("종료");
		b3.addActionListener(new YourActionListener());
		b3.setBackground(Color.BLUE);
		c.add(b3); 
		
		setSize(300,150);
		setTitle("입력창");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}

public class Ex13_GUI_이벤트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new YourFrame();

		
	}

}
