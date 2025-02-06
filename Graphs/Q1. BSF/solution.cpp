#include <bits/stdc++.h>
using namespace std;

vector<int> bfsOfGraph(int V, vector<vector<int>>& adj) {
    vector<int> bfs;  
    vector<bool> visited(V, false); 
    queue<int> q;

    q.push(0);
    visited[0] = true;

    while (!q.empty()) {
        int node = q.front();
        q.pop();
        bfs.push_back(node);  

        for (int neighbor : adj[node]) {
            if (!visited[neighbor]) {
                q.push(neighbor);
                visited[neighbor] = true;
            }
        }
    }
    return bfs;
}

int main() {
    // Example 1
    vector<vector<int>> adj1 = {{2,3,1}, {0}, {0,4}, {0}, {2}};
    vector<int> result1 = bfsOfGraph(5, adj1);
    cout << "BFS Traversal 1: ";
    for (int node : result1) cout << node << " ";
    cout << endl;

    // Example 2
    vector<vector<int>> adj2 = {{1,2}, {0,2}, {0,1,3,4}, {2}, {2}};
    vector<int> result2 = bfsOfGraph(5, adj2);
    cout << "BFS Traversal 2: ";
    for (int node : result2) cout << node << " ";
    cout << endl;

    return 0;
}
