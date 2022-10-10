class Solution {
    int maxValue;
    
    public int maxPathSum(TreeNode root) {
        maxValue = Integer.MIN_VALUE;
        maxPathDown(root);
        return maxValue;
    }
    
    private int maxPathDown(TreeNode node) {
        if (node == null) return 0;
        int l = Math.max(0, maxPathDown(node.left));
        int r = Math.max(0, maxPathDown(node.right));
        maxValue = Math.max(maxValue, l + r + node.val);
        return Math.max(l, r) + node.val;
    }
}
