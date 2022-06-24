input: 
5
6
0 1
0 4
1 3
3 2
4 3
1 2
output:
2-> 3, 1, 
3-> 1, 2, 4, 
4-> 0, 3, 
1-> 0, 3, 2, 
0-> 1, 4, 

#include<bits/stdc++.h>
using namespace std;

class Graph{
  public:
    unordered_map<int,list<int>>adj;
    
    void addEdge(int u,int v){
        adj[u].push_back(v);
        adj[v].push_back(u);
    }
    void printAdjList(){
        for(auto i: adj){
            cout<<i.first<<"-> ";
            for(auto j: i.second){
                cout<<j<<", ";
            }
            cout<<endl;
        }
    }
};

int main(){
    int n;
    cout<<"Enter no. of nodes"<<endl;
    cin>>n;
    int m;
    cout<<"Enter no of edges"<<endl;
    cin>>m;
    
    Graph g;
    for(int i=0;i<m;i++){
        int u,v;
        cin>>u>>v;
        g.addEdge(u,v);
    }
    g.printAdjList();
    return 0;
}
