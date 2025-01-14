package net.lecnam.ussi47.revisions.exo1;

import java.util.List;

public class Emprunteur extends Medias{
    String Nom;
    String Prenom;
    List<Medias> Mediasempr;

    public Emprunteur(String Titre, String Auteur, String Nom, String Prenom) {
        super(Titre, Auteur);
        this.Nom = Nom;
        this.Prenom = Prenom;
    }

    public String getNom() {
        return Nom;
    }

    public String getPrenom() {
        return Prenom;
    }

    public List<Medias> getMediasempr() {
        return Mediasempr;
    }
}
