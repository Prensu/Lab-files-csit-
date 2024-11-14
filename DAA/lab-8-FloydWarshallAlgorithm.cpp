using namespace std;
#include<iostream>
#define V 5
#define INF 99999


void printSolution(int dist[][V]);

int count = 0;
void floydWarshall(int dist[][V])
{

    int i, j, k;

    
    for (k = 0; k < V; k++) {
        
        for (i = 0; i < V; i++) {
        
            for (j = 0; j < V; j++) {
                
                if (dist[i][j] > (dist[i][k] + dist[k][j])
                    && (dist[k][j] != INF
                        && dist[i][k] != INF))
                        {
                            dist[i][j] = dist[i][k] + dist[k][j];
                            count = count +    6;
                        }
                count = count +    4;
            }
            count = count +    4;
        }
        count = count +    4;
    }


    printSolution(dist);
}


void printSolution(int dist[][V])
{
    cout << "The following matrix shows the shortest distances between every pair of vertices \n";
    for (int i = 0; i < V; i++) {
        for (int j = 0; j < V; j++) {
            if (dist[i][j] == INF)
                cout << "INF"
                    << " ";
            else
                cout << dist[i][j] << " ";
        }
        cout << endl;
    }
}


int main()
{
    
    int graph[V][V] = { { 1, 6, INF, 12 , INF},
                        { INF, 5, 0, INF, 5 },
                        { 9, INF, 3, 5 ,5 },
                        { INF, INF, 10, 1, 6 },
                        { 0, 2, INF, INF, 6}};


    floydWarshall(graph);
    cout<<"Required No of steps : " <<count;
    return 0;
}