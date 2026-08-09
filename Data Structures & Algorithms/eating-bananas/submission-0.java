class Solution {
    public int messi(int[] arr,int k){
        int total=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%k!=0){
                total+=(arr[i]/k+1);
            }
            else{
                total+=(arr[i]/k);
            }
        }
        return total;
    }
    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int i=1;
        int j=piles[piles.length-1];
        int ans=0;
        while(i<=j){
            int m=(i+j)/2;
            if(messi(piles, m)<=h){
                ans=m;
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        return ans;
    }
}
