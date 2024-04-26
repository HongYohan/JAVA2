import java.io.*;
import java.util.Scanner;

public class FileReaderTest1 {
	
	public static void main(String[] args){
//		Scanner stdin = new Scanner(System.in);
//		String source = "비어 있어야 비로소 가득해지는 사랑\n"+"영원히 사랑한다는 것은\n"+"평온한 마음으로 아침을 맞는다는 것입니다.\n";
//		System.out.print("파일명을 입력: ");
//		String s =stdin.next();
//		FileWriter fw = new FileWriter(s); //s로 입력받은 파일명으로 파일을 생성한다
//		fw.write(source); // 파일 내용을 넣는다
//		fw.close(); // 파일을닫는다
//		System.out.print(s+" 파일이 생성되었습니다.");
		
		Scanner stdin = new Scanner(System.in);
		try{
			System.out.print("읽어 들일 파일명을 입력하세요: ");
			String s =stdin.next();
			FileReader fr = new FileReader(s); // 읽어 들일 파일명에 대한 것을 생성
			int i;
			while((i=fr.read()) != -1) { 
				System.out.print((char)i); // 파일의 -1 즉, 마지막 줄까지 읽어서 출력
			}   
			fr.close();
		}catch(IOException e) {
			System.out.print("파일을 열 수 없음!");
		}
	}
}
