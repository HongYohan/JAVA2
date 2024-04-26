import java.util.*;
public class TreeSetTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> low = new TreeSet<Integer>();
		TreeSet<Integer> even = new TreeSet<Integer>();
		
		for(int i=4;i>=0;i--) {
			low.add(i);
			even.add(i*2);
		}
		
		System.out.println("low집합: "+low+" even집합: "+even);
		TreeSet<Integer> union = new TreeSet<Integer>(low); // low 객체를 이용함
		TreeSet<Integer> intersection = new TreeSet<Integer>(low);
		TreeSet<Integer> difference = new TreeSet<Integer>(low);
		
		union.addAll(even); // 모든 값을 한곳에 모아둠, 셋이여서 중복되는 값은 알아서 삭제됨
		intersection.retainAll(even); // 모든 값에서 교집합을 가져옴, even을 기준으로 중복된 값을 남겨둠
		difference.removeAll(even); // 차집합을 가져옴, 즉 even을 기준으로 같은 값을 삭제함
		
		System.out.println("low와 even의 합집합: "+union);
		System.out.println("low와 even의 교집합: "+intersection);
		System.out.println("low와 even의 차집합: "+difference);
	}

}
