import java.io.File;
public class FileDirTest1 {
	public static void main(String args[]) {
		String directory = "C:/Windows"; // 파일 경로 설정
		File f1 = new File(directory); // 설정된 경로의 파일을 새로운 파일로 생성
		if(f1.isDirectory()) { // 해당 파일이 디렉토리로 구성되어 있다면 검사
			System.out.println("검색 디렉터리 "+directory);
			System.out.println("-----------");
			String s[] = f1.list(); // 디렉토리의 모든 요소를 문자열 배열로 저장
			for(int i=0;i<s.length;i++) { //디렉토리의 길이만큼 반복
				File f = new File(directory+"/"+s[i]); //경로에서 s[i]번째의 값에 대한 새로운 파일 생성
				if(f.isDirectory()) System.out.println(s[i]+" : 디렉토리");
				else System.out.println(s[i]+" : 파일");
			}
		}
		else System.out.println("지정한 "+directory+" 는 디렉터리가 아님"); // 디렉토리가 아니면 출력
	}
}
