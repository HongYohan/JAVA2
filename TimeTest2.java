//import java.time.LocalDate; // 날짜와 관련된 클래스
//import java.time.LocalDateTime; // 시간과 날짜에 관련된 클래스
//import java.time.LocalTime; // 시간과 관련된 클래스
import java.time.*;
import java.time.temporal.ChronoUnit;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Mytime extends JFrame implements ActionListener{
	private JTextField jtf;
	JTextArea jta1, jta2;
	private JLabel jl = new JLabel("당신의 생을 공백으로 구분하여 입력(예:2020 01 01)");
	public Mytime() {
		JButton jb1 = new JButton("현재");
		JButton jb2 = new JButton("100살");
		jtf = new JTextField(10); // 10개의 문자만 받음
		jta1 = new JTextArea(4,20); // 4줄 20개 문자
		jta2 = new JTextArea(3,20); // 3줄 20개 문자
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		p1.add(jl);
		p1.add(jtf);
		p2.add(jb1);
		p2.add(jta1);
		p3.add(jb2);
		p3.add(jta2);
		ct.add(p1);
		ct.add(p2);
		ct.add(p3);
		jb1.addActionListener(this);
		jb2.addActionListener(this);
		
		setTitle("JTextField,JTextArea Test1");
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae){
		String birth = jtf.getText(); // 생일 필드에서 값을 가져옴
		StringTokenizer st1 = new StringTokenizer(birth); // 가져온 값을 공백 구분자로 tokenizer함
		int year = Integer.parseInt(st1.nextToken()); // 1번째 토큰부터 year
		int month = Integer.parseInt(st1.nextToken()); // month
		int day = Integer.parseInt(st1.nextToken()); // day로 넣음
		LocalDate my_birth = LocalDate.of(year, month, day); // localDate.of(년도,월,일)로 설정
		LocalDate current = LocalDate.now(); // 현재 시간을 불러옴
		LocalDate hundred = my_birth.plusYears(100); // 현재 year에 100을 더함
		
		if(ae.getActionCommand() == "현재") {
			jta1.append("당신의 생일: "+toString(my_birth)+"\n");
			jta1.append("오늘 날짜는: "+toString(current)+"\n");
			jta1.append("생일부터 오늘까지의 일: "+my_birth.until(current,ChronoUnit.DAYS)+"\n"); // 자신의 출생일부터 현재 일의 days들을 가져옴
			jta1.append("생일부터 오늘까지의 년: "+my_birth.until(current,ChronoUnit.YEARS)+"\n");
		}else {
			jta2.append("당신이 100이 되는 날은: "+toString(hundred)+"\n");
			jta2.append("100살까지 남은 주(week) 수: "+current.until(hundred,ChronoUnit.WEEKS)+"\n"); // 현재일에서 100년이 됬을때의 주를 가져옴
			jta2.append("100살까지 남은 일 수: "+current.until(hundred,ChronoUnit.DAYS)+"\n");
			jtf.setEditable(false);
		}
	}
	public static String toString(LocalDate d) {
		return d.getYear()+"년"+d.getMonthValue()+"월"+d.getDayOfMonth()+"일";
	}
}

public class TimeTest2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Mytime();
	}

}
