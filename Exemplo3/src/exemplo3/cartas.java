/*
classes que representam uma carta individual e também um baralho. Implemente essas classes
naipes são copas, espadas, ouros e paus; e Baralho
*/
package exemplo3;

/**
 *
 * @author jvict
 */
public class cartas {
    private int n;
    private String naipe;

    public cartas(int nCarta, String categoria) throws Exception {
        this.setNumero(nCarta);
        this.setNaipe(categoria);
    }

    public void setNumero(int nCarta)throws Exception {
        if(nCarta>0 || nCarta<=13){
            this.n = nCarta;
        }else{
            throw new Exception("Carta inválida!!");
        }
        
    }

    public void setNaipe(String categoria)throws Exception {
        
        if(categoria=="Espadas"){
            this.naipe = categoria;
            
        }else if  (categoria=="Paus"){
            this.naipe = categoria;
            
        }else if  (categoria=="Copas"){
            this.naipe = categoria;
            
        }else if  (categoria=="Ouros"){
            this.naipe = categoria;
            
        } else{
            throw new Exception("Esta carta pode ser um Coringa ou é inválida!");  
            
        }
        
    }
    
    public int getNumero() {
        return n;
    }
    
    public String getNaipe() {
        return naipe;
    }
    
    @Override
    public String toString(){
        if(n == 11){
           return "Valete de " + naipe; 
        }else if(n == 12){
            return "Dama de " + naipe; 
        }else if(n == 13){
            return "Rei de " + naipe; 
        }else if(n == 1){
            return "Ás de " + naipe; 
        }else{
        return n + " de " + naipe;
        }
    }
}
