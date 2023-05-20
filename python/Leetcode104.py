from typing import Optional
from Utils import TreeNode
class Leetcode104:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def traverse(root, level):
            if root is None:
                return level
            return max(traverse(root.left, level + 1), traverse(root.right, level + 1))
        
        return traverse(root, 0)