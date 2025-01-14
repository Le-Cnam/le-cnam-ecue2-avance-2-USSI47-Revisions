package net.lecnam.ussi47.revisions.exo1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class Emprunteur {
    private String nom;
    private String prenom;
    private List<Medias> mediasEmpruntes;

    public Emprunteur(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.mediasEmpruntes = new ArrayList<>();
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Medias> getMediasEmpruntes() {
        return mediasEmpruntes;
    }

    // Méthode pour emprunter un média
    public void emprunter(Medias media, LocalDate dateRetour) {
        media.getDateRetour(dateRetour);  // Définir la date de retour du média
        mediasEmpruntes.add(media);  // Ajouter le média à la liste des médias empruntés
    }

    // Affichage des médias empruntés avec leurs détails
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Emprunteur: " + nom + " " + prenom + "\nMédias empruntés:\n");
        for (Medias media : mediasEmpruntes) {
            sb.append(media).append("\n");
        }
        return sb.toString();
    }
}

