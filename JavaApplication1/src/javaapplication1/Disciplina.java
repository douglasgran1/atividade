
package javaapplication1;

import java.util.ArrayList;
import java.util.List;


public class Disciplina {
    private int id;
    private String nome;
    private List<Curso> curso= new ArrayList<>();
    private boolean idcount;


    public int getId() {
        return id;
    }


    public void setId(int id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Curso> getCurso() {
        return curso;
    }


    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }
    public void setCurso(Curso c){
        this.curso.add(c);
    }


    public boolean isIdcount() {
        return idcount;
    }


    public void setIdcount(boolean idcount) {
        this.idcount = idcount;
    }
    }
