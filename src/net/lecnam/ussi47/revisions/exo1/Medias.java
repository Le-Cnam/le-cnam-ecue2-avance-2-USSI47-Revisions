package net.lecnam.ussi47.revisions.exo1;
import java.time.LocalDate;

public abstract class Medias {
    private String titre;
    private String auteur;
    private LocalDate dateRetour;

    public Medias(String titre, String auteur) {
        this.titre = titre;
        this.auteur = auteur;

    }

    public String getTitre() {
        return titre;
    }

    public String getAuteur() {
        return auteur;
    }

    public LocalDate getDateRetour(LocalDate dateRetour) {
        return this.dateRetour;
    }

    @Override
    public String toString() {
        return "Titre: " + titre + ", Auteur: " + auteur ;
    }
}
