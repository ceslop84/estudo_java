package com.cartotech;

import java.util.Arrays;

public class Matriz{

    public double[][] matriz = new double[2][2];

    public Matriz (double[][] valores){
        this.matriz = valores;
    }
    

    public String toString(){
        return Arrays.toString(this.matriz[0]) + Arrays.toString(this.matriz[1]);
    }

    public void atualizar(int linha, int coluna, double valor){
        this.matriz[linha][coluna] = valor;
    }
}
