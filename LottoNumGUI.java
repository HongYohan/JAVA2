import java.util.Arrays;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Lotto extends JFrame implements ActionListener{
	private JLabel lotto_num = new JLabel();
	public Lotto() {
		// 로또 번호 생성
		JButton lotto = new JButton("로또 번호 자동생성");
		Container ct = getContentPane();
		ct.setLayout(new FlowLayout());
		ct.add(lotto);
		ct.add(lotto_num);
		lotto.addActionListener(this);
		setTitle("Lotto Number Generate");
		setSize(300,250);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae) {
		// 버튼 클릭시 랜덤 번호를 생성
		Random r = new Random();
		int[] num = new int[6]; // 인덱스 6으로 6개의 번호를 가짐
		int tmp, i=0;
		while(i<6) {
			int c=0;
			tmp = r.nextInt(45)+1; // 1~45 사이의 정수를 반환함
			for(int j =0;j<=i;j++) {
				if(tmp == num[j]) { // 생성된 번호가 이미 있는 번호와 같다면 c=1로 바꾸고 멈춘다
					c=1; break;
				}
				else c=0; 
			}
			if(c==1) {
				i--; // 즉 생성된 번호가 번호목록에 있는 값중에 하나와 같다면 i--로 다시 그자리 번호 생성
			}
			else {
				num[i]=tmp; // 생성된 번호를 리스트에 넣고 i++ 다음 번호 생성 수행
				i++;
			}
		}
		lotto_num.setText("이번주 로또 당첨번호: "+Arrays.toString(num));
	}
}

public class LottoNumGUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Lotto();
	}

}
