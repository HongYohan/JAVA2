import java.io.*;
public class ExceptionTest1 {

	public static void main(String[] args) {
		try { // 오류 발생시 catch문장으로 넘어간다
			FileReader file = new FileReader("a.txt"); //해당 파일을 찾아 읽는다
			int i;
			while((i=file.read())!=-1) { // 각문장의 문단을 하나씩 검사한다
				System.out.print((char)i);
			}
			file.close();
		}
		catch(Exception e) {
			System.out.println("예외 처리 루틴: "+e+" 파일이 존재하지 않는다.");
		}
	}
}