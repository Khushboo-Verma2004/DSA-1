from collections import deque
def perform_bfs(graph):
    explored_nodes = set()
    processing_queue = deque([0])  
    explored_nodes.add(0)
    traversal_result = []
    while processing_queue:
        current_node = processing_queue.popleft()
        traversal_result.append(current_node)
        for adjacent_node in graph[current_node]:
            if adjacent_node not in explored_nodes:
                explored_nodes.add(adjacent_node)
                processing_queue.append(adjacent_node)
    return traversal_result
