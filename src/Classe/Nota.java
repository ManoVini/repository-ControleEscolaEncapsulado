package Classe;

import java.util.Scanner;

import static java.lang.System.exit;

public class Nota {
    private Double n1;
    private Double n2;
    private Double ap;
    private Double n3;

    public Double getN1() {
        return n1;
    }

    public Double getN2() {
        return n2;
    }

    public Double getN3() {
        return n3;
    }

    public Double getAp() {
        return ap;
    }

    public Double setN1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserir nota N1: ");
        double n1Scanner = scanner.nextDouble();
        System.out.println();

        if(n1Scanner < 0){
            System.out.println("ERRO: Nota N1 invalida");
            exit(1);
        }
        return n1 = n1Scanner;
    }

    public Double setN2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserir nota N2: ");
        double n2Scanner = scanner.nextDouble();
        System.out.println();

        if(n2Scanner < 0){
            System.out.println("ERRO: Nota N2 invalida");
            exit(1);
        }
        return n2 = n2Scanner;
    }

    public Double setN3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserir nota N3: ");
        double n3Scanner = scanner.nextDouble();
        System.out.println();

        if(n3Scanner < 0){
            System.out.println("ERRO: Nota N3 invalida");
            exit(1);
        }
        return n3 = n3Scanner;
    }

    public Double setAp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserir nota AP: ");
        double apScanner = scanner.nextDouble();
        System.out.println();

        if(apScanner < 0){
            System.out.println("ERRO: Nota AP invalida");
            exit(1);
        }
        return ap = apScanner;
    }
}
