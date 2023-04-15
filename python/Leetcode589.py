from typing import List
from Utils import Node


class Leetcode589:
    def preorder(self, root) -> List[int]:
        visited = list()       
        if root is None:
            return [] 
        self.traverse(root, visited)
        return visited

    def traverse(self, root, visited):
        visited.append(root.val)
        for child in root.children:
            self.traverse(child, visited)