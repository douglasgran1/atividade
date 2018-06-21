
package javaapplication1;

import java.util.ArrayList;
import java.util.List;


public class Escola {
    private int id;
    private String nome;
    private static int idcount=0;

    public Escola(){
        this.id = idcount++;
    }
    public int getId(int id) {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome(String nome) {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

}
