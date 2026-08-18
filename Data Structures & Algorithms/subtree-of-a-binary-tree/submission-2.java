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
                boolean b = isSameTree(p.right, q.right);

                if(a==true&&b==true){
                    return true;
                }    
            } 
            else {
                return false;
            }
        }
        return false;
    }
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null){
            return true;
        }
        else if(root==null&&subRoot!=null||root!=null&&subRoot==null){
            return false;
        }
        else if(isSameTree(root, subRoot)){
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }
}
