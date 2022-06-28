output:
0 1 1 
1 0 1 
1 1 0 

import java.io.*;
import java.util.*;

public class Main{
    public static void createGraph(int[][]edges,int n){
        //if graph is zero based indexing then no need to add n+1,but if 
        // it is 1 based indexing then we have to create matrix of n+1,n+1 size
        int[][] adjMatrix=new int[n][n];
        for(int[] e:edges){
            int u=e[0];
            int v=e[1];
            adjMatrix[u][v]=1;
            adjMatrix[v][u]=1;
        }
        // print a graph 
        for(int i=0;i<adjMatrix.length;i++){
            for(int j=0;j<adjMatrix[0].length;j++){
                System.out.print(adjMatrix[i][j]+ " ");
            }
            System.out.println();
        }
        
    }
    public static void main(String[] args) throws Exception {
        int[][] edges=new int[3][2];
        edges[0]= new int[]{1,2};
        edges[1]= new int[]{0,1};
        edges[2]= new int[]{2,0};
        
        int v=3;
        createGraph(edges,v);
        
    }
}