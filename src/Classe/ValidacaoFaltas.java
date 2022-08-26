package Classe;

import static java.lang.System.exit;

public class ValidacaoFaltas {
    private Boolean statusFalta;

    public Boolean setStatusFalta(Integer faltaAluno, String nomeAluno) {
        //reprovado
        if(faltaAluno > 10){
            System.out.println("-------------------------------------------------------");
            System.out.println("Aluno " + nomeAluno + " REPROVADO por falta.");
            System.out.println("Tolerancia de faltas: 10");
            System.out.println("Total faltas do aluno: " + faltaAluno);
            System.out.println("-------------------------------------------------------");

            exit(1);
            statusFalta = false;
        }else{
            //dentro do limite de falta
            statusFalta = true;
        }
        return statusFalta;
    }
}
