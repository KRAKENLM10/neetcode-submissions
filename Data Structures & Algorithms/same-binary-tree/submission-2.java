/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    // public int height(TreeNode root) {
    //     if (root == null)
    //         return 0;
    //     int lh = height(root.left);
    //     int rh = height(root.right);
    //     return Math.max(lh, rh) + 1;
    // }

    public boolean isSameTree(TreeNode p, TreeNode q) {

        if (p == null && q == null)
            return true;
        if(p==null&&q!=null||q==null&&p!=null)  {
            return false;
        }  
        else if((p.left==null&&q.left!=null)||(q.left==null&&p.left!=null)){
            return false;
        }
        else if((p.right==null&&q.right!=null)||(q.right==null&&p.right!=null)){
            return false;
        }
        else {
            if (p.val == q.val) {
                boolean x=false,y=false;
                boolean a = isSameTree(p.left, q.left);
                if (a == true)
                    x=true;
                boolean b = isSameTree(p.right, q.right);
                if (b == true)
                    y=true;

                if(x==true&&y==true){
                    return true;
                }    
            } 
            else {
                return false;
            }
        }
        return false;
    }
}
