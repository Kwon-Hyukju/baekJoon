package test;

import java.util.Arrays;

public class Test4 {

	public static void main(String[] args) {
		int[]arr  = {2,5,1,6,7,3,12};
		
		// for문으로 배열의 최대값, 최소값 구하기
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("for 문 이용한 방법");
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		// Arrays.sort를 이용한 방법
		System.out.println("Arrays.sort를 이용한 방법");
		// 배열 정렬
		Arrays.sort(arr);
		System.out.println("최대값 : " + arr[arr.length-1]);
		System.out.println("최소값 : " + arr[0]);
		
	}

}
