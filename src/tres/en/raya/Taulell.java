package tres.en.raya;

import java.util.Scanner;

public class Taulell {

    Scanner t = new Scanner(System.in);

    private boolean Caselles;

    private String[][] a;

    private int fila, col;

    public Taulell() {
        a = new String[3][3];

        Casella m = new Casella(fila, col);

        mostrar(m);

    }

    public boolean validarMoviment() { //VALIDAR MOVIMIENTOS DEL JUGADOR

        return true;
    }

    public void moure(Casella m) {    //REPRESENTACION GRAFICADEL MOVIMINETO
        
        
    }

    public boolean compovarGuanyador() {
        return false;
    }

    public void mostrar(Casella m) {//Mostrar
        
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = "[  ]";
                System.out.print("\t" + a[i][j]);
            }
            System.out.println("");
        }
        
        moure(m);
        
                

    }

    public boolean comprovarPle() {
        // TODO implement me 
        return false;
    }

    public boolean getCasella() {
        // TODO implement me 
        return false;
    }

    public boolean validarCasillaBuides() {

        return true;
    }
}
