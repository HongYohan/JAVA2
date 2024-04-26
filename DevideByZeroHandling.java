import java.util.Scanner;
public class DevideByZeroHandling {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		while(true) {
			try {
				System.out.print("나뉨수를 입력하시오: ");
				int a = scanner.nextInt();
				System.out.print("나눗수를 입력하시오: ");
				int b = scanner.nextInt();
				int c = a/b;
				System.out.printf("%d를 %d로 나누면 몫은 %d입니다.",a,b,c);
				break;
			}
			catch(Exception e){ // 그냥 Exception을 해도 상관은 없다.
				System.out.println("0으로 나눌 수 없습니다.");
			}
		}
		scanner.close();
	}
}