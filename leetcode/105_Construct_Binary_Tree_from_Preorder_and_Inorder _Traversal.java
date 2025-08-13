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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(inorder, preorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    public TreeNode createTree(int[] in, int[] pre, int ilo, int ihi, int plo, int phi) {
        if (ilo > ihi || plo > phi) {
            return null;
        }
        TreeNode node = new TreeNode(pre[plo]);
        int idx = Search(in, ilo, ihi, pre[plo]); 
        int c = idx - ilo; // size of left subtree
        
        node.left = createTree(in, pre, ilo, idx - 1, plo + 1, plo + c);
        node.right = createTree(in, pre, idx + 1, ihi, plo + c + 1, phi);
        return node;
    }

    public int Search(int[] in, int ilo, int ihi, int item) {
        for (int i = ilo; i <= ihi; i++) { // <= hona chahiye
            if (in[i] == item) {
                return i;
            }
        }
        return -1; // not found
    }
}
