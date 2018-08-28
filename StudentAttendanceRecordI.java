class Solution {
    public boolean checkRecord(String s) {
        int a_sum = 0;
        int l_sum  = 0;
        for(int i = 0;i < s.length();i++) {
            if (s.charAt(i) == 'A') {
                a_sum++;
            }
            if(a_sum > 1) {
                return false;
            }
            if (s.charAt(i) == 'L' ) {
                l_sum++;
            }
            if (s.charAt(i) == 'P' || s.charAt(i) == 'A'){
                l_sum =0;
            }
            if(l_sum == 3){
                return false;
            }
        }
        return true;
    }
}