package app_package;
import lib_package.Calculator;
public class GoodCalc extends Calculator {
	public int add(int a,int b) {
		return a+b;
	}
	public int subtract(int a, int b) {
		return a-b;
	}
	public double average(int[] a) {
		double x=0;
		for(int i=0;i<a.length;i++) { // for(int val:a); x += val;
			x+=a[i];
		}
		return x/a.length;
	}
	
	public static void main(String[] args) {
		Calculator c = new GoodCalc();
		System.out.println(c.add(2,3));
		System.out.println(c.subtract(2,3));
		System.out.println(c.average(new int[] {2,5,4}));
	}
}
