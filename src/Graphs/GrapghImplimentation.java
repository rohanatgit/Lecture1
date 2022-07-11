package Graphs;

import java.util.LinkedList;
import java.util.Scanner;

public class GrapghImplimentation {
    private LinkedList<Integer> adjacency[];
     GrapghImplimentation(int v){
        adjacency=new LinkedList[v];
        for(int i=0;i<v;i++){
            adjacency[i]=new LinkedList<Integer>();
        }
    }
        void insertedge(int s,int d){
        adjacency[s].add(d);
        adjacency[d].add(s);

    }

    public static void main(String[] args) {
     Scanner sc =new Scanner(System.in);
        System.out.println("Enter number of verticies and edges");
        int v =sc.nextInt();
        int e=sc.nextInt();
        GrapghImplimentation g=new GrapghImplimentation(5);


        for(int i=0;i<e;i++){
            int s=sc.nextInt();
            int d=sc.nextInt();
            g.insertedge(s,d);
        }
    }
}