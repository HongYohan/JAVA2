import java.util.*;
import java.util.Random;


public class LinkedHashMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lm = new LinkedHashMap<String,Integer>();
		Scanner stdin = new Scanner(System.in);
		for(int i=0;i<5;i++) { //5개의 점수 추가
			System.out.print("과목과 점수 입력: ");
			String s = stdin.next();
			int d = stdin.nextInt();
			lm.put(s, d); // 맵에 요소 추가 키,값으로 추가함
		}
		System.out.println("당신의 성적: "+lm + total_avg(lm));
	}
	
	public static String total_avg(Map m) {
		int total = 0;
		int count = m.size(); // m.size(): 맵의 크기를 나타냄
		Collection<Integer> c = m.values(); // 맵에서 값들만 가져와서 collection 객체 생성
		Iterator<Integer> iterator = c.iterator(); // 순서가 없기 때문에 수행
		while(iterator.hasNext()) {
			total+=iterator.next();
		}
		return " 총점=" + total+" 평균="+(double)total/count;
	}
}