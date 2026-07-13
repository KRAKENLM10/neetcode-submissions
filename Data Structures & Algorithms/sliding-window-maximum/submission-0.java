class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k == 0) {
            return new int[0];
        }
        int i=0,j=i+k-1;
        int arr[] = new int[nums.length-k+1];
        int max=Integer.MIN_VALUE;
        int c=0;
        while(j<nums.length){
            if(!(i==j+1)){
                max=Math.max(max,nums[i]);
                i++;
                continue;
            }
            arr[c]=max;
            c++;
            j++;
            i=j-k+1;
            max=Integer.MIN_VALUE;
        }
        return arr;
    }
}
