
public class StringBufferTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb1 = new StringBuffer("Hello JAVA");
		StringBuffer sb2 = new StringBuffer("처음 시작하는 자바");
		System.out.println("문자열 => "+sb1);
		System.out.println("문자열 길이 => "+sb1.length());
		System.out.println("버퍼를 포함한 길이 => "+sb1.capacity()); //버퍼값 출력
		System.out.println("버퍼에 들어있는 내용 => "+sb2);
		System.out.println("문자열 끼워넣기 => "+sb2.insert(8, "Power"));
		System.out.println("버퍼의 8번째 문자 => "+sb2.charAt(8));
		sb2.setCharAt(5, '되'); // sb2의 char의 5번째 값을 '되'로 세팅
		System.out.println("5번째 값을 '되'로 변경 => "+sb2);
		sb2.setLength(5); //sb2 문자열의 길이를 5로 세팅한다
		System.out.println("버퍼의 새로운 값 => "+sb2);
		System.out.println("문자열의 역순출력하기 => "+sb2.reverse()); //sb2를 역으로 출력
	}

}
