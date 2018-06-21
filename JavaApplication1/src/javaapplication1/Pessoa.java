
package javaapplication1;


public class Pessoa {
    protected String nome;
    protected int mat;
    protected String end;
    protected float tel;

    public Pessoa(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMat(int mat) {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getEnd(String end) {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public float getTel(float tel) {
        return tel;
    }

    public void setTel(float tel) {
        this.tel = tel;
    }
    
    
    
}
