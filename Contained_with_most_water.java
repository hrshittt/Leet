package Leet;
class Solution {
    public int maxArea(int[] height) {
        int maxwater = 0;
        int lp = 0;
        int rp = height.length - 1;

        while (lp < rp) {
            int width = rp - lp;
            int currwater = Math.min(height[lp], height[rp]) * width;
            maxwater = Math.max(maxwater, currwater);

            if (height[lp] < height[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxwater;
    }
}
