class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int c=0;
        for(int i=0;i<matrix.length;i++){
            int x=matrix[i].length-1;
            if(matrix[i][x]<target){
                c++;
            }
        }
        if(c>=matrix.length){
            return false;
        }
        int i= 0;
        int j=matrix[c].length-1;
        while(i<=j){
            int m=i+(j-i)/2;
            if(matrix[c][m]==target){
                return true;
            }
            else if(matrix[c][m]>target){
                j=m-1;
            }
            else{
                i=m+1;
            }
        }
        return false;
    }
}
