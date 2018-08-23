/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSymmetric(TreeNode root) {
        
        if(root == null){
            return true;
        }
        return compared(root.right,root.left);
    }
    
    public boolean compared(TreeNode r1,TreeNode r2) {
        if(r1 == null && r2 == null){
            return true;
        }
        if(r1 == null || r2 == null) {
            return false;
        }
         if(r1.val == r2.val){
            return compared(r1.left,r2.right) &&  compared(r1.right,r2.left);
        }
        return false;
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        if (p.val == q.val) {
            return isSameTree(p.right,q.right) && isSameTree(p.left,q.left);
        }
        return false;
    }
}