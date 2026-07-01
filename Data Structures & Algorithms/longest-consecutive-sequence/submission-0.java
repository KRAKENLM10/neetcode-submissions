class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int highest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(nums[i] - 1)) {
                int curr = nums[i];
                int c = 1;
                while (set.contains(curr + 1)) {
                    curr += 1;
                    c += 1;
                }
                highest = Math.max(highest, c);
            }
        }
        return highest;
    }
}
