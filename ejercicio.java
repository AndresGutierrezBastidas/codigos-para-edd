import java.io.*;
import java.util.*;
public class ejercicio {
    static class graph{
        public int v;
        public int[][] matriz;
        public graph(int v){
            this.v=v;
            matriz=new int[v][v];
            for(int i=0; i<v; i++){
                for(int j=0; j<v; j++){
                    matriz[i][j]=0;
                }
            }
        }
        //de esta manera es dirigido
        public void add(int i , int j, int value){
            matriz[i][j]=value;
            matriz[j][i]=value;
        }
        public void remove(int i, int j){
            matriz[i][j]=0;
        }
        //para que no sea dirigido debo implementarlo de la sigiente forma
        /*         public void add(int i , int j){
            matriz[i][j]=1;
            matriz[j][i]=1;
        }
        public void remove(int i, int j){
            matriz[i][j]=0;
            matriz[j][i]=0;
        }*/
        void BFS(int start){
            boolean visited[]= new boolean[v];
            LinkedList<Integer> list = new LinkedList<>();

            visited[start] = true;
            list.addLast(start);
            
            while (list.size()!=0) {
                int current = list.removeFirst();
                System.out.println(current);
                
                for(int i = 0; i<v; i++){
                    if(matriz[current][i]!=0 && visited[i]==false){
                        list.addLast(i);
                        visited[i]=true;
                    }    
                }
            }
        }
    }
    class graphlist{
        public int v;
        public LinkedList<Integer> adj[];
        graphlist(int v){
            this.v=v;
            adj=new LinkedList[v];
            for(int i = 0; i<v; i++){
                adj[i]=new LinkedList<Integer>();
            }
        }
        public void add(int x, int y){
            adj[x].add(y);
        }
        public void remove(int x, int y){
            int index = 0;
            Iterator<Integer> i = adj[x].listIterator();
            while (i.hasNext()) {
                int current = i.next();
                if(current==y){
                    break;
                }
                index++;
            }
            adj[x].remove(index);
        }
    }
    public static void main(String[] args) {
        graph astronauta = new graph(4);
        astronauta.add(0, 1, 1);
        astronauta.add(0, 2, 1);
        astronauta.add(0, 3, 1);
        astronauta.add(1, 0, 1);
        astronauta.add(1, 3, 1);
        astronauta.add(2, 0, 1);
        astronauta.add(2, 3, 1);
        astronauta.add(3, 0, 1);
        astronauta.add(3, 1, 1);
        astronauta.add(3, 2, 1); 
        astronauta.BFS(0);
    }
}