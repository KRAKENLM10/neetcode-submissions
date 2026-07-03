class Solution {
    public int trap(int[] height) {
        int fullvol = 0;
        int l=0;
        int r=height.length-1;
        int lmax=0, rmax=0;

        while(l<r){
            lmax=Math.max(lmax,height[l]);
            rmax=Math.max(rmax,height[r]);
            if(lmax<rmax){
                fullvol+= lmax-height[l];
                l++;
            }
            else{
                fullvol+= rmax-height[r];
                r--;
            }
        }
        return fullvol;
    }
}
