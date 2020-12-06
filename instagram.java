import java.io.*;
import java.util.*;
public class instagram {
    static class grafo{
        public int v;
        public int [][] matriz;
        grafo(int v){
            this.v=v;
            matriz=new int[v][v];
        }
        public void add(int x, int y, int value){
            matriz[x][y] = value;
        }
        public void instagram(){
            for(int i=0; i < v; i++){
                for(int j =i; j< v; j++){
                    if(matriz[i][j]==0){
                        matriz[i][j]=1;
                    }
                }
            }
        }
        public void print(){
            for(int i=0; i < v; i++){
                for(int j =0; j<v;j++){
                    System.out.print(matriz[i][j]+" ");
                }
                System.out.println(" ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tamaño = sc.nextInt();
        grafo red = new grafo(tamaño);
        for(int i=0; i<tamaño; i++){
           for(int j=0; j<tamaño;j++){
               red.add(i, j, sc.nextInt());
           } 
        }
        System.out.println(" ");       
        red.instagram();
        red.print();
        sc.close();
    }
}