package tres.en.raya ;


public class Taulell {
    
    private boolean Caselles;
    private String[][] a;
 
    public Taulell(){
        a = new String [3][3];
        
        Mostrar();
        
        System.out.println("\nDonde quieres mover?");
        

    }
    
    public boolean ValidarMoviment() { //VALIDAR MOVIMIENTOS DEL JUGADOR
        // TODO implement me 
        return true;    
    }
    
    public void Moure() {    //REPRESENTACION GRAFICADEL MOVIMINETO
        // TODO implement me 
        ;    
    }
    
    public boolean CompovarGuanyador() {
        // TODO implement me 
        return false;    
    }
    
    public void Mostrar() {
      
        
        for( int i = 0 ; i< a.length; i ++ ){
            for ( int j = 0 ; j < a.length ; j ++){
                a[i][j]="*";
                System.out.print("\t"+a[i][j]);
            }
            System.out.println("");
        }
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
       // Jugador J = new Jugador();
        
        
        return false;    
    }
}
