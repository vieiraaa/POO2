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
    public class NovoItem {
    
    private String nome;    
    private String desc;    
    private String aut;
    
    NovoItem(String nome, String desc, String aut) {
        this.nome = nome;
        this.desc = desc;
        this.aut = aut;
    }

    public String getAut() {
        return aut;
    }

    public void setAut(String aut) {
        this.aut = aut;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    
}
