import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class meusLivrosFavoritos {
    public static void main(String[] args) {
       List<Livros> meusLivros = new ArrayList<>(){{
        add(new Livros("Os Tres Mosqueteiros", "Alexandre Dumas", "Classicos", 483));
        add(new Livros("Amanhecer", "Stephanie Mayer", "Fantasia Adolescente", 748));
        add(new Livros("Emma", "Jane Austen", "Classicos", 686));
       }};
       
       System.out.println("Imprima a lista pela ordem de inserção: ");
       System.out.println(meusLivros);

       System.out.println("Imprima a lista em ordem aleatoria: ");
       Collections.shuffle(meusLivros); //bagunça a ordem dos elementos da lista 
       System.out.println(meusLivros);

       System.out.println("Imprima a lista em ordem natural");
       Collections.sort(meusLivros); //
       System.out.println(meusLivros);

       System.out.println("Imprima a lista pela ordem de numero de paginas: ");
       meusLivros.sort(new ComparatornumPaginas()); //compara pelo numero de paginas 
       System.out.println(meusLivros);

       System.out.println("Imprima a lista por ordem de categoria: ");
       meusLivros.sort(new ComparatorCategoria()); //compara pela categoria 
       System.out.println(meusLivros);

       System.out.println("Imprima a lista por ordem de autores: ");
       meusLivros.sort(new ComparatorAutor()); //compara pelo nome do autor
       System.out.println(meusLivros);
    }

}

class Livros implements Comparable<Livros>{
    private String titulo;
    private String autor;
    private String categoria;
    private Integer numPaginas;
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Livros(String titulo, String autor, String categoria, Integer numPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.numPaginas = numPaginas;
    } 

    @Override
    public String toString() {
        return "{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", categoria='" + categoria + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    @Override
    public int compareTo(Livros livros) { //faz a comparação entre os titulos dos livros 
        return this.getTitulo().compareToIgnoreCase(livros.getTitulo());
        /* retorna 0,se os nomes forem iguais
         * 1 se o nome for maior que outro 
         * -1 se os nome for menor que o outro
         */  
    }       
    }

   
    class ComparatornumPaginas implements Comparator<Livros> { //classe que faz a comparação de num paginas 

        @Override
        public int compare(Livros o1, Livros o2) {
            return Integer.compare(o1.getNumPaginas(), o2.getNumPaginas());
        }
        
    }

    class ComparatorCategoria implements Comparator<Livros> { //classe que faz a comparação de categoria

        @Override
        public int compare(Livros o1, Livros o2) {
            return o1.getCategoria().compareToIgnoreCase(o2.getCategoria());
        }
    }

    class ComparatorAutor implements Comparator<Livros> { //classe que faz a comparação por autor 

        @Override
        public int compare(Livros o1, Livros o2) {
            return o1.getAutor().compareToIgnoreCase(o2.getAutor());
        }
    }


    







    



