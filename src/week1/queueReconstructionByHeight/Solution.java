package week1.queueReconstructionByHeight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> (b[0] == a[0] ? a[1] - b[1] : b[0] - a[0]));
        
//        [[7, 0], [7, 1], [6, 1], [5, 0], [5, 2], [4, 4]]
        List<int[]> res = new ArrayList<>();
        for (int[] p : people) {
            res.add(p[1], p);
        }
        
//        [[5, 0], [7, 0], [5, 2], [6, 1], [4, 4], [7, 1]]
        return res.toArray(new int[0][0]);
    }
    
    public static void main(String[] args) {
		int[][] reconstructQueue = reconstructQueue(new int[][]{{7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2}});
		/*for (int i = 0; i < reconstructQueue.length; i++) {
			System.out.println(Arrays.deepToString(reconstructQueue[i]));
		}*/
		System.out.println(Arrays.deepToString(reconstructQueue));
	}
}