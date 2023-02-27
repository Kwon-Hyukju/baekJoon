package test;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] arr = new int [5];
		int sum = 0;
		double avg = 0.0;
		for (int i = 0; i < arr.length; i++) {
			arr[i]=sc.nextInt();
			sum += arr[i];
		}
		avg = sum / arr.length;
		System.out.println(sum);
		System.out.println(avg);
		
		sc.close();
	}

}
