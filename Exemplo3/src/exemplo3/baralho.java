/*
as Cartas são Ás, 2 a 10, valete, dama e rei,
naipes são copas, espadas, ouros e paus; e Baralho

52 cartas (13 cartas para cada naipe), em ordem ou embaralhado.
 */
package exemplo3;
import java.util.Random;

/**
 *
 * @author jvict
 */
public class baralho {
    
   public cartas[] var;

    public baralho() throws Exception {
        var = new cartas[52];
        
        String[] cat ={
            
            "Paus",
            "Ouros",
            "Espadas",
            "Copas"
        
        };
        
        for(int i = 0; i<52; i++){
            
            var[i] = new cartas((i%13)+1, cat[i/13]);
            
        }
    }
   
    public void embaralha(){
        Random shuffle = new Random();
        
        int x = 0;
        int y = 0;
        
        for(int i = 0; i<250; i++){
            
            y = shuffle.nextInt(52);
            
            x = shuffle.nextInt(52);
            
            
            cartas aux = var[x];
            
            var[x] = var[y];
            
            var[y] = aux;
        }
    }
    
    @Override
    public String toString(){
        
        String show = "#  Cartas de um baralho completo!  #\n";
        
        for(int i=0; i< 52; i++){
            
            show = show.concat((i+1) + " = " + var[i] + "\n");
            
        }
        
       return show;
    }
}
