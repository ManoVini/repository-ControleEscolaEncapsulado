package Classe;

import java.util.Scanner;

import static java.lang.System.exit;

public class Aluno {
    private String nome;
    private Integer falta;

    public String getNome() {
        return nome;
    }

    public Integer getFalta() {
        return falta;
    }

    public String setNome() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira nome do Aluno: ");
        String nomeScanner = scanner.nextLine();
        System.out.println();
        nome = nomeScanner;

        // Validação de campo valido
        if(nome.isEmpty()){
            System.out.println("ERRO: Nome invalido");
            exit(1);
        }
        return nome;
    }

    public Integer setFalta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insira a falta do Aluno: ");
        int faltaScanner = scanner.nextInt();
        System.out.println();
        falta = faltaScanner;

        // Validação do campo falta
        if(falta <= 0 || falta > 22){
            System.out.println("ERRO: Falta invalida");
            exit(1);
        }
        return falta;
    }
}
