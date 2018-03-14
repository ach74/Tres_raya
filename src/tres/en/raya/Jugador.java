package tres.en.raya ;

import java.util.Scanner;


public class Jugador {
    
    private  String Nombre; 
    private Scanner teclado;
 
    public Jugador(String Nombre){
        this.Nombre = Nombre;
        
    }
    
    public String moviment() {
        int m_fila,m_col;
        System.out.println("En que fila?");
        m_fila = teclado.nextInt();
        
        System.out.println("En que col?");
        m_col = teclado.nextInt();
        
        return m_col+ " " + m_fila;
    }
}
