package tres.en.raya;

import java.util.Scanner;

public class Taulell {

    Scanner t = new Scanner(System.in);

    private boolean Caselles;

    private String[][] a;

    private int fila, col;

    public Taulell() {
        a = new String[3][3];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                a[i][j] = "[  ]";
                System.out.print("\t" + a[i][j]);
            }
            System.out.println("");
        }

        //Mostrar();

    }

    public boolean validarMoviment() { //VALIDAR MOVIMIENTOS DEL JUGADOR

        return true;
    }

    public void moure(Casella m) {    //REPRESENTACION GRAFICADEL MOVIMINETO
        // TODO implement me 

    }

    public boolean CompovarGuanyador() {
        // TODO implement me 
        return false;
    }

    public void Mostrar(Casella m) {//Mostrar

        moure(m);
    }

    public boolean ComprovarPle() {
        // TODO implement me 
        return false;
    }

    public boolean GetCasella() {
        // TODO implement me 
        return false;
    }

    public boolean ValidarCasillaBuides() {

        return true;
    }
}
