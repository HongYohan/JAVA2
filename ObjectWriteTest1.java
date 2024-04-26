import java.io.*;
import java.util.Scanner;
class Box implements Serializable{ // objectwrite클래스는 serializable의 인터페이스 형식에 따라야 한다
	public int width;
	public int height;
	public int depth;
	public Box(int w, int h, int d) {
		width = w;
		height = h;
		depth = d;
	}
}

public class ObjectWriteTest1 {
	public static void main(String[] args) throws Exception {
//		String s1 = "***박스의 가로,세로,높이***"; 
//		Box mybox1 = new Box(10,20,30);
		// 반드시 파일을 형식 하나 정해서 상속받으면서 해결해야 한다
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("tmp.txt")); // 파일 형식을 바이트 스트림으로 읽어들이는 형식으로 설정한다
//		oos.writeObject(s1); //파일 object에 원하는 값의 판을 하나씩 넣는다
//		oos.writeObject(mybox1);
//		oos.writeDouble(123.456);
//		oos.close();
//		System.out.print("tmp.txt 파일명으로 객체 파일을 생성하였습니다.");
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("tmp.txt"));
		Object s2 = ois.readObject(); // 변수를 선언해서 해당 변수 안에 있는 오브젝트를 선택한다
		Box mybox2 = (Box)ois.readObject(); // 오브젝트 선택시 ()강제로 선택이 가능하다
		System.out.println(s2);
		System.out.println("박스의 가로는: "+mybox2.width); // (Box)형으로 오브첵트를 읽었기 때문에 해당 객체를 이용 가능하다
		System.out.println("박스의 세로는: "+mybox2.height);
		System.out.println("박스의 높이는: "+mybox2.depth);
		System.out.println("Double 값은: "+ois.readDouble()); // 자동으로 double에 해당하는 객체를 찾아 읽는다
	}
}