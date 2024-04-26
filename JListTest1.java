import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

class JList1 extends JFrame implements ListSelectionListener{
	private String[] fruitlist = {"persimmom","banana","apple","grape","cherry","pear"};
	private JList jlst = new JList(fruitlist); // JList는 배열로 값을 받는다
	private ImageIcon[] fruiticons = {
			new ImageIcon("src/img/persimmom.jpg"),
			new ImageIcon("src/img/banana.jpg"),
			new ImageIcon("src/img/apple.jpg"),
			new ImageIcon("src/img/grape.jpg"),
			new ImageIcon("src/img/cherry.jpg"),
			new ImageIcon("src/img/pear.jpg")
	};
	private JLabel[] jlicon = new JLabel[6];
	private JLabel jlname = new JLabel();
	
	public JList1() {
		Container ct = getContentPane();
		JPanel p1 = new JPanel();
		p1.setLayout(new GridLayout(3,2,5,5)); // 3행 2열 5px 5px
		for(int i =0;i<6;i++) {
			p1.add(jlicon[i]=new JLabel()); // 패널에 새로운 라벨 생성
		}
		JPanel p2 = new JPanel();
		p2.add(jlname); // 이름 라벨을 추가
		ct.add(jlst, BorderLayout.WEST); // 리스트를 추가
		ct.add(p1, BorderLayout.CENTER); // 리스트 선택시 보여줄 패널 추가
		ct.add(p2, BorderLayout.EAST); // 결과 패널 추가
		jlst.addListSelectionListener(this); // 리스트가 선택시 수행됨
		setTitle("JList Test1");
		setSize(700,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void valueChanged(ListSelectionEvent lse) {
		for(int i =0;i<6;i++) {
			jlicon[i].setIcon(null); // 처음에는 아이콘 값을 넣지 않는다
		}
		int[] indices = jlst.getSelectedIndices(); // 선택된 리스트들을 배열에 넣어둔다
		String s = "당신이 선택한 항목은 : ";
		for(int j =0;j<indices.length;j++) { // 리스트의 개수만큼 반복
			jlicon[j].setIcon(fruiticons[indices[j]]); // 라벨에 선택된 리스트에서 icon들을 추가한다
			s = s+fruitlist[indices[j]]+" "; // 해당 리스트에서 추가된 값을 넣기
		}
		jlname.setText(s); // 마지막에 결과값을 추가
	}
}

public class JListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JList1();
	}

}
