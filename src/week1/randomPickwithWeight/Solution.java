package week1.randomPickwithWeight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Solution {
	List<Integer> list = new ArrayList<>();
	int area = 0;

	public Solution(int[] w) {
		int len = w.length;
		for (int i = 0; i < len; i++) {
			area += w[i];
			list.add(area);
		}
	}

	public int pickIndex() {
		Random r = new Random();
		int index = r.nextInt(area) + 1, i = 0;
		while (index > list.get(i))
			i++;
		return i;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution(new int[]{5, 2, 4, 3});
		System.out.println(s.pickIndex());
	}
}