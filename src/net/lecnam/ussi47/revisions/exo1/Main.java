import net.lecnam.ussi47.revisions.exo1.CD;
import net.lecnam.ussi47.revisions.exo1.Emprunteur;
import net.lecnam.ussi47.revisions.exo1.Livre;

public class Main {

    public static void main(String[] args) {

        Livre livre = new Livre("Le petit Prince", "A. St Exupery", 150);
        CD cd = new CD("Izia", "Izia",  12, 2432);


        System.out.println(livre.toString());
        //Emprunteur e = new Emprunteur("Arya", "Stark");

        // Ajouter le livre avec une date de retour le 20/12/2018
        // Ajouter le CD avec une date de retour le 20/12/2018

        // voir les médias empruntés

    }
}
