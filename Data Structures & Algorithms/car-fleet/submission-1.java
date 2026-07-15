class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        if (position.length == 0) return 0;

        Stack<double[]> stack = new Stack<>();
        for (int i = 0; i < position.length; i++) {
            double time = (double) (target - position[i]) / speed[i];
            double arr[] = {position[i], (double) time};
            stack.push(arr);
        }
        stack.sort((a, b) -> Double.compare(a[0],b[0]));

        int c = 0;
        double max = 0.0;
        while (!stack.isEmpty()) {
            double[] temp = stack.pop();
            if (temp[1] > max) {
                c++;
                max = temp[1];
            }
        }

        return c;
    }
}
