package string;

import java.util.ArrayList;
import java.util.List;

public class PlusOne {
	public static void main(String[] args) {
		PlusOne plusOne = new PlusOne();
		int[] digits = {1,2,3};
		// int[] digits = {9,9,9,9};
		int[] result = plusOne.solution(digits);
		List<Integer> list = new ArrayList<>();
		for (int i : result) {
			// System.out.println(i);
			list.add(i);
		}
		System.out.println(list.toString());
	}

	private int[] solution(int[] digits) {
		int len = digits.length; // 3, {1,2,3}일때

		for (int i = len-1; i >= 0; i--) {
			// System.out.println(i); // 0, 1, 2 번째 방 순회
			digits[i]++;
			if (digits[i] < 10) {
				return digits;
			}
			digits[i] = 0;
		}
		int[] result = new int[len + 1];
		result[0] = 1;
	   	return result;
	}
}
