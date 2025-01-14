package net.lecnam.ussi47.revisions.exo1;

import java.time.LocalDate;


public class CD extends Medias {
        private int nombreTitres;
        private int duree;

        public CD(String titre, String auteur, int nombreTitres, int duree) {
            super(titre, auteur);
            this.nombreTitres = nombreTitres;
            this.duree = duree;
        }

        public int getNombreTitres() {
            return nombreTitres;
        }

        public int getDuree() {
            return duree;
        }

        @Override
        public String toString() {
            return super.toString() + ", Nombre de titres: " + nombreTitres + ", la durée est :" + duree;
        }
    }

