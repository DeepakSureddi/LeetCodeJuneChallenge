package week2.isSubsequence;
class Solution {
    public static boolean isSubsequence(String s, String t) {
    	int i = 0;
    	int count = 0;
    	for (int j = 0; j < t.length(); j++) {
    		while(i < s.length() && j < t.length()) {
    			if (s.charAt(i) == t.charAt(j)) {
    				count++;
    				i++;
    				break;
    			}
    			j++;
    		}
		}
    	return count == s.length();
    }
    public static void main(String[] args) {
		System.out.println(isSubsequence("axc", "ahbgdc"));
	}
}