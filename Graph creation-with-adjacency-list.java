output
0 ->  ( 0,1 , 10 )  ( 0,3 , 40 ) 
1 ->  ( 1,0 , 10 )  ( 1,2 , 40 ) 
2 ->  ( 2,1 , 40 )  ( 2,3 , 10 ) 
3 ->  ( 3,0 , 40 )  ( 3,2 , 10 ) 

import java.io.*;
import java.util.*;

public class Main {

    public static class Edge{
        int src;
        int nbr;
        int wt;
        
        public Edge(int src,int nbr,int wt){
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
        
    }
   
   public static void main(String[] args) throws Exception {
      ArrayList<Edge>[] graph=new ArrayList[7];
      
      //now assigns memory or empty arraylist to each array element
      for(int i=0;i<graph.length;i++){
          graph[i]=new ArrayList<>();
      }
      
      //0th- all connected path
      graph[0].add(new Edge(0,1,10));
      graph[1].add(new Edge(1,0,10));
      
      graph[0].add(new Edge(0,3,40));
      graph[3].add(new Edge(3,0,40));
      
      graph[1].add(new Edge(1,2,40));
      graph[2].add(new Edge(2,1,40));
      
      graph[3].add(new Edge(3,2,10));
      graph[2].add(new Edge(2,3,10));
        
        
      //now printing the graph elements
      for(int i=0;i<graph.length;i++){
          System.out.print(i+" -> ");
          for(Edge E:graph[i]){
              System.out.print(" ( "+E.src+","+ E.nbr+ " , "+E.wt+" ) ");
          }
          System.out.println();
      }
      
   } 

}