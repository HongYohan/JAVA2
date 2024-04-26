import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class EventClass4 implements ActionListener{
	JTextField jtf; // 한줄
	JTextArea jta; // 여러 줄
	JLabel jl;
	public EventClass4(JLabel jl,JTextField jtf,JTextArea jta) {
		this.jta=jta;
		this.jtf=jtf;
		this.jl=jl;
	}
	public void actionPerformed(ActionEvent ae) {
		// getLineCount() 현재까지 입력된 줄을 반환함, getRows() 기본적으로 정해진 총 줄을 반환함
		if(jta.getLineCount() <= jta.getRows()) {
			jta.append(ae.getActionCommand()+"\n"); // JTextArea에 새로운 줄을 추가한다
			jtf.setText("");
		}
		else {
			jl.setText("입력이 종료되었습니다");
			jtf.setEditable(false); // 수정 불가능하게 설정
		}
	}
}

class JTFJTA1 extends JFrame {
	private JTextField jtf;
	private JTextArea jta;
	private JLabel jl = new JLabel("입력하십시오");
	public JTFJTA1() {
		jtf = new JTextField(20);
		jta = new JTextArea(10,20); // 10줄에 20개의 글자가 들어갈수 있게 설정
		jta.setEditable(false);
		
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		p1.add(jtf);
		p1.add(jta);
		ct.add(p1);
		ct.add(jl);

		// Enter키로 작동함
		jtf.addActionListener(new EventClass4(jl,jtf,jta));
		
		setTitle("JTextField,JTextArea Test1");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class JTFJTATest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTFJTA1();
	}

}
