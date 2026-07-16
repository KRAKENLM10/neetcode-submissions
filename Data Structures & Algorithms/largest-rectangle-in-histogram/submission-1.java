class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<int[]> stack = new Stack<>();
        int maxarea = 0;
        for (int i = 0; i < heights.length; i++) {
            int left = i;
            while (!stack.isEmpty() && heights[i] < stack.peek()[1]) {
                maxarea = Math.max(maxarea, stack.peek()[1] * (i - stack.peek()[0]));
                left = stack.pop()[0];
            }
            int arr[] = {left, heights[i]};
            stack.push(arr);
        }

        while (!stack.isEmpty()) {
            int temp[] = stack.pop();
            maxarea = Math.max(maxarea, temp[1] * (heights.length - temp[0]));
        }
        return maxarea;
    }
}
