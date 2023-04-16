from Utils import TreeNode
from typing import Optional
import math

class Leetcode98:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:

        def validate(node, low=-math.inf, high=math.inf):
            if not node:
                return True
            if node.val <= low or node.val >= high:
                return False

            return (validate(node.left, low, node.val)) and (validate(node.right, node.val, high))