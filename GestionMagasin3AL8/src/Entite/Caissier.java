package Entite ;

public class Caissier extends Employe {
    private int numeroDeCaisse;

    public Caissier(int id, String nom, String adresse, int nbr_heures_par_mois, int numeroDeCaisse) {
        super(id, nom, adresse, nbr_heures_par_mois);
        this.numeroDeCaisse = numeroDeCaisse;
    }

    @Override
    public double calculerSalaire() {
        double salaire = nbr_heures_par_mois * 5;  // 5DT/H
        if (nbr_heures_par_mois > 180) {
            int heuresSup = nbr_heures_par_mois - 180;
            salaire += heuresSup * 5 * 0.15;  // 15% more for extra hours
        }
        return salaire;
    }

    @Override
    public String toString() {
        return super.toString() + ", Numéro de caisse: " + numeroDeCaisse;
    }
}
