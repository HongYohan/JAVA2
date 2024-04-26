class RealPoint {
	private int x,y;
	public RealPoint(int x, int y) {
		this.x=x; this.y=y;
	} // 해당 x,y를 지역변수 x,y에 입력함
	public boolean equals(Object obj) { //boolean equals에 대한 판정  객체를 읽어들임
		if(obj instanceof RealPoint) { // obj와 realpoint가 같은 타입인지 확인 같다면
			RealPoint RP = (RealPoint) obj; // obj를 realpoint로 형변환 해서 선언
			if(this.x ==RP.x&&this.y ==RP.y) { //2개가 같다면 true 아니면 false
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
}
// 202295035 홍요한
public class homework0915 {
	public static void main(String[] args) {
		RealPoint a = new RealPoint(2,3);
		RealPoint b = new RealPoint(2,3);
		RealPoint c = new RealPoint(3,4);
		
		if(a==b)//false
			System.out.println("a==b");
		if(a.equals(b))//true
			System.out.println("a is equal to b");
		if(a.equals(c))//false
			System.out.println("a is equal to c");	
	}
}