import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JComboBox1 extends JFrame implements ItemListener{
	JLabel jl;
	public JComboBox1() {
		jl = new JLabel();
		JComboBox jcb = new JComboBox(); // 콤보박스 생성 ItemListener로 이벤트 수행 가능
		String[] fr = {"persimmon","banana","pear","apple","cherry","grape"};
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		for(int i=0; i<6; i++) {
			jcb.addItem(fr[i]); // JComboBox는 addItem으로 추가해야 한다
		}
		ct.add(jcb);
		ct.add(jl);
		jcb.addItemListener(this);
		setTitle("JComboBox Test");
		setSize(200,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie) {
		String fruit = (String)ie.getItem(); // 해당 콤보박스의 값을 가져옴
		jl.setIcon(new ImageIcon("src/img/"+fruit+".jpg"));
	}
}

public class JComboBoxTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JComboBox1();
	}

}
