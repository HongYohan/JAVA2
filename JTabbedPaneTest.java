import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class RadioPanel extends JPanel implements ActionListener{
	JLabel jl1 = new JLabel("당신의 성별은? ");
	JLabel jl2 = new JLabel("");
	public RadioPanel() {
		ButtonGroup gb = new ButtonGroup();
		JRadioButton jrb1 = new JRadioButton("남자"); // 라디오 버튼 생성
		JRadioButton jrb2 = new JRadioButton("여자");
		gb.add(jrb1); // 그룹버튼 설정으로 하나만 선택 가능하게 해둠
		gb.add(jrb2);
		add(jl1); 
		add(jl2);
		add(jrb1);
		add(jrb2);
		jrb1.addActionListener(this);
		jrb2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae) {
		String s = ae.getActionCommand();
		jl2.setText(s);
	}
}

class ComboPanel extends JPanel implements ItemListener{
	JLabel jl1 = new JLabel("당신의 혈액형은? ");
	JLabel jl2 = new JLabel("");
	public ComboPanel() {
		JComboBox jcb = new JComboBox(); // 콤보박스
		jcb.addItem(" A형 "); // 콤보박스에 값 추가
		jcb.addItem(" B형 ");
		jcb.addItem(" AB형 ");
		jcb.addItem(" O형 ");
		add(jl1);
		add(jl2);
		add(jcb);
		jcb.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie) {
		Object s = ie.getItem();
		jl2.setText(s.toString());
	}
}

class JTabbedPane1 extends JFrame {
	public JTabbedPane1() {
		JTabbedPane jtp = new JTabbedPane(); // 그룹홀더를 생성
		RadioPanel rp = new RadioPanel(); // 라디오패널 클래스 수행
		ComboPanel cp = new ComboPanel(); // 콤보박스패널 클래스 수행
		jtp.addTab(" 성별 ", rp); // 새로운 탭 추가 ,.... 이름,패널
		jtp.addTab(" 혈액형 ", cp);
		getContentPane().add(jtp); // 해당 판에 그룹홀더를 추가한다
		setTitle("JTabbedPane Test1");
		setSize(500,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

public class JTabbedPaneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTabbedPane1();
	}

}
