import java.util.*;

public class StackQueueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> stack = new Stack<String>(); // 스택 객체를 String형태로 생성
		LinkedList<String> queue = new LinkedList<String>(); // queue를 linkedlist로 선언
		String[] arr = {"경기도","충청도","강원도","전라도","경상도","제주도"};
		Scanner stdin = new Scanner(System.in);
		for(int i=0;i<6;i++) {
			// String s = stdin.next();
			// System.out.println("스택에 push: "+ stack.push(s));
			// System.out.println("큐에 offer: "+ queue.offer(s));
			
			System.out.println("스택에 push: "+ stack.push(arr[i]));
			System.out.println("큐에 offer: "+ queue.offer(arr[i]));
		}
		System.out.println("===================");
		System.out.print("스택과 큐에 찾고자 하는 값: ");
		String x = stdin.next();
		int n = stack.search(x); // 찾고자 하는 값을 찾아줌
		int m = queue.indexOf(x); // 찾고자 하는 값을 인덱스로 찾음
		if(n!=-1) {
			System.out.printf("스택에서 숫자 %s의 위치는: %d번째 입니다.\n",x,n);
			System.out.printf("큐에서 숫자 %s의 위치는: %d번째 입니다.\n",x,(m+1));
		}
		else { // 못찾으면
			System.out.println("스택에 없습니다.");
			System.out.println("큐에 없습니다.");
		}
		System.out.println("===================");
		while(!stack.empty()) { // 비어있지 않다면
			String obj = stack.pop(); // 각 요소에 제거
			System.out.println("스택에서 pop: "+obj); // 제거한 요소
		}
		while(!queue.isEmpty()) {
			String obj = queue.poll();
			System.out.println("큐에서 poll: "+obj);
		}
	}

}
