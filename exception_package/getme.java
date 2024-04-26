package exception_package;

import java.util.Scanner;
import java.lang.ArithmeticException;
//202295035	 홍요한
class arithmetic{
	public void arithmetic1(int a, int b) throws ArithmeticException{
		try {
			int divided=a/b;
			System.out.println("divide(a,b)= "+divided);
		}catch(ArithmeticException e) {
			throw new ArithmeticException("0으로 나눌 수 없다!"); // 오류 메시지를 사용자가 직접 던짐
		}
		
	}
}
public class getme {
	public static void main(String[] args) {
		arithmetic t1 = new arithmetic();
		Scanner scanner = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("나뉨수를 입력하시오: ");
				int a = scanner.nextInt();
				System.out.print("나눗수를 입력하시오: ");
				int b = scanner.nextInt();
				t1.arithmetic1(a,b);
				break;
			}
			catch(ArithmeticException e){ // 그냥 Exception을 해도 상관은 없다.
				System.out.println("error: "+e.getMessage());
			}
		}
	}
}
