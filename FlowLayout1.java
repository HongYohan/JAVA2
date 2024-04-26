import javax.swing.*;
import java.awt.*;

public class FlowLayout1 extends JFrame { // JFrame의 상속을 받음

	public FlowLayout1() {
		Container ct = getContentPane(); // 판생성
		FlowLayout f1 = new FlowLayout(FlowLayout.CENTER, 10,15); // 센터를 기준으로 수직 10 수평 15를 여유로 둠
		ct.setLayout(f1);// 해당 판의 기본 레이아웃 형식을 FlowLayout 형태로 설정함
		JButton jb1 = new JButton("OK");
		ct.add(jb1); //버튼 생성후 추가
		JButton jb = new JButton("Cancel");
		ct.add(jb);
		JButton jb2 = new JButton("Ignore");
		ct.add(jb2);
		setTitle("ContentPane과 JFrame");
		setSize(400,200);
		ct.setBackground(Color.orange);
		setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FlowLayout1();
	}

}
