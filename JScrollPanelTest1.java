import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JScrollPanel1 extends JFrame{
	public JScrollPanel1() {
		Container ct = getContentPane();
		JPanel jp = new JPanel();
		jp.setLayout(new GridLayout(20,5));
		for(int i=1;i<=100;i++) jp.add(new JButton(i+"번"));
		int v = ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED; // 필요하다면 수직 스크롤바 제공
		int h = ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED; // 필요하다면 수평 스크롤바 제공
		JScrollPane jsp = new JScrollPane(jp,v,h); // JPanel에 수직과 수평 스크롤바 추가
		ct.add(jsp, BorderLayout.CENTER); // 센터에 JScrollPane을 추가
		setTitle("JScrollPane Test1");
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JScrollPanelTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JScrollPanel1();
	}
}
