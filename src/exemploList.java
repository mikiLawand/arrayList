import java.util.ArrayList;
import java.util.List;

public class exemploList {
    public static void main(String[] args) {
        
        //TODO: crie uma lista e adicione seis notas de um aluno nela.

        List<Double> notas = new ArrayList<Double>();

        notas.add(8.5);
        notas.add(7.0);
        notas.add(5.5);
        notas.add(9.5);
        notas.add(10.0);
        notas.add(8.5);
        
        System.out.println(notas.toString()); //printa a lista 

        //devolve a posição do objeto no indice 
        System.out.println("Exiba a posição da nota 5.5 " + notas.indexOf(5.5));

        System.out.println("Substitua a nota 7.0 por 10.0");
        notas.set(1, 10.0); //subtitui um elemento do index tendo como paramentro seu indice
        System.out.println(notas);

        System.out.println("Confira se a nota 5.5 está na lista: " + notas.contains(5.5));
    }
}