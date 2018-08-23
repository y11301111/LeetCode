class Solution {
    public int[] constructRectangle(int area) {
        int l = (int) Math.sqrt(area);
        if (l == 1) {
            return new int[]{area,1};
        }
        while(area % l != 0){
            l++;
        }
        return new int[]{Math.max(l,area / l),Math.min(l,area / l)};
    }
}