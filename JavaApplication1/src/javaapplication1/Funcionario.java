
package javaapplication1;


public class Funcionario extends Pessoa{
    protected String data_adm;
    protected double Salario;

    public Funcionario(String nome, double Salario) {
    super(nome);
    this.Salario= Salario;
    }

    public String getData_adm(String data_adm) {
        return data_adm;
    }

    public void setData_adm(String data_adm) {
        this.data_adm = data_adm;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(float Salario) {
        this.Salario = Salario;
    }
    
}
