import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        // inizializzo i buoni propositi
        ArrayList<String> propositi = new ArrayList<>();
        propositi.add("Tenersi in forma");
        propositi.add("Esercitarsi su Java");
        propositi.add("Viaggiare");
        propositi.add("Praticare l'inglese");
        propositi.add("Imparare una nuova cosa");

        // stampo a video i buoni propositi utilizzando un ciclo for-each
        System.out.println("Ecco i tuoi buoni propositi: ");
        for (String p : propositi) {
            System.out.println("    - " + p);
        }

        // chiedo all'utente se ha realizzato i buoni propositi
        System.out.println("---------------------------------------------------------------------");
        System.out.println("\nHai realizzato almeno uno dei buoni propositi elencati?   true    o   false");
        boolean scelta = sc.nextBoolean();

        // condizione dettata in base la scelta dell'utente

        if (scelta) { // stampo in caso di true

            // chiedo all'utente di eliminare gli elementi che vuole dalla lista
            boolean continua = true; // inizializzo una variabile per far scegliere se continuare a rimuovere
                                     // elementi
            while (continua) {
                int i = 0; // variabile che serve per numerare l'elenco
                System.out.println("\nQuali dei propositi hai realizzato?");

                // stampo la lista numerata
                for (String p : propositi) {
                    System.out.println("    " + i + " " + p);
                    i++;
                }

                // l'utente sceglie cosa eliminare dalla lista
                System.out.print("\nDigita il numero corrispondente al buon proposito per eliminarlo dalla lista:   ");
                int eliminazione = sc.nextInt();
                propositi.remove(eliminazione);

                // chiedo all'utente se ha altri elementi da eliminare soltanto se la lista
                // non è vuota
                if (propositi.isEmpty()) {
                    System.out.println("---------------------------------------------------------------------");
                    System.out.println("\nComplimenti! Hai portato a termine tutti i tuoi buoni propositi!");
                    continua = false;
                } else {
                    System.out.println("\nHai altri elementi da eliminare?    true    o   false");
                    continua = sc.nextBoolean();
                }
            }

            //creo una condizione che varia l'ultima stampa del programma
            if (propositi.isEmpty()) {  //se l'array è vuoto

                System.out.println("Grazie per aver utilizzato il programma!\n\n");

            } else {    //se ci sono ancora elementi nella lista

                System.out.println("---------------------------------------------------------------------");
                System.out.println("\nEcco la tua lista di buoni propositi aggiornata:");
                System.out.println("\nEcco i tuoi buoni propositi: ");
                for (String p : propositi) {
                    System.out.println("    - " + p);
                }
                System.out.println(" ");

            }

        } else { // stampo in caso di false
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Ti auguro di realizzare i buoni propositi elencati!");
            System.out.println("Riutilizza il programma quando ne avrai eseguito almeno uno.\n\n");
        }

        sc.close();
    }
}
