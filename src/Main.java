import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // 1. afiseaza la consola "Welcome to Hangman! "
        // 2. afiseaza la consola "Cuvantul este: * * * * * "
        // 3. cere o litera de la user "Introdu o litera"
        // 4. citeste de la user litera si salveaza intr-o variabila
        // 5. parcurgem cuvantul (adica folosim un for) si comparam fiecare litera din cuvant cu litera salvata
        // 6. daca exista litera, inlocuim * de la pozitia literei din cuvant in sirul de stelute

        System.out.println("Welcome to Hangman!");
        System.out.print("Cuvantul este ");
        String hiddenWord = "avion";
        char[] stars = new char[hiddenWord.length()];
//        for (int i = 0; i < stars.length ; i++) {
//            stars[i]='*';
//        }
        Arrays.fill(stars,'*');

        System.out.println(String.valueOf(stars));



    }
}