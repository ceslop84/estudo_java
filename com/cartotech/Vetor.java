package com.cartotech;

import java.util.Arrays;

public class Vetor{

    double[] vetor;

    public Vetor(double[] valores){

        this.vetor = valores;

    }

    public String toString(){
        return Arrays.toString(this.vetor);
    }
}

