package net.lecnam.ussi47.revisions.exo1;

import java.util.Date;

public class Livre extends Medias {
    private int nbpages;

    public Livre(String Titre, String Auteur,int nbpages) {
        super(Titre, Auteur);
        this.nbpages = nbpages;
    }

    public int getNbpages() {
        return nbpages;
    }

    @Override
    public String toString() {
        return "Livre{" + "Titre=" + getTitre() + " Auteur=" + getAuteur() +
                " nbpages=" + nbpages +
                '}';
    }
}
