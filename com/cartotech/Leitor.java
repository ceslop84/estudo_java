package com.cartotech;

import java.util.Scanner;

public class Leitor {
    
    Scanner leitor;

    public Leitor(){
        this.leitor = new Scanner(System.in);
    }

    public String letTexto(String questao){
        System.err.println(questao);
        return this.leitor.nextLine();
    }

    public double lerDecimal(String questao){
        System.err.println(questao);
        double valor = this.leitor.nextDouble();
        this.leitor.nextLine();
        return valor;
    }

    public int lerInteiro(String questao){
        System.err.println(questao);
        int valor = this.leitor.nextInt();
        this.leitor.nextLine();
        return valor;
    }
    
}
