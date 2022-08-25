package Classe;

import java.util.Scanner;

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
        Double n1Scanner = scanner.nextDouble();
        System.out.println();
        return n1Scanner;
    }

    public Double setN2() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserir nota N2: ");
        Double n2Scanner = scanner.nextDouble();
        System.out.println();
        return n2Scanner;
    }

    public Double setN3() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserir nota N3: ");
        Double n3Scanner = scanner.nextDouble();
        System.out.println();
        return n3Scanner;
    }

    public Double setAp() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserir nota AP: ");
        Double apScanner = scanner.nextDouble();
        System.out.println();
        return apScanner;
    }
}
