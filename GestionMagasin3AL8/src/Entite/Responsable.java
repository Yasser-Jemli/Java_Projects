package Entite ;

public class Responsable extends Employe {
    private double prime;

    public Responsable(int id, String nom, String adresse, int nbr_heures_par_mois, double prime) {
        super(id, nom, adresse, nbr_heures_par_mois);
        this.prime = prime;
    }

    public double getPrime() {
        return prime;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbr_heures_par_mois * 10;  // 10DT/H
        if (nbr_heures_par_mois > 160) {
            int heuresSup = nbr_heures_par_mois - 160;
            salaire += heuresSup * 10 * 0.20;  // 20% more for extra hours
        }
        return salaire + prime;  // Add prime to the salary
    }

    @Override
    public String toString() {
        return super.toString() + ", Prime: " + prime;
    }
}
