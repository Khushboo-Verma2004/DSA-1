def create_adjacency_list(V, edges):
    # Initialize an empty adjacency list with V empty lists.
    adj = [[] for _ in range(V)]
    
    # Add each edge in both directions since the graph is undirected.
    for u, v in edges:
        adj[u].append(v)
        adj[v].append(u)
    
    # Optionally sort the neighbors for each node if sorted output is required.
    for neighbors in adj:
        neighbors.sort()
    
    return adj

# Example usage:
if __name__ == '__main__':
    # Example 1
    V1 = 5
    edges1 = [[0,1], [0,4], [4,1], [4,3], [1,3], [1,2], [3,2]]
    print(create_adjacency_list(V1, edges1))
    # Expected Output: [[1,4], [0,2,3,4], [1,3], [1,2,4], [0,1,3]]
    
    # Example 2
    V2 = 4
    edges2 = [[0,3], [0,2], [2,1]]
    print(create_adjacency_list(V2, edges2))
    # Expected Output: [[2,3], [2], [0,1], [0]]
