import java.util.*;

public class StringTokenizeExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("정수 입력: ");
		Scanner stdin = new Scanner(System.in);
		String s1 = stdin.next();
		StringTokenizer st1 = new StringTokenizer(s1,"+"); // 해당 String을 +라는 구분자로 쪼갬
		int num=0;
		while(st1.hasMoreTokens()) { // 만약에 토근을 가지고 있다면
			String first = st1.nextToken(); // 첫번째 노드와 두번째 노드 수행
			String second = st1.nextToken();
			
			num+=(Integer.parseInt(first)+Integer.parseInt(second)); // 해당 문자열을 int형으로 변환후 더함
		}
		System.out.print(num);
	}

}
