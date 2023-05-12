from Utils import TreeNode
import math

class Leetcode1448:
    def goodNodes(self, root: TreeNode) -> int:
        largest = -math.inf

        def traverse(root, largest):
            if root is None:
                return
            good_nodes = 0
            if root.val >= largest:
                good_nodes += 1
                largest = root.val
                print('Node: ', root.val)            
            return good_nodes + traverse(root.left, largest) + traverse(root.right, largest)

        return traverse(root, largest)