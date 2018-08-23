class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        int i = 0;
        int count = 0;
        while(index < s.length && i < g.length) {
            if(g[i] > s[index]) {
                index++;
                continue;
            }
            if(g[i] < s[index]) {
                index++;
                i++;
                count++;
                continue;
            }
            if(g[i] == s[index]){
                index++;
                i++;
                count++;
                continue;
            }
        }
        
        return count;
    }
}