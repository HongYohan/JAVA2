import java.util.Scanner;
import java.util.InputMismatchException;
public class InputException {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("정수 3개를 입력하세요");
		int sum=0, n=0;
		for(int i=0;i<3;i++) {
			System.out.print((i+1)+">> ");
			try {
				n=scanner.nextInt();
			}
			catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다. 다시 입력하세요!");
				i--; n=0;
				scanner.nextLine(); // 읽어들인 문자열을 반환하는 함수
			}
			sum += n;
		}
		System.out.println("합은 "+sum);
		scanner.close();

	}

}
