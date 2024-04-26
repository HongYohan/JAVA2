import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class event implements ActionListener{
	JTextField jtf;
	JTextArea jta;
	String s;
	
	public event(String s, JTextField jtf, JTextArea jta) {
		this.s=s;
		this.jta=jta;
		this.jtf=jtf;
	}
	
	public void actionPerformed(ActionEvent ae) {
		try { // 파일을 위해서 오류 처리 미리 생성
			if(s.equals("저장")) {
				String s = jtf.getText(); // 파일명을 받음
				FileOutputStream fos = new FileOutputStream(s); // 파일 생성
				DataOutputStream dos = new DataOutputStream(fos); // 그 파일을 데이터 넣을수 있는 형태로 바꿈
				dos.writeUTF(jta.getText()); // 스트림으로 적용해서 넣음
				fos.close();
				System.out.print(s+"파일이 생성되었습니다");
				jta.setText("");
			}
			else {
				String s = jtf.getText();
				FileInputStream fis = new FileInputStream(s); // 파일 명을 가져옴
				DataInputStream dis = new DataInputStream(fis);
				jta.setText(dis.readUTF()); // readUTF 형으로 읽어온다
				jta.setEditable(false); // 수정은 불가능하게 설정
				fis.close();
				System.out.print(s+"파일을 읽었습니다");
			}
		}
		catch(Exception e) { // 예외 발생시 수행
			System.out.print("파일이 존재하지 않습니다");
		}
	}
}

class GUI1 extends JFrame{
	JTextField jtf;
	JTextArea jta;
	String s1,s2;
	
	public GUI1() {
		JButton jb1 = new JButton("파일로 저장");
		JButton jb2 = new JButton("파일 읽어오기");
		jtf = new JTextField(20);
		jta = new JTextArea(10,20);
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		ct.add(jta);
		p1.add(jtf);
		p1.add(jb1);
		p1.add(jb2);
		ct.add(p1);
		
		s1="저장"; s2="불러오기"; // 각 값을 String으로 설정
		jb1.addActionListener(new event(s1,jtf,jta)); // 해당 버튼 수행시
		jb2.addActionListener(new event(s2,jtf,jta));
		setTitle("GUI Test");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
public class GUITest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GUI1();
	}

}
