import java.util.Scanner;
import java.io.File;

public class ScannerTest2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner p = new Scanner(System.in);
		System.out.print("검색을 원하는 학생의 학번을 입력하세요: ");
		int id = p.nextInt();
		Scanner s= new Scanner(new File("eee.txt")); // eee.txt 파일을 읽어들임
		while(s.hasNext()) { // 다음 토큰이 있다면 true로 반환
			if(id==s.nextInt()) { // id와 같은 숫자가 해당 파일에 있다면
				// 파일의 순서대로 수행, 학번 다음은 이름, 전화번호임
				System.out.println(s.next()+" 학생의 전환번호: "+s.next());
				return;
			}
			else { // 없다면 이름과 전화번호를 패스하고 다음 학번을 검색할수 있게함
				s.next();
				s.next();
			}
		}
		System.out.println("학생의 번호가 저장되어 있지 않습니다");
	}

}
