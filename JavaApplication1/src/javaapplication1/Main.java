
package javaapplication1;

import java.util.Scanner;


public class Main {   
    
static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        
        Escola e1 = new Escola();
        e1.setNome("UNIFACS");
        e1.setId(0);
        
        Professor p1 = new  Professor("Luiz",2000);
        p1.getMat(123);
        p1.getEnd("Santa monica");
        p1.getTel(912345678);
        p1.setEscola(e1);
        p1.getData_adm("29 de junho de 2018");
        
        Administrativo a1= new Administrativo("cleiton",1500);        
        Setor s1= new Setor();
        s1.setNome("financeiro");
        s1.setId(0);
        a1.setSetor(s1);
        a1.setMat(321);
        a1.setEnd("feira x casa 88");
        a1.setTel(987654321);
        
        Aluno al1= new Aluno("Douglas");
        Curso c1=new Curso("S.I");
        al1.setCurso(c1);
        al1.setMat(323171057);
        al1.setTel(943218765);
        al1.setEnd("Rua alegria n123");
        
        Turma t1=new Turma();
        Disciplina d1=new Disciplina();
        d1.setNome("poo");
        d1.setId(01);
        dl.setProfessor();
        dl.setDisciplina();
}
}
