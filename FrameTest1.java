import javax.swing.*;
import java.awt.*;

class FirstFrame1{
	public FirstFrame1() {
		JFrame jf = new JFrame("첫 번째 GUI 프로그램"); //해당 판을 야외에다가 설정한다
		Container ct = jf.getContentPane(); // 판을 생성
		JButton jb = new JButton("테스트버튼"); //버튼 생성
		ct.add(jb); // 판에 버튼을 올림
		jf.setSize(400,300);
		jf.setVisible(true);
	}
}
public class FrameTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FirstFrame1();
	}

}
