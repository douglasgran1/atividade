
package javaapplication1;

import java.util.ArrayList;
import java.util.List;


public class Turma {

    private int id;
    private Disciplina Disciplina;
    private Professor Professor;
    private boolean idcount;
    private List<Aluno> Aluno = new ArrayList<>();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Disciplina getDisciplina() {
        return Disciplina;
    }

    public void setDisciplina(Disciplina Disciplina) {
        this.Disciplina = Disciplina;
    }

    public Professor getProfessor() {
        return Professor;
    }

    public void setProfessor(Professor Professor) {
        this.Professor = Professor;
    }

    public boolean isIdcount() {
        return idcount;
    }

    public void setIdcount(boolean idcount) {
        this.idcount = idcount;
    }

    public List<Aluno> getAluno() {
        return Aluno;
    }

    public void setAluno(List<Aluno> Aluno) {
        this.Aluno = Aluno;
    }


}
