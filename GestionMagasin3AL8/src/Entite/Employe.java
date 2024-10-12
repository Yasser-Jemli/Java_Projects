package Entite ;

public abstract class Employe {
    protected int id;
    protected String nom;
    protected String adresse;
    protected int nbr_heures_par_mois;

    public Employe(int id, String nom, String adresse, int nbr_heures_par_mois) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
        this.nbr_heures_par_mois = nbr_heures_par_mois;
    }

    public abstract double calculerSalaire();

    @Override
    public String toString() {
        return "ID: " + id + ", Nom: " + nom + ", Adresse: " + adresse + ", Heures: " + nbr_heures_par_mois;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Employe)) return false;
        Employe e = (Employe) obj;
        return id == e.id && nom.equals(e.nom) && adresse.equals(e.adresse) && nbr_heures_par_mois == e.nbr_heures_par_mois;
    }
}
