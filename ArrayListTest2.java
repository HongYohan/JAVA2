import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Boxa{
	String color;
	public int vol;
	public Boxa(String c, int w,int d, int h) {
		color =c;
		vol =w*d*h;
	}
	@Override public String toString() {
		return color+"박스";
	}
}
public class ArrayListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Boxa> box = new ArrayList<Boxa>(); // 클래스 명을 리스트로 선언함
		box.add(new Boxa("white",3,3,3)); // 새로 클래스를 생성 가능
		box.add(new Boxa("red",5,5,5));
		box.add(new Boxa("black",7,7,7));
		System.out.println("초기값: "+box); // 추가된 box 배열 출력
		for(Boxa b : box) {
			System.out.println(b.color+" 박스의 부피는: "+ b.vol);
		}
	}
	
}
