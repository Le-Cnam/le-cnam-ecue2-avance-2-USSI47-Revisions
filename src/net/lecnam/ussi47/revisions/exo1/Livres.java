package net.lecnam.ussi47.revisions.exo1;

import java.time.LocalDate;

public class Livres extends Medias {
    private int nombrePages;

    public Livres(String titre, String auteur, int nombrePages) {
        super(titre, auteur);
        this.nombrePages = nombrePages;
    }

    public int getNombrePages() {
        return nombrePages;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nombre de pages: " + nombrePages;
    }
}

