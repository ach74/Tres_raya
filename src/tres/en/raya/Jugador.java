package tres.en.raya;

import java.util.Scanner;

public class Jugador {

    private String Nombre;

    public Jugador(String Nombre) {
        this.Nombre = Nombre;

        moviment();
    }

    public Casella moviment() {
        Casella c;

        Scanner t = new Scanner(System.in);

        System.out.println("Donde quieres mover?");

        c = new Casella(this.movimentFil(t),this.movimentCol(t));

        return c;
    }

    private int movimentCol(Scanner t) {
        int m_col;

        System.out.print("En que col:");
        m_col = t.nextInt();

        return m_col;
    }

    private int movimentFil(Scanner t) {
        int m_fila;

        System.out.print("En que fila:");
        m_fila = t.nextInt();

        return m_fila;
    }

}
