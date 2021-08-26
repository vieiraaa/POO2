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
public class autor {
    private String nome;
    private int Registro;
    
    public autor (String nome){
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setRegistro(int Registro) {
        this.Registro = Registro;
    }

    public int getRegistro() {
        return Registro;
    }
    
    
}
