/*
Para implementar jogos com cartas são necessárias 
classes que representam uma carta individual e 
também um baralho. Implemente essas classes, 
considerando que as Cartas são Ás, 2 a 10, valete, 
dama e rei, e os naipes são copas, espadas, ouros e 
paus; e Baralho é um conjunto de 52 cartas (13 cartas 
para cada naipe), em ordem ou embaralhado. 
 */
package exemplo3;

/**
 *
 * @author jvict
 */
public class Exemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
               
        baralho jogo = new baralho();
        jogo.embaralha();
        System.out.println(jogo);
    }
    
}
