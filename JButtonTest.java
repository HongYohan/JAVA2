import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButton1 extends JFrame{
	public JButton1() {
		// 각 이미지 아이콘을 먼저 변수로 설정함
		ImageIcon korea = new ImageIcon("src/img/korea1.gif");
		ImageIcon usa = new ImageIcon("src/img/usa.gif");
		ImageIcon germany = new ImageIcon("src/img/germany.gif");
		
		// 버튼 생성
		JButton nat = new JButton(korea);
		nat.setPressedIcon(usa); // 버튼을 누른다면 
		nat.setRolloverIcon(germany); // 버튼에 마우스가 올라간다면
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(nat);
		setTitle("JButton Test1");
		setSize(500,400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JButtonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButton1();
	}

}
