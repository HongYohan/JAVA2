import java.util.Scanner; //scanner를 쓰기 위해

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width*height; // width*height의 값을 반환한다
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rectangle rect = new Rectangle();
		rect.width=scanner.nextInt(); // int로 받는다
		rect.height=scanner.nextInt();
		System.out.println("사각형의 면적은 "+rect.getArea());
		
		scanner.close();
	}

}
