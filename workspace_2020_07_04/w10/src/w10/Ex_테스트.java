package w10;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class MyActionListener implements ActionListener{
	String gase = "@@@";
	static String name = "@@@";
	
	public void actionPerformed(ActionEvent e) {
		JButton b = (JButton)e.getSource();
		if(b.getText().equals("입력")) {
			gase=JOptionPane.showInputDialog("이름을 입력하세요");
			String st = new String(gase);
			name =st;
			//System.out.println(st);
		}
//		if(b.getText().equals("입력")) {
//			name=JOptionPane.showInputDialog("이름을 입력하세요");
//		}
		if(b.getText().equals("결과")) {
			JOptionPane.showMessageDialog(null,"이름은 "+name+ "입니다.");
		}
		if(b.getText().equals("종료")) {
			JOptionPane.showMessageDialog(null,"종료합니다");
			System.exit(0);//종료
		}
	}
	
}

class MyFrame extends JFrame {
	static final long serialVersionUID=0L; 
	
	public MyFrame() {
		
		Container c = getContentPane();
		c.setBackground(Color.orange);
		c.setLayout(new FlowLayout());
		JButton b1 = new JButton("입력");
		b1.addActionListener(new MyActionListener());
		c.add(b1); 
		
		JButton b2 = new JButton("결과");
		b2.addActionListener(new MyActionListener());
		c.add(b2); 
		
		JButton b3 = new JButton("종료");
		b3.addActionListener(new MyActionListener());
		c.add(b3); 
		
		setSize(300,150);
		setTitle("작업창");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
}

public class Ex_테스트 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new MyFrame();

		
	}

}
