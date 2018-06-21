
package javaapplication1;


public class Administrativo extends Funcionario{
    private Setor setor;

    public Administrativo(String nome, double Salario) {
        super(nome, Salario);
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }
}
