package tres.en.raya;

import java.util.Scanner;

public class Jugador {

    private String Nombre;

    public Jugador(String Nombre) {
        this.Nombre = Nombre;

    }

    public Casella moviment() {
        Casella c;
        Scanner t = null;

        c = new Casella(this.movimentCol(t),
                this.movimentFil(t)
        );

        return c;
    }

    private int movimentCol(Scanner t) {
        int m_col;

        System.out.println("En que col?");
        m_col = t.nextInt();

        return m_col;
    }

    private int movimentFil(Scanner t) {
        int m_fila;

        System.out.println("En que fila?");
        m_fila = t.nextInt();

        return m_fila;
    }

}
