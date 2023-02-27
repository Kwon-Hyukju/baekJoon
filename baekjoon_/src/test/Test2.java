package test;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		
		
		char [] arr;
		
		
		// 문자열을 char로 쪼개서 배열에 담아준다
		arr = str.toCharArray();
		
		// 소문자를 대문자로 바꿔준다.
		// 소문자로 바꿀땐 -32를 해줘야한다.
		for (int i = 0; i < arr.length; ++i) {
			if ('a' <= arr[i] && arr[i] <= 'z') {
				arr[i] = (char)(arr[i]-32);
			}
		}
		System.out.print(arr);
		sc.close();
		
		for (int i = 0; i < arr.length; i++) {
			if ('a'<=arr[i] && arr[i]<='z') {
				arr[i] = (char) (arr[i]-32);
			}
		}
	
		
		
	}

}
