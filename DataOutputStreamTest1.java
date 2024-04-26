import java.io.*;
import java.util.Scanner;
public class DataOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner stdin = new Scanner(System.in);
		System.out.print("출력할 파일명을 입력하세요 : ");
		String s = stdin.next();
//		FileOutputStream fos = new FileOutputStream(s);
//		DataOutputStream dos = new DataOutputStream(fos);
//		dos.writeBoolean(false);
//		dos.writeByte(Byte.MAX_VALUE);
//		dos.writeChar('김');
//		dos.writeDouble(Double.MAX_VALUE);
//		dos.writeFloat(Float.MAX_VALUE);
//		dos.writeInt(Integer.MAX_VALUE);
//		dos.writeLong(Long.MAX_VALUE);
//		dos.writeShort(Short.MAX_VALUE);
//		fos.close();
//		System.out.print(s+"파일이 생성되었습니다");
		
		FileInputStream fis = new FileInputStream(s);
		DataInputStream dis = new DataInputStream(fis);
		System.out.println(dis.readBoolean());
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.readDouble());
		System.out.println(dis.readFloat());
		System.out.println(dis.readInt());
		System.out.println(dis.readLong());
		System.out.println(dis.readShort());
		fis.close();
		
	}

}
