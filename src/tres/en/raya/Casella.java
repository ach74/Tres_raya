package tres.en.raya;

public class Casella {

    private int col, fila;

    public Casella(int f, int c) {
        this.col = c;
        this.fila = f;
        
        System.out.println(col);
    }
    
    public int getCol(){
        
        return this.col;
    }

    public int getFila(){
        
        return this.fila;
    }
}
