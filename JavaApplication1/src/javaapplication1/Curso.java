
package javaapplication1;


class Curso {
    private int id;
    private String nome;
    private Escola escola;
    private static int idcount=0;

   public Curso(){
       this.id = idcount++;
   }
    
   public Curso(String nome){
       this.nome= nome;
   }
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


    public Escola getEscola() {
        return escola;
    }


    public void setEscola(Escola escola) {
        this.escola = escola;
    }


}
