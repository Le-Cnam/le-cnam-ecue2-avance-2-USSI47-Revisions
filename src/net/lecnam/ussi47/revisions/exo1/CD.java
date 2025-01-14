package net.lecnam.ussi47.revisions.exo1;

import java.time.temporal.Temporal;

public class CD extends Medias{
    private int nbtitre;
    private int duree;

    public CD(String Titre, String Auteur, int nbtitre, int duree ) {
        super(Titre, Auteur);
        this.nbtitre = nbtitre;
        this.duree = duree;
    }

    public int getNbtitre() {
        return nbtitre;
    }

    public int getDuree() {
        return duree;
    }
}
