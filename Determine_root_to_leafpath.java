//Given a sum and tree determine if adding up the values from root to leaf path gives the sum
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        
        if(root == null)
        {
            return false;
        }
        
        if(root.left == null && root.right == null)
        {
            return ((sum - root.val) == 0);
        }
        if(root.left != null || root.right!=null)
        {
            int subsum = sum - root.val;
            return hasPathSum(root.left,subsum) || hasPathSum(root.right,subsum);
        }
        return false;
    }
}