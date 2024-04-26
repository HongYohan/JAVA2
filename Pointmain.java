import java.util.Scanner;
public class Pointmain {
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4);
		System.out.print("원하는 색상 입력: ");
		Scanner scanner = new Scanner(System.in);
		String b=scanner.next();
		cp.setColor(b);
		cp.showColorPoint();
	}

}
