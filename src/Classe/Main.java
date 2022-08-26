package Classe;

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
        validacaoFaltas.setStatusFalta(aluno.getFalta(), aluno.getNome());

        //Inserindo notas
        Nota notaN1 = new Nota();
        Nota notaN2 = new Nota();
        Nota notaAP = new Nota();

        //Inserindo notas iniciais do aluno
        notaN1.setN1();
        notaN2.setN2();
        notaAP.setAp();

        // Realiza media do aluno
        MediaNota mediaNota = new MediaNota();
        mediaNota.setRealizaMedia(notaN1.getN1(), notaN2.getN2(), notaAP.getAp());

        //Caso media esteja abaixo, inserir nota N3 e recalcular media
        if(mediaNota.getMedia() < NOTA_MINIMA) {
            System.out.println("Necessario N3");

            Nota notaN3 = new Nota();
            //Insere nota N3
            notaN3.setN3();

            //Recalcula media
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
