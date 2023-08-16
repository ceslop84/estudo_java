package com.cartotech;

import java.time.LocalDate;

public class Cidadao{

    private LocalDate dataNascimento;

    public Cidadao(LocalDate datanascimento){
        this.setDataNascimento(datanascimento);
    }

    public int calcularIdade(){
        int anoAtual = LocalDate.now().getYear();
        int anoNascimento = this.dataNascimento.getYear();
        return anoAtual-anoNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento){
        this.dataNascimento = dataNascimento;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public String tipoEleitor(){
        int idade = this.calcularIdade();
        if (idade<16){
            return "Não eleitor";
        } else if ((idade>=16 && idade<18) || (idade>70)){
            return "Eleitor facultativo";
        } else{
            return "Eleitor obrigatório";
        }
    }

}