package Metodo;

import Classe.Aluno;
import Classe.MediaNota;
import Classe.Nota;
import Classe.ValidacaoFaltas;

import static java.lang.System.exit;

public class Main {
    public static void main(String[] args) {
        Double NOTA_MINIMA = 6.0;
        Aluno aluno = new Aluno();

        //Inserindo nome
        aluno.setNome();

        // Inserindo falta
        aluno.setFalta();

        // Verifica limite faltas
        ValidacaoFaltas validacaoFaltas = new ValidacaoFaltas();
//        validacaoFaltas.setStatusAprovacao(aluno.getFalta());
//        if(validacaoFaltas.getStatusAprovacao() == false){
//            System.out.println("-------------------------------------------------------");
//            System.out.println("Aluno " + aluno.getNome() + " REPROVADO por falta.");
//            System.out.println("Tolerancia de faltas: 10");
//            System.out.println("Total faltas do aluno: " + aluno.getFalta());
//            System.out.println("-------------------------------------------------------");
//
//            exit(1);
//        }

        //Inserindo notas
        Nota notaN1 = new Nota();
        Nota notaN2 = new Nota();
        Nota notaAP = new Nota();

        notaN1.setN1();
        if(notaN1.getN1() == null){
            System.out.println("ERRO: Nota N1 invalida");
            exit(1);
        }

        notaN2.setN2();
        if(notaN2.getN2() == null){
            System.out.println("ERRO: Nota N2 invalida");
            exit(1);
        }

        notaAP.setAp();
        if(notaAP.getAp() == null){
            System.out.println("ERRO: Nota AP invalida");
            exit(1);
        }

        // Realiza media do aluno
        MediaNota mediaNota = new MediaNota();
        mediaNota.setRealizaMedia(notaN1.getN1(), notaN2.getN2(), notaAP.getAp());
        if(mediaNota.getMedia() < NOTA_MINIMA){
            System.out.println("Necessario N3");

            Nota notaN3 = new Nota();
            notaN3.setN3();

            if(notaN3.getN3() == null){
                System.out.println("ERRO: Nota N3 invalida");
                exit(1);
            }

            mediaNota.setRealizaMediaComN3(notaN1.getN1(), notaN3.getN3());

            if(mediaNota.getMedia() < NOTA_MINIMA){
                System.out.println("-------------------------------------------------------");
                System.out.println("Aluno " + aluno.getNome() + " REPROVADO por nota.");
                System.out.println("Media de aprovacao: " + NOTA_MINIMA);
                System.out.println("Media do aluno: " + mediaNota.getMedia());
                System.out.println("Total faltas do aluno: " + aluno.getFalta());
                System.out.println("-------------------------------------------------------");
                exit(1);
            }
        }
        System.out.println("-------------------------------------------------------");
        System.out.println("Aluno " + aluno.getNome() + " APROVADO");
        System.out.println("Media de aprovacao: " + NOTA_MINIMA);
        System.out.println("Media do aluno: " + mediaNota.getMedia());
        System.out.println("Total faltas do aluno: " + aluno.getFalta());
        System.out.println("-------------------------------------------------------");
    }
}
