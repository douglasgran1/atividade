
package javaapplication1;

import java.util.ArrayList;
import java.util.List;


public class Professor extends Funcionario{
private List<Escola> escola = new ArrayList<>();


    public Professor(String nome, double Salario) {
        super(nome, Salario);
    }


    public List<Escola> getEscola() {
        return escola;
    }

    public void setEscola(List<Escola> escola) {
        this.escola = escola;
    }


    public void setEscola(Escola e){
        this.escola.add(e);
    }
    
    
  
}
