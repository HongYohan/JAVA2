import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JCheckBox1 extends JFrame implements ItemListener{ // JCheckBox() 수행은 ItemListener로 수행된다
	JLabel jl1, jl2;
	int sum =0;
	public JCheckBox1() {
		// 배열로 선언
		String[] list1 = {"사과","배","체리"};
		jl1 = new JLabel("사과 1500원, 배 1000원, 체리 20000원");
		jl2 = new JLabel("현재 0원 입니다.");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(jl1);
		for(int i=0;i<3;i++) {
			JCheckBox jcb =new JCheckBox(list1[i]); // 각 체크박를 생성
			jcb.setBorderPainted(true); // 색을 진하게 함
			ct.add(jcb); // 컴포넌트에 추가
			jcb.addItemListener(this); // 각 JCheckBox의 수행 동작을 추가
		}
		
		ct.add(jl2);
		setTitle("체크박스와 ItemEvent");
		setSize(250,200);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void itemStateChanged(ItemEvent ie) { // 각 Item이 변경시
		// checkbox로 아이템을 가져오고 그것에 대한 값을 가져와서 저장
		String s = ((JCheckBox)ie.getItem()).getText();
		if(ie.getStateChange()==ItemEvent.SELECTED) { // 이벤트 상태가 선택되었다면
			if(s.equals("사과")) {
				sum+=1500;
			} else if(s.equals("배")) {
				sum+=1000;
			} else {
				sum+=20000;
			}
		}
		else {
			if(s.equals("사과")) {
				sum-=1500;
			} else if(s.equals("배")) {
				sum-=1000;
			} else {
				sum-=20000;
			}
		}
		jl2.setText("현재 "+sum+"원 입니다.");
	}
}

public class JCheckBoxTest1 {
	public static void main(String[] args) {
		new JCheckBox1();
	}
}