def dfs(graph):
    seen = set()
    path = []
    def explore(node):
        seen.add(node)
        path.append(node)
        for link in graph[node]:
            if link not in seen:
                explore(link)
    explore(0)
    return path
