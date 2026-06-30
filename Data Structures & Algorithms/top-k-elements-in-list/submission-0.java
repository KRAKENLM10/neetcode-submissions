class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int c = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    c++;
                }
            }
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], c);
                arr.add(nums[i]);
            }
        }

        arr.sort((a, b) -> map.get(b) - map.get(a));
        int[] a2 = new int[k];
        for (int i = 0; i < k; i++) {
            a2[i] = arr.get(i);
        }
        return a2;
    }
}