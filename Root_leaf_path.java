//The function returns the root to leaf path of a binary tree

public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        
        String stringcurrent;
        
        List<String> btl = new ArrayList<String>();
        if(root == null)
        {
            return btl;
        }
        stringcurrent = String.valueOf(root.val);
        callpath(root, btl, stringcurrent);
        return btl;
        
        
    }
    
    public void callpath(TreeNode root, List<String> btl, String stringcurrent)
    {
        if(root.left == null && root.right==null)
        {
            btl.add(stringcurrent);
        }
       else
       {
        if(root.left != null)
        {
            callpath(root.left, btl, stringcurrent.concat("->").concat(String.valueOf(root.left.val)));
        }
        
        if(root.right != null)
        {
            callpath(root.right, btl, stringcurrent.concat("->").concat(String.valueOf(root.right.val)));
        }
       }
        
    }
    
    
    
    
    
    
    
    
    
}