import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JMenu1 extends JFrame implements ActionListener{
	JTextField jtf;
	public JMenu1() {
		Container ct = getContentPane();
		ct.setLayout(new BorderLayout());
		
		// 새로운 메뉴바를 생성
		JMenuBar jmb = new JMenuBar();
		
		// 해당 메뉴바에 들어갈 메뉴를 생성
		JMenu menu1 = new JMenu("파일");
		JMenu menu2 = new JMenu("편집");
		
		// 해당 메뉴안에 있는 값 추가
		JMenuItem jmi = new JMenuItem("새파일");
		jmi.addActionListener(this); // 바로 이벤트 발생
		menu1.add(jmi);
		
		jmi = new JMenuItem("저장하기");
		jmi.addActionListener(this);
		menu1.add(jmi);
		
		jmi = new JMenuItem("열기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		jmi = new JMenuItem("잘라내기");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		jmi = new JMenuItem("복사");
		jmi.addActionListener(this);
		menu2.add(jmi);
		
		// 메뉴 아이템을 checkbox형으로 생성
		JCheckBoxMenuItem jcbmi = new JCheckBoxMenuItem("눈금자");
		jcbmi.addActionListener(this);
		menu2.add(jcbmi);
		
		// 메뉴 아이템을 radiobutton형으로 생성
		JRadioButtonMenuItem jrbmb = new JRadioButtonMenuItem("수정가능상태");
		jrbmb.addActionListener(this);
		menu2.add(jrbmb);
		
		// 생성된 메뉴바에 메뉴 추가
		jmb.add(menu1);
		jmb.add(menu2);
		setJMenuBar(jmb);
		
		// 결과 값 필드
		jtf = new JTextField();
		ct.add(jtf, BorderLayout.SOUTH);
		setTitle("JMenu Test1");
		setSize(300,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) {
		jtf.setText(ae.getActionCommand());
	}
}

public class JMenuTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JMenu1();
	}

}
