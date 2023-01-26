package baekjoon_Sum;

import java.util.Scanner;

public class B10869 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int plus = a + b;
		int min = a - b;
		int mul = a * b;
		int div = a / b;
		int remainder = a % b; 
		
		System.out.println(plus);
		System.out.println(min);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(remainder);
		
	}

}
