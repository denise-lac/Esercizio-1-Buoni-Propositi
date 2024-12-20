/*Scrivere un programma per gestire i “Buoni propositi per l'anno prossimo”.

Il programma all’avvio visualizza 5 “buoni propositi” (es: “fare più attività fisica”,
“esercitarsi su Java”, ecc.).
Si chiede all’utente di indicare quale dei propositi visualizzati è stato conseguito, e 
viene riproposto l’elenco solo con quelli non ancora conseguiti.
Si continua a chiedere all’utente fino a quando tutti i propositi saranno conseguiti. */

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc= new Scanner(System.in);
        //inizializzo i buoni propositi
        ArrayList<String> propositi= new ArrayList<>();
        propositi.add("Tenersi in forma");
        propositi.add("Esercitarsi su Java");
        propositi.add("Viaggiare");
        propositi.add("Praticare l'inglese");
        propositi.add("Imparare una nuova cosa");

        //stampo a video i buoni propositi utilizzando un ciclo for-each
        System.out.println("Ecco i tuoi buoni propositi: ");
        for (String p : propositi) {
            System.out.println("    - "+p);
        }

        //chiedo all'utente se ha realizzato i buoni propositi
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\nHai realizzato almeno uno dei buoni propositi elencati?   true    o   false");
        boolean scelta= sc.nextBoolean();

        //condizione dettata in base la scelta dell'utente
        if (scelta) {
            int i=0; //variabile che serve per numerare l'elenco
            System.out.println("\n\nQuali dei propositi hai realizzato?");
            System.out.println("\nDigita il numero corrispondente al buon proposito per eliminarlo dalla lista:");
            //stampo l'elenco numerato
            for (String p : propositi) {
                System.out.println("    "+i+" "+p);
                i++;
            }
            //l'utente sceglie cosa eliminare dalla lista
        }
        else {
            System.out.println("Ti auguro di realizzare i buoni propositi elencati, riutilizza il programma quando ne avrai eseguito almeno uno.");
        }
        sc.close();
    }
}
