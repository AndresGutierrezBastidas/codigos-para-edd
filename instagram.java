/**
 * instagram
 */
public class instagram {
    static class grafo{
        public int v;
        public int [][] matriz;
        grafo(int v){
            this.v=v;
            matriz=new int[v][v];
            for(int i = 0; i < v; i++){
                for(int j = 0; j<v; j++){
                    matriz[i][j] = 0;
                }
            }
        }
        public void add(int x, int y){
            matriz[x][y] = 1;
        }
    }
    public static void main(String[] args) {
        grafo red = new grafo(4);
        red.add(0, 0);
        red.add(0, 1);
        red.add(0, 3);
        red.add(1, 1);
        red.add(1, 2);
        red.add(2, 2);
        red.add(2, 3);
        red.add(3, 3);
    }
}