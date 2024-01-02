package outros.listas;

import java.util.ArrayList;
import java.util.List;

public class Listas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("João Barroso");
        lista.add("David Maia");
        lista.add("Júlio Silva");
        lista.add("Ana Esther");
        lista.add("Maria Júlia");
        lista.add("Edilson Freire");
        lista.add(2, "Severina Marques");


        for(String string : lista){
            System.out.println(string);
        }

        //Predicate
        lista.removeIf(string -> string.charAt(0) == 'M');


        lista.remove("Júlio Silva");
        System.out.println("====================================================");

        for(String string : lista){
            System.out.println(string);
        }




    }
}
