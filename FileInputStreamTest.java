import java.io.*;
public class FileInputStreamTest {
	// 202295035 홍요한
	public static void main(String[] args) {
		FileInputStream fin = null; //읽어 들일 파일을 null로 먼저 선언
		try {
			fin = new FileInputStream("C:\\test\\test.txt"); // 해당 파일에 대한 경로 입력
			int c;
			while(true) {
				c =fin.read(); // 파일을 읽음
				if(c == -1) break;
				System.out.print((char)c);	
			}
			fin.close();
		}catch(FileNotFoundException e) { // 파일을 찾을수 없다는 오류
			System.out.println("파일을 찾을 수 없습니다.");
		}catch(IOException e){
			System.out.println("입출력 오류가 발생했습니다.");
		}
	}
}
