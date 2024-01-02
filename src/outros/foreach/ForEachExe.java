package outros.foreach;

import java.util.Locale;

public class ForEachExe {
    public static void main(String[] args) {
    String[] vector = new String[]{"Marcos", "Maria", "Mariana", "Severino"};

    for(int i = 0; i < vector.length ; i++){
        System.out.println(vector[i].toUpperCase(Locale.ROOT));
    }
        System.out.println("=======================================");

        for (String vetor : vector) {
            System.out.println(vetor.toUpperCase(Locale.ROOT));

        }








    }








    }


