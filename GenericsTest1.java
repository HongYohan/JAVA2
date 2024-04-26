// 제네릭 선언과 사용, 제네릭은 모든 타입을 받을수 있다
class Boxg<T>{ // T: 타입, E: 요소, V: 값, K: 키를 의미
	T vol;
	void setVolume(T v) {
		vol=v;
	}
	T getVolume() {
		return vol;
	}
}

public class GenericsTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boxg<Integer> ibox = new Boxg<Integer>(); // 제네릭을 Integer 형태로 설정함
		ibox.setVolume(200);
		System.out.println("Box<Integer>의 부피는:"+ ibox.getVolume()); // int 형임
		Boxg<Double> dbox = new Boxg<Double>(); // 제네릭으로 Double 형태로 선언함
		dbox.setVolume(123.456);
		System.out.println("Box<Double>의 부피는:"+ dbox.getVolume());
	}
}
