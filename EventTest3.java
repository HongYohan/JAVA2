import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventClass1 implements ActionListener{ // 이벤트 리스너 클래스를 따로 선언해 인터페이스 적용함
	JLabel jl; // 해당 클래스의 공통부분선언,, 즉 변경하고 싶은 부분을 선언하면 됨
	public EventClass1(JLabel jl) {
		this.jl = jl; // 내용을 받아와서 지금 클래스에 넣음
	}
	public void actionPerformed(ActionEvent e) {
		jl.setText(e.getActionCommand()); // 작동되는 기능의 값을 가져와서 jl에 넣는다
	}
}

class Event3 extends JFrame{
	JLabel jl;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     
	JButton jb1, jb2;
	public Event3() {
		Container ct = getContentPane();
		// FlowLayout fl = new FlowLayout();
		ct.setLayout(new FlowLayout()); // flowlayout형식으로 레이아웃 설정
		jb1 = new JButton("사랑합니다");
		jb2 = new JButton("행복합니다");
		jl = new JLabel("버튼을 누르세요");
		jb1.addActionListener(new EventClass1(jl)); // 버튼 클릭 수행시 해당 이벤트 클래스를 불러오고 내용도 넣어줌
		jb2.addActionListener(new EventClass1(jl));
		ct.add(jb1);
		ct.add(jb2);
		ct.add(jl);
		setTitle("Event Test3");
		setSize(250,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class EventTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event3();
	}

}
