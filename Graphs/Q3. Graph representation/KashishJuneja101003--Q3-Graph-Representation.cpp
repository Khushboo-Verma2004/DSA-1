#include <iostream>
#include <vector>
using namespace std;

vector<vector<int>> adjacencyList(int V, vector<vector<int>> &edges) {
    vector<vector<int>> adj(V); // Create adjacency list with V nodes
    
    for (auto &edge : edges) {
        int u = edge[0], v = edge[1];
        adj[u].push_back(v);
        adj[v].push_back(u); // Since the graph is undirected
    }

    return adj;
}

int main() {
    int V1 = 5, E1 = 7;
    vector<vector<int>> edges1 = {{0,1}, {0,4}, {4,1}, {4,3}, {1,3}, {1,2}, {3,2}};
    
    vector<vector<int>> result1 = adjacencyList(V1, edges1);
    
    // Printing the adjacency list
    for (int i = 0; i < V1; i++) {
        cout << i << ": ";
        for (int neighbor : result1[i]) {
            cout << neighbor << " ";
        }
        cout << endl;
    }

    return 0;
}
