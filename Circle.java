public class Circle {
	public int radius; // 원의 반지름 필드(변수)
	public String name;
	public Circle(){ // 원의 생성자 메소드
		// 생성자 만드는 이유, 값 초기화를 위해서 이다.
	}
	public double getArea() {
		return 3.14*radius*radius; // return되는 값과 같은 형태
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle pizza = new Circle();
		pizza.radius=10;
		pizza.name="자바피자";
		
		double area = pizza.getArea();
		System.out.println(area+pizza.name);
	}

}
