
public class ColorPoint extends Point { //Point의 요소를 상속받음

	private String a;
	public void setColor(String a){
		this.a=a; // String a로 받은 값을 이 지역 변수에 저장함
	}
	public void showColorPoint() {
		System.out.print(a);
		showPoint();
	}
}
