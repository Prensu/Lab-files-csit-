#include <bits/stdc++.h>
using namespace std;

// Number of vertices in the graph
#define V 6


int minKey(int key[], bool mstSet[])
{
    // Initialize min value
    int min = INT_MAX, min_index;

    for (int v = 0; v < V; v++)
        if (mstSet[v] == false && key[v] < min)
            min = key[v], min_index = v;

    return min_index;
}


void printMST(int parent[], int graph[V][V])
{
    cout << "Edge \tWeight\n";
    for (int i = 1; i < V; i++)
        cout << parent[i] << " - " << i << " \t"
            << graph[i][parent[i]] << " \n";
}


void primMST(int graph[V][V])
{
    
    int parent[V];
    int key[V];
    bool mstSet[V];

    // Initialize all keys as INFINITE
    for (int i = 0; i < V; i++)
        key[i] = INT_MAX, mstSet[i] = false;    
    key[0] = 0;
    parent[0] = -1;

    // The MST will have V vertices
    for (int count = 0; count < V - 1; count++) {
        
        
        int u = minKey(key, mstSet);

        // Add the picked vertex to the MST Set
        mstSet[u] = true;

        
        for (int v = 0; v < V; v++)

            
            if (graph[u][v] && mstSet[v] == false
                && graph[u][v] < key[v])
                parent[v] = u, key[v] = graph[u][v];
    }

    // Print the constructed MST
    printMST(parent, graph);
}

// Driver's code
int main()
{
    int graph[V][V] = { { 0, 3, 1, 5, 2, 3 },
                        { 3, 1, 4, 7, 3, 2 },
                        { 1, 4, 1, 1, 1, 5 },
                        { 7, 9, 1, 2, 6, 2 },
                        { 4, 5, 6, 7, 4, 5 },
                        { 1, 2, 3, 8, 6, 9 }};

    // Print the solution
    primMST(graph);

    return 0;
}