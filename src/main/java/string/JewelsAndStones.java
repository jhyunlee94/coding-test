package string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class JewelsAndStones {
	public static void main(String[] args) {
		JewelsAndStones jewelsAndStones = new JewelsAndStones();
		// String jewels = "aA";
		// String stones = "aAAbbbb";
		String jewels = "z";
		String stones = "ZZ";
		// 3 이 나와야함
		System.out.println(jewelsAndStones.solution(jewels, stones));
	}

	private int solution(String jewels, String stones) {
		List<Character> list = new ArrayList<>();
		char[] jewelsArr = jewels.toCharArray();
		for (char c : jewelsArr) {
			list.add(c);
		}

		int count = 0;
		char[] stonesArr = stones.toCharArray();
		for (char c : stonesArr) {
			if (list.contains(c)) {
				count++;
			}
		}
		return count;
	}
}
