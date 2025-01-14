package net.lecnam.ussi47.revisions.exo1;

import java.time.LocalDate;

import java.util.List;

public class Medias {
    private String Titre;
    private String Auteur;
    private LocalDate retour;


    public Medias(String Titre, String Auteur) {
        this.Titre = Titre;
        this.Auteur = Auteur;
    }

    public String getTitre() {
        return Titre;
    }

    public String getAuteur() {
        return Auteur;
    }

    public LocalDate getRetour() {
        return retour;
    }

    @Override
    public String toString() {
        return "Medias{" +
                "Titre='" + Titre + '\'' +
                ", Auteur='" + Auteur + '\'' +
                ", retour=" + retour +
                '}';
    }
}
