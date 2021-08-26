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
public class livro {
    
    public static void main(String[] args){
        autor a1 = new autor("Autor 01");
        autor a2 = new autor("Autor 02");
        autor a3 = new autor("Autor 03");
        
        itens i1 = new itens();
    System.out.println(a1.getNome() + i1.getid());
    System.out.println(a2.getNome());
    System.out.println(a3.getNome());
    }
      
    }

