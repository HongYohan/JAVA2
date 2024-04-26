import java.util.*;
import java.util.LinkedList;
public class LinkedListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> alist = new ArrayList<Integer>(); // arraylist 배열을 Integer 형태로 선언함
		LinkedList<Integer> llist = new LinkedList<Integer>(); // linkedlist 리스트를 Integer 형태로 선언함
		long start, stop;
		
		start = System.currentTimeMillis(); // 시스템의 밀리초를 이용함
		for(int i=0;i<=1000000;i++) alist.add(i); // arraylist에 값 추가
		stop = System.currentTimeMillis(); // 밀리초를 이용
		System.out.println("ArrayList - 순차적 삽입: "+(stop-start)); // 소요된 시간 출력
		
		start = System.currentTimeMillis();
		for(int i=0;i<=1000000;i++) llist.add(i);
		stop =System.currentTimeMillis();
		System.out.println("LinkedList - 순차적 삽입: "+(stop-start)); // 소요된 시간 출력
		
		start = System.currentTimeMillis();
		for(int i=0;i<=1000;i++) alist.add(500,i); // 500이라고 지정된 위치에 i 값을 삽입
		stop =System.currentTimeMillis();
		System.out.println("ArrayList - 중간 삽입: "+(stop-start)); // 소요된 시간 출력
		
		start = System.currentTimeMillis();
		for(int i=0;i<=1000;i++) llist.add(500,i); // 500이라고 지정된 위치에 i 값을 삽입
		stop =System.currentTimeMillis();
		System.out.println("LinkedList - 중간 삽입: "+(stop-start)); // 소요된 시간 출력
	}

}
