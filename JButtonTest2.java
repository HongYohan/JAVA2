import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JButton2 extends JFrame implements ActionListener{
	JTextField jtf;
	public JButton2() {
		// 리스트로 변수 선언
		String[] list1= {"src/img/apple.jpg","src/img/banana.jpg","src/img/persimmom.jpg",
				"src/img/pear.jpg","src/img/grape.jpg"};
		String[] list2= {"사과","바나나","감","배","포도"};
		Container ct = getContentPane();
		// 배치관리자를 3행 2열로 선언한다
		ct.setLayout(new GridLayout(3,2));
		jtf = new JTextField(10);
		
		// 이미지 아이콘을 배열로 설정
		ImageIcon[] frute= new ImageIcon[5];
		for(int i=0;i<5;i++) {
			// 이미지 아이콘에 해당 list1에 있는 경로를 각각 넣음
			frute[i]= new ImageIcon(list1[i]);
			// 버튼을 생성, list2에 있는 텍스트와 frute에 있는 이미지 경로를 넣음
			JButton jb =new JButton(list2[i],frute[i]);
			ct.add(jb);
			// 각 버튼에 해당 이벤트 리스너를 추가
			jb.addActionListener(this);// 등록의 개념
		}
		ct.add(jtf);
		setTitle("JButton Test2");
		setSize(600,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand()); // jtf에 발생된 이벤트의 값을 넣음
	}
}

public class JButtonTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JButton2();
	}
}
