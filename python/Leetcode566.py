from typing import List

class Leetcode566:
    def matrix_reshape(self, mat: List[List[int]], r: int, c: int) -> List[List[int]]:
        entries = len(mat) * len(mat[0])
        if entries != r * c:
            return mat
        m = len(mat)
        n = len(mat[0])
        r_idx = 0 # mat row
        c_idx = 0 # mat column
        result = []
        for i in range(r):
            row = []
            for j in range(c):
                if c_idx < n:
                    row.append(mat[r_idx][c_idx])
                    c_idx += 1
                else:
                    r_idx += 1
                    c_idx = 0
                    row.append(mat[r_idx][c_idx])
                    c_idx += 1
            result.append(row)
        return result