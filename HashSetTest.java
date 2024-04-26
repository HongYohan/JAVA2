import java.util.*;
import java.util.Random;
public class HashSetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Integer> odd = new HashSet<Integer>(); // 셋 객체 생성 Integer 형으로
		HashSet<Integer> even = new HashSet<Integer>();
		HashSet<Integer> two = new HashSet<Integer>();
		Random random = new Random();
		for(int i=0;i<10;i++) {
			two.add(random.nextInt(100)+1); // 1~100 사이의 숫자를 two 셋에 저장, 참고로 중복이 안되서 다 다른값이 저장됨
		}
//		int[] z= new int[10];
//		int tmp, i=0;
//		while(i<10) {
//			int c=0;
//			tmp = random.nextInt(20)+1;
//			for(int j =0;j<=i;j++) {
//				if(tmp == z[j]) {
//					c=1; break;
//				}
//				else c=0;
//			}
//			if(c==1) {
//				i--;
//			}
//			else {
//				z[i]=tmp;
//				System.out.print(z[i]+", ");
//				i++;
//				
//			}
//			
//		}
		System.out.println(two);
		for(Integer x : two) { // 저장된 값에서
			if(x%2==1) { // 홀수면 old set에 저장
				odd.add(x);
			}
			else {
				even.add(x);
			}
		}
//		for(i=0;i<10;i++) {
//			if(z[i]%2==1) {
//				odd.add(z[i]);
//			}
//			else {
//				even.add(z[i]);
//			}
//		}
		System.out.println("\nodd 집합: "+odd);
		System.out.println("even 집합: "+even);
		Iterator<Integer> it = odd.iterator(); // 셋은 순서가 없기 때문에 셋에서 순서를 만들어주는 메소드, 홀수를 먼저 넣음
		int sum=0;
		while(it.hasNext()) {
			sum+=it.next();
		}
		System.out.println("odd 집합의 합은: "+sum); // 홀수 집합의 합
	}

}
