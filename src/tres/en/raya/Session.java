/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tres.en.raya;

import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author dam1a07
 */
public class Session {
    
    
    private int HoraInicio; 
    private ArrayList<Rankig> Rankig;
    private ArrayList<Jugador> Jugador;
    private ArrayList<Partida> Partida;
    private Scanner teclado;
 
    public Session(){

        this.Rankig = new ArrayList<>();
        
        this.Jugador = new ArrayList<>();
        
        this.Partida = new ArrayList<>();
        
        teclado = new Scanner(System.in);
        
    }
    public static void main(String[] args) {
       
        Session S = new Session();
        
        S.Menu();
    }
  
    public void MostrarRanking() {
        // TODO implement me    
        Rankig R = new Rankig();
        
        Rankig.add(R);
        
        System.out.println("Ranking actual:");
        
    }
    
    public int SorteigTorn() {
        // TODO implement me    
        int Sorteo = (int) (Math.random()*2);
        
        return Sorteo;
    }
    
    public void CrearHumano() {
        // TODO implement me 
        
        
        System.out.println("Introduce tu nombre : \n");
        
        String NombreJugador = teclado.next();
        
        Jugador J = new Jugador(NombreJugador);
        
        Jugador.add(J);
        
        
    }
    
    public void Menu() {
        // TODO implement me  
        
        int a;
        
        System.out.println("\n1.Jugar una partida: \n2.Ver el rankig \n");
        
        a = teclado.nextInt();
        
        if (a == 1){
            CrearHumano();
            CrearPartida();
        }else if( a == 2 ){
            MostrarRanking();
        }else{
            System.out.println("No ha seleccionado una opcion posible. \nVuelve a selecionar una opción.");
            Menu();
        }
        
    }
    
    public void CrearPartida() {
        // TODO implement me   
        System.out.println("Partida creada: \n");
        
        Partida P = new Partida();
        
        Taulell T = new Taulell();
        
        
        
    }
}

