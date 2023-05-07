import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // 1. afiseaza la consola "Welcome to Hangman! "
        // 2. afiseaza la consola "Cuvantul este: * * * * * "
        // 3. cere o litera de la user "Introdu o litera"
        // 4. citeste de la user litera si salveaza intr-o variabila
        // 5. parcurgem cuvantul (adica folosim un for) si comparam fiecare litera din cuvant cu litera salvata
        // 6. daca exista litera, inlocuim * de la pozitia literei din cuvant in sirul de stelute
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();
        ArrayList<String> word = new ArrayList<>(Arrays.asList("perfume", "transport", "manager", "woman", "proportion", "prestige", "vegetable", "environment", "obligation", "example", "liability"));
        int index = rnd.nextInt(word.size());
        System.out.println("Welcome to Hangman!");
        System.out.print("Cuvantul este ");
        String hiddenWord = word.get(index);
        char[] stars = new char[hiddenWord.length()];
//        for (int i = 0; i < stars.length ; i++) {
//            stars[i]='*';
//        }
        Arrays.fill(stars, '*');

        System.out.println(String.valueOf(stars));
        while (true) {
            System.out.println("Introdu o litera: ");
            char letter = sc.next().charAt(0);
            for (int i = 0; i < hiddenWord.length(); i++) {
                if (hiddenWord.charAt(i) == letter) {
                    stars[i] = letter;
                }


            }
            System.out.println(String.valueOf(stars));

            if (hiddenWord.equals(String.valueOf(stars))) {
                System.out.println("Felicitari!");
                break;
            }

        }


    }
}