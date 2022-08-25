package Classe;

public class ValidacaoFaltas {
    private Boolean statusAprovacao;

    public Boolean getStatusAprovacao() {
        return statusAprovacao;
    }

    public Boolean setStatusAprovacao(Integer faltaAluno) {
        if(faltaAluno > 10){
            //reprovado
            statusAprovacao = false;
        }else{
            //aprovado
            statusAprovacao = true;
        }

        return statusAprovacao;
    }
}
