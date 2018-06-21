
package javaapplication1;


public class Aluno extends Pessoa{
    private Curso curso;

    public Aluno(String nome) {
        super(nome);
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
    
    
}
