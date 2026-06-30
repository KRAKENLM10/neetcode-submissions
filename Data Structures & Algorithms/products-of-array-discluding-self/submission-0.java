class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Map<Integer, Integer> map= new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();
        // arr.add(nums);
        // int j=0;

        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    product = product * nums[j];
                }
            }
            arr.add(product);
        }
        int[] ans = new int[arr.size()];
        for (int i = 0; i < arr.size(); i++) {
            ans[i] = arr.get(i);
        }
        return ans;
    }
}
