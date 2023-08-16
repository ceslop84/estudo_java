import com.cartotech.Estudo;
import com.cartotech.Vetor;
import com.cartotech.Matriz;
import com.cartotech.Leitor;
import com.cartotech.Cidadao;
import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

class App {

    public static void main(String[] args){


        List<Integer> listaTeste = new ArrayList<Integer>();
        listaTeste.add(50);
        listaTeste.add(50);
        listaTeste.add(50);
        listaTeste.add(50);
        listaTeste.add(50);
        for (Integer valor: listaTeste){
            System.err.println(valor);
        }

        Cidadao cesar = new Cidadao(LocalDate.of(1984, 07, 12));
        System.err.println(cesar.tipoEleitor());

        boolean teste  = false;
        if (teste && true)
            System.err.println("aha");
        
        Leitor leitor = new Leitor();
        leitor.letTexto("Digite seu nome:");

        Estudo estudo1 = new Estudo();
        estudo1.setDisciplina(leitor.letTexto("Disciplina:"));
        estudo1.setHorasEstudo(leitor.lerInteiro("Qtde de horas:"));
        estudo1.setDisciplina(leitor.letTexto("Disciplina:"));

        Estudo estudo = new Estudo(4, 'm', "Python", false);
        estudo.setDisciplina("Java");
        System.out.println(estudo);

        String teste1 = "Cesar Rafael Lopes       ";
        String teste2 = new String("cESAR rAFAEL lOPES");

        String teste1Low = teste1.toLowerCase();
        String teste1Up = teste1.toUpperCase();
        String teste1Trim = teste1.trim();

        String teste10 = teste1.split(" ")[0];

        if (teste1 == teste2){
            System.err.println("Iguais na memória...");
        }

        if (teste1.equals(teste2)){
            System.err.println("Iguais em valores...");
        }

        Vetor vetor = new Vetor(new double[]{10,20,30});
        System.out.println(vetor);

        Matriz matriz = new Matriz(new double[][]{{1,2},{3,4}});
        matriz.atualizar(0, 0, 10);
        System.err.println(matriz);

        for (int i=0; i<matriz.matriz.length; i++){
            for (int j=0; j<matriz.matriz[0].length; j++){
                System.err.print(" " + i + " - " + j + " > ");
                System.err.printf("%5.1f", matriz.matriz[i][j]);
            }
            System.err.println("");
        }
        
    }
    
}
