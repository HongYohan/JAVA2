
public class StringTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "WorldCup Korea";
		System.out.println("추출된 문자 : "+s1.charAt(2));
		String s2 = "APPLE";
		String s3 = "Apple";
		System.out.println("s2와 s3이 동일한 문자열?(대소문자 무시)"+s2.equalsIgnoreCase(s3));
		System.out.println("s1문자열은 \"World\"로 시작하는가? "+s1.startsWith("World"));
		System.out.println("s1문자열은 \"rea\"로 끝나는가? "+s1.endsWith("rea"));
		String s4 = "처음 시작하는 자바"; // 단축 초기화 문자열로 됨 --> 바꿀려면 .intern() 이용
		System.out.println("s4의 인덱스 5부터 7이전까지의 문자열 : "+s4.substring(5,7)); 
		System.out.println(s4.concat("와 예제 프로그램")); // concat으로 값을 마지막부터 이어붙힌다
		System.out.println(s4.replace('하', '되')); // '하'라는 요소를 찾아서 '되'라는 요소로 바꾼다
	}

}
