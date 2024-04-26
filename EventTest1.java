import javax.swing.*;
import java.awt.*;
import java.awt.event.*; // 이벤트 선언

class Event1 extends JFrame implements ActionListener{ // 이벤트 리스너를 인터페이스로 두고 jframe을 상속받음
	JLabel jl; // 전역변수를 하나 선언함
	public Event1() {
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout()); // 레이아웃 설정
		JButton jb = new JButton("버튼"); // 버튼생성
		jl=new JLabel("버튼을 누르세요"); //라벨 생성
		jb.addActionListener(this); // 버튼의 이벤트를 자체 처리
		ct.add(jb);// 판에 추가
		ct.add(jl);
		setTitle("Event Test1");
		setSize(200,100);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e) {// 버튼 수행시 작동되는 함수를 구현
		jl.setText("잘 하셨어요"); // setTitle로 해당 라벨의 내용을 변경함
	}
}
public class EventTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Event1();
	}

}
