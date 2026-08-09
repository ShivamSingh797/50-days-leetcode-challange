class Solution {
    public int numberOfSubstrings(String s) {
        int[] res = { -1, -1, -1 };
        int count = 0;
        int n = s.length();
        for (int i = 0; i < n; i++) {
            res[s.charAt(i) - 'a'] = i;
            if (res[0] != -1 && res[1] != -1 && res[2] != -1) {
                count = count + (1 + Math.min(res[0], Math.min(res[1], res[2])));
            }
        }
        return count;

    }
}