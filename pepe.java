import java.io.*;
import java.util.*;
public class pepe {
    static class graph{
        public int v;
        public int[][] matriz;
        graph(int v){
            this.v=v;
            matriz=new int[v][v];
            for(int i =0;i<v;i++){
                for(int j=0;j<v;j++){
                    matriz[i][j]=0;
                }
            }
        }
        public void add(int x , int y){
            matriz[x][y]=1;
        }
        public void bfs(){
            boolean []visitados = new boolean[v];
            for(int i=0; i<v; i++){
                visitados[i]=false;
            }
            LinkedList<Integer> queue = new LinkedList<Integer>();
            visitados[0]=true;
            int nivel=0;
            int posicion=0;
            for(int i=0; i<v;i++){
                for(int j=1; j<v; j++){
                    if(visitados[j]==false){
                        if(matriz[i][j]==1){
                            if(posicion!=i){
                                nivel++;
                                posicion=i;
                            }
                            visitados[j]=true;
                            queue.add(nivel+1);
                        }
                    }
                }
            }
            
            while (queue.size()!=0) {
                System.out.println(queue.poll());
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pacientes = 5;
        int contactos = 6;
        graph contagios = new graph(contactos);
        contagios.add(0, 1);
        contagios.add(0, 2);
        contagios.add(3, 2);
        contagios.add(2, 4);
        contagios.add(4, 3);
        contagios.add(1, 2);
        contagios.bfs();
        sc.close();
    }
}
