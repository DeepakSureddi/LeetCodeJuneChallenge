package week1.twoCityScheduling;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
	public static int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, new Comparator<int[]>() {
            public int compare(int[] a, int[] b) {
                return (a[1] - a[0]) - (b[1] - b[0]);
            }
        });
        int cost = 0;
        for (int i = 0; i < costs.length / 2; i++) {
            cost += costs[i][1] + costs[costs.length-i-1][0];
        }
        return cost;
    }
	
	public static void main(String[] args) {
		int[][] costs = {{10,20},{30,200},{400,50},{30,20}};
		System.out.println(twoCitySchedCost(costs));
	}
}