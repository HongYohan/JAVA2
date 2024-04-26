
class Test{
	public void test(String a, String b) throws NumberFormatException{
		try {
			int sum=Integer.parseInt(a)+Integer.parseInt(b);
			System.out.println("문자열로 입력받은 "+a+","+b+"의 합은 "+sum+"이다.");
		}catch(NumberFormatException e) {
			throw new NumberFormatException("형변환을 할 수 없다!"); // 오류 메시지를 사용자가 직접 던짐
		}
		
	}
}

public class ExceptionThrows {
	public static void main(String[] args) {
		Test t = new Test();
		try {
			t.test("1","ab");
		}catch(NumberFormatException e) {
			System.out.println("error: "+e.getMessage());
		}
	}
}
