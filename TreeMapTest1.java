import java.util.*;
public class TreeMapTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TreeMap으로 <키,값> 순서대로 선언
		TreeMap<Integer,String> tm = new TreeMap<Integer,String>();
		// .put으로 키와 값을 집어넣는다
		tm.put(88,"국어"); tm.put(100,"영어"); tm.put(76,"수학"); tm.put(80,"사회"); tm.put(69,"과학");
		
		Map.Entry<Integer,String> me = tm.firstEntry(); // 가장 작은 값을 가져온다
		System.out.println("가장 낮은 성적은 "+me.getKey()+"점이며 과목은 "+me.getValue()+"입니다.");
		me = tm.lastEntry(); // 키가 가장 큰 값을 가져온다
		System.out.println("가장 높은 성적은 "+me.getKey()+"점이며 과목은 "+me.getValue()+"입니다.");
		
		Map<Integer,String> cd = tm.headMap(80); // 키가 80이하인 값을 가져온다
		System.out.println("학점 C,D에 해당하는 과목과 점수: "+cd);
		Map<Integer,String> ab = tm.tailMap(80); // 키가 80이상인 키에서 값을 가져온다
		System.out.println("학점 A,B에 해당하는 과목과 점수: "+ab);

		System.out.println("점수 순으로 출력(낮은 점수 부터): "+tm); // 키가 낮은 순으로 원래 출력됨
		System.out.println("점수 순으로 출력(높은 점수 부터): "+tm.descendingMap()); // 역순으로 출력, 키가 높은것부터 출력함
	}

}
