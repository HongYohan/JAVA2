import javax.swing.*;
import java.awt.*;
class GridLayout1 extends JFrame{
	public GridLayout1() {
		Container ct = getContentPane();
		GridLayout gl = new GridLayout(4,5,10,10); // 행과 열을 의미,, 즉 4행 5열의 배치도를 가지고 생성함
		ct.setLayout(gl);
		for(int i =1;i<15;i++) ct.add(new JButton("버튼"+i)); //버튼 생성시 
		setTitle("GridLayout Test1");
		setSize(400,400);
		setVisible(true);
	}
}
public class GridLayoutTest1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GridLayout1();
	}

}
