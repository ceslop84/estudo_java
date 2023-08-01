package com.cartotech;

public class Estudo {
    /*
     * Classe de Estudo para a prática da linguagem Java.
     */

    private int horasEstudo;
    private char periodo;
    private String disciplina;
    private boolean necessidadesEspeciais;
    
    public Estudo(){
        System.err.println("Método 1....");
    }

    public Estudo(int horasEstudo, char periodo, String disciplina, boolean necessidadesEspeciais){
        this();
        System.err.println("Método 2....");
        this.setHorasEstudo(horasEstudo);
        this.setPeriodo(periodo);
        this.setDisciplina(disciplina);
        this.setNecessidadesEspeciais(necessidadesEspeciais);
    }

    public char getPeriodo() {
        return this.periodo;
    }

    public void setPeriodo(char periodo) {
        this.periodo = periodo;
    }

    public String getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public boolean isNecessidadesEspeciais() {
        return this.necessidadesEspeciais;
    }

    public void setNecessidadesEspeciais(boolean necessidadesEspeciais) {
        this.necessidadesEspeciais = necessidadesEspeciais;
    }

    public int getHorasEstudo() {
        return this.horasEstudo;
    }

    public void setHorasEstudo(int horasEstudo) {
        this.horasEstudo = horasEstudo;
    }

    @Override
    public String toString(){
        return "Horas estudo " + this.horasEstudo + "h em " + this.disciplina + " no período " + this.periodo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Estudo other = (Estudo) obj;
        if (horasEstudo != other.horasEstudo)
            return false;
        if (periodo != other.periodo)
            return false;
        if (disciplina == null) {
            if (other.disciplina != null)
                return false;
        } else if (!disciplina.equals(other.disciplina))
            return false;
        if (necessidadesEspeciais != other.necessidadesEspeciais)
            return false;
        return true;
    }
    
}
