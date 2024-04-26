import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class JRadioButton1 extends JFrame implements ActionListener{
	JLabel jl;
	JRadioButton[] jr = new JRadioButton[5]; // 라디오 버튼 개수를 5개로 설정
	String[] hobby = {"걷기","등산","골프","스킨스쿠버","페러글라이딩"};
	public JRadioButton1() {
		jl = new JLabel();
		JLabel jl1 = new JLabel();
		JLabel jl2 = new JLabel();
		JCheckBox[] jc = new JCheckBox[5]; // 체크박스 개수를 5개로 설정
		String[] age = {"20대","30대","40대","50대","60대"};
		JPanel hobbypanel = new JPanel();
		JPanel agepanel = new JPanel();
		ButtonGroup gb = new ButtonGroup(); // 버튼 그룹에 속한것은 하나만 선택이 가능하다
		for(int i=0;i<5;i++) {
			jr[i] = new JRadioButton(hobby[i]); // 라디오 버튼 추가
			jc[i] = new JCheckBox(age[i]); // 체크박스 버튼 추가
			hobbypanel.add(jr[i]);
			agepanel.add(jc[i]);
			jc[i].addActionListener(this); // 체크박스 선택시 이벤트 수행
			gb.add(jc[i]); // 체크박스를 버튼그룹에 넣어서 하나만 선택 가능하게 함
		}
		
		Container ct = getContentPane();
		ct.setLayout(new GridLayout(3,1));
		JPanel jp1 = new JPanel();
		jp1.add(jl1);
		jp1.add(hobbypanel);
		JPanel jp2 = new JPanel();
		jp2.add(jl2);
		jp2.add(agepanel);
		JPanel jp3 = new JPanel();
		jp3.add(jl);
		ct.add(jp1);
		ct.add(jp2);
		ct.add(jp3);
		setTitle("JRadioButton Test");
		setSize(400,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent ae) {
		String s = "당신의 취미: ";
		for(int i = 0; i<5; i++) {
			if(jr[i].isSelected()==true) s=s+hobby[i]+" "; // 라디오 버튼이 선택된 모든것이 true라면 문자열에 추가
		}
		s=s+"당신의 나이: ";
		jl.setText(s+ae.getActionCommand()); // 선택된 체크박스의 값을 가져와서 추가한다
	}
}

public class JRadioButtonTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JRadioButton1();
	}

}
