package test;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String str2 = sc.nextLine();
		
		char [] arr;
		// String 타입을 쪼개서 배열로 담음
		arr = str2.toCharArray();
		
		// 대문자로 바꾸는 로직 아스키코드를 써도된다
		// 대문자로 바꿀땐 +32를 해줘야한다.
		for (int i = 0; i < arr.length; i++) {
			if ('A' <= arr[i] && arr[i] <= 'Z') {
				arr[i] = (char)(arr[i]+32);
			}
		}
		System.out.println(arr);
		sc.close();
	}

}
