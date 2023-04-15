from Utils import TreeNode
from typing import Optional, List

class Leetcode102:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        levels = []
        if not root:
            return levels
        
        def traverse(root, level):
            if root is None:
                return
            if len(levels) == level:
                levels.append([])
            levels[level].append(root.val)
            traverse(root.left, level+1)
            traverse(root.right, level+1)
            
        traverse(root, 0)
        return levels