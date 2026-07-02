class Solution {
    public int maxArea(int[] heights) {
        int maxvol = 0;
        int vol = 0;
        for (int i = 0; i < heights.length; i++) {
            for (int j = i + 1; j < heights.length; j++) {
                if (heights[i] < heights[j]) {
                    vol = heights[i] * (j - i);
                } 
                else if (heights[i] >= heights[j]) {
                    vol = heights[j] * (j - i);
                }
                if (maxvol < vol) {
                maxvol = vol;
            }
            }

            if (maxvol < vol) {
                maxvol = vol;
            }
        }
        return maxvol;
    }
}
