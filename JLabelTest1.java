import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventClass3 implements ActionListener{
	JLabel result;
	ImageIcon i1 = new ImageIcon("src/img/apple.jpg"); // ImageIcon을 생성 , 경로로 표기
	ImageIcon i2 = new ImageIcon("src/img/pear.jpg");
	public EventClass3(JLabel jl) {
		result = jl;
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getActionCommand()=="사과") { // 버튼이 사과라면
			result.setText("맛있는 사과 입니다");
			result.setIcon(i1); // 이미지를 setIcon함
		}
		else {
			result.setText("맛있는 배 입니다");
			result.setIcon(i2);
		}
	}
}

class JLabel1 extends JFrame {
	JLabel result = new JLabel();
	public JLabel1() {
		// 버튼 생성
		JButton apple = new JButton("사과");
		JButton pear = new JButton("배");
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(apple);
		ct.add(pear);
		ct.add(result);
		
		apple.addActionListener(new EventClass3(result));
		pear.addActionListener(new EventClass3(result));
		setTitle("JLabel Test1");
		setSize(300,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}


public class JLabelTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JLabel1();
	}

}
