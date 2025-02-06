
from typing import List


class Solution:
    def printGraph(self, V : int, edges : List[List[int]]) -> List[List[int]]:
        graph = [[] for _ in range(V)]
        for u, v in edges:
            graph[u].append(v)
            graph[v].append(u)
        return graph
