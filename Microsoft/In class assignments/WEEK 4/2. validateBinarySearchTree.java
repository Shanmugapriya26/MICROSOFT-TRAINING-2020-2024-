class Solution {
    public boolean isValidBST(TreeNode root) {
        if (root == null) return true;
        Stack<TreeNode> stack = new Stack<>();
        TreeNode k = null;
        while (root != null || !stack.isEmpty()) {
            while (root != null) {
                 stack.push(root);
                 root = root.left;
            }
            root = stack.pop();
            if(k != null && root.val <= k.val) return false;
            k = root;
            root = root.right;
        }
        return true;
    }
}
