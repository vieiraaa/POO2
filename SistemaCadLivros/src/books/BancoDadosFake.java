/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books;

/**
 *
 * @author jvict
 */
public class BancoDadosFake {
    private final int MAX = 50;
    private NovoItem[] dados = new NovoItem[MAX];
    private int nRegistros = 0;
    
    public void add(NovoItem dado){
        dados[nRegistros] = dado;
        nRegistros++;
    }

    @Override
    public String toString() {
        String info = "";
        
        if(nRegistros > 0){
            for (int i = 0; i<nRegistros; i++){
                 
                info += "\n\nCadastro número : " + i;
                
                info += "\n\nSolicitado por : " + dados[i].getNome();
                
                info += "\n\nDescrição do Item: " + dados[i].getDesc();                
                
                info += "\n\nAutor: " + dados[i].getAut(); 
                
                info += "\n\n=x=x=x=x=x=x=x=x=x=x=x=x=x=x=x=x=x=x\n\n";
            }
            info += "Total de Registros: " + nRegistros;
        } else {
            info += "Nenhum item foi encontrado!";
        }
        return info;
    }  
        
    
    public void edit(int pos, NovoItem dado){
    dados[pos] = dado;
}
    
    public NovoItem getDado (int pos){
        return dados[pos];
    }
    
    public int getnRegistros(){
        return nRegistros;
    }

}
