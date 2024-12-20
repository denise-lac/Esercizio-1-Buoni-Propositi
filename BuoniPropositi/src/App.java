/*Scrivere un programma per gestire i “Buoni propositi per l'anno prossimo”.

Il programma all’avvio visualizza 5 “buoni propositi” (es: “fare più attività fisica”,
“esercitarsi su Java”, ecc.).
Si chiede all’utente di indicare quale dei propositi visualizzati è stato conseguito, e 
viene riproposto l’elenco solo con quelli non ancora conseguiti.
Si continua a chiedere all’utente fino a quando tutti i propositi saranno conseguiti. */

public class App {
    public static void main(String[] args) throws Exception {
        //inizializzo i buoni propositi
        String[] propositi={"Tenersi in forma", "Esercitarsi su Java", "Imparare qualcosa di nuovo","Viaggiare", "Praticare ingelese"};

        //stampo a video i buoni propositi utilizzando un ciclo for-each
        System.out.println("Ecco i tuoi buoni propositi: ");
        for (String p : propositi) {
            System.out.println("    -"+p);
        }
    }
}
