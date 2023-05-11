import java.util.*;
import java.util.ArrayList;
//import java.util.Collection;
import java.util.Collections;
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
        
        //toString
        System.out.println(notas.toString()); //printa a lista 

        //indexOf
        //devolve a posição do objeto no indice 
        System.out.println("Exiba a posição da nota 5.5 " + notas.indexOf(5.5));

        //Set
        System.out.println("Substitua a nota 7.0 por 10.0");
        notas.set(1, 10.0); //subtitui um elemento do index tendo como paramentro seu indice
        System.out.println(notas);

        //contains
        //boolen que retorna se um elemento está presente no index atravez de seu nome
        System.out.println("Confira se a nota 5.5 está na lista: " + notas.contains(5.5));

        //get
        //procura por um elemento atraves de sua posição no indice 
        System.out.println("Exiba a terceira nota adicionada: " + notas.get(3));
        System.out.println(notas.toString());

        //collections min e max
        //usa o comparable para mostrar o menor e maior elemento da lista 
        System.out.println("Exiba a menor nota: " + Collections.min(notas));
        System.out.println("Exiba a menor nota: " + Collections.max(notas));

        //iterator
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0; //variavel double inicia em 0 
        while(iterator.hasNext()) { //enquanto existir um prox elemento na lista 
            Double next = iterator.next(); //o double recebe o valor do prox elemento
            soma += next; //e realiza a soma
        }
        System.out.println("Exiba a soma das notas: " + soma);

        //size
        //retorna um numero inteiro de acordo com o numero de elementos presentes na lista 
        System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        //remove 
        //remove um elemento da lista a partir de sua posição ou nome
        System.out.println("Remova a nota 5.5");
        notas.remove(5.5);
        System.out.println(notas);

        //iterator remove 
        //remove um ou mais itens de acordo com a iteração 
        System.out.println("Remova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator2 = notas.iterator();
        while(iterator2.hasNext()) { //enquanto existir um prox elemento
            Double next = iterator2.next(); //o valor de iterator2 vai para double 
            if( next < 7) iterator2.remove(); //e se algum valor for menor que 7,ele é retirado 
        }
        System.out.println(notas);

        //isEmpty
        //verifica se a lista esta vazia retornando boolean
        System.out.println("Confira se a lista está vazia: " + notas.isEmpty());

    }
}