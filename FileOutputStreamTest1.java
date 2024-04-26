import java.io.*;
import java.util.Scanner;
public class FileOutputStreamTest1 {
	public static void main(String[] args) throws IOException {
		Scanner stdin = new Scanner(System.in);
//		System.out.print("출력 파일명을 입력: ");
//		String s =stdin.next();
//		FileOutputStream fos = new FileOutputStream(s); // 파일을 바이트 스트림으로 읽어들임
//		for(int i=1;i<=260;i++) {
//			fos.write(i); // 파일 내용 작성
//		}
//		fos.close();
//		System.out.print(s+" 파일명으로 바이트 파일을 생성하였습니다.");
		
		System.out.print("입력 파일명을 입력: ");
		String s =stdin.next();
		FileInputStream fis = new FileInputStream(s); //파일을 읽어들임
		int i, j=0;
		while((i=fis.read()) != -1) {
			j+=i;
			System.out.println(j);
		}
		fis.close();
		System.out.print(s+" 파일로부터 바이트를 읽어 화면에 출력하였습니다.");
	}
}