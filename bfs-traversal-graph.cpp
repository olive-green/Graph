#include<bits/stdc++.h>
void prepareAdjList(unordered_map<int,set<int>> &adj,vector<pair<int,int>> edges){
    for(int i=0;i<edges.size();i++){
        int u=edges[i].first;
        int v=edges[i].second;
        adj[u].insert(v);
        adj[v].insert(u);
    }
}
void bfs(int node,unordered_map<int,set<int>> &adj,vector<int> &ans,unordered_map<int,bool> &visited){
    queue<int> q;
    q.push(node);
    visited[node]=true;

    while(!q.empty()){
        int frontNode=q.front();
        q.pop();
        ans.push_back(frontNode);
        for(auto i:adj[frontNode]){
        if(!visited[i]){
            q.push(i);
            visited[i]=true;
        }
      }
    }
    
}
vector<int> BFS(int vertex, vector<pair<int, int>> edges)
{
    // Write your code here
    //adjacency list creation
    unordered_map<int,set<int>> adj;
    prepareAdjList(adj,edges);
    
    vector<int> ans;
    //visited nodes
    unordered_map<int,bool> visited;
    for(int i=0;i<vertex;i++){
        if(!visited[i]){
            bfs(i,adj,ans,visited);
        }
    }
    return ans;
}