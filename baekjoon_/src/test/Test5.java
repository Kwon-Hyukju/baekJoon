package test;

public class Test5 {

	public static void main(String[] args) {
		int[]arr = {2,3,6,8,23,26,28};
		
		// 배열의 인덱스 값
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]==8) {
				System.out.println(i);
			}
		}
		
		int sum = 0;
		double avg = 0.0;
		
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		avg = sum / arr.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
	}

}
