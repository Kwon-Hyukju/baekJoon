package baekjoon_Sum;

import java.util.Scanner;

public class B2588 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		int lastIndex = b % 10;
		int secondIndex = b % 100/10;
		int firstIndex = b % 1000/100;
		
		int result3 = a * lastIndex;
		int result4 = a * secondIndex;
		int result5 = a * firstIndex;
		int result6 = a * b;
		
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		System.out.println(result6);
		
	}

}
