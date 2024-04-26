import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayListTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> name = new ArrayList<String>(); // ArrayList로 배열로 구현
		Scanner stdin = new Scanner(System.in);
		for(int i=0;i<4;i++) {
			System.out.print("이름을 입력하세요 >> ");
			name.add(stdin.next()); // .add 가능
		}
		System.out.println(name);
		String x="";
		for(String n : name) {
			if(n.length() >= x.length()) {
				x=n;
			}
		}
		System.out.println(x);
	}
	
}