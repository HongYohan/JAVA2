import javax.swing.*;
import java.awt.*;
class JPanel1 extends JPanel{ // JPanel에 상속을 받음
	public JPanel1() {
		setLayout(new GridLayout(5,1)); // 5행 1열의 레이아웃 설정
		add(new JRadioButton("자바"));
		add(new JRadioButton("C"));
		add(new JRadioButton("VisualBasic"));
		add(new JRadioButton("JSP"));
		add(new JRadioButton("PHP"));
	}
}
class JPanel2 extends JPanel{
	public JPanel2() {
		setLayout(new GridLayout(5,1)); //5행 1열의 레이아웃
		add(new JButton("자바"));
		add(new JButton("C"));
		add(new JButton("VisualBasic"));
		add(new JButton("JSP"));
		add(new JButton("PHP"));
	}
}
class JPanel4 extends JFrame{
	public JPanel4() {
		Container ct = getContentPane(); //판 생성
		ct.setLayout(new BorderLayout()); // 판의 형태를 동서남북으로 나눔
		ct.add(new JPanel1(), BorderLayout.EAST); // 동쪽에 새로운 패널인 JPanel1을 넣음
		ct.add(new JPanel2(), BorderLayout.WEST);
		setTitle("JPanel Test2");
		setSize(300,200);
		setVisible(true);
	}
}
class JPanelTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JPanel4();
	}

}
