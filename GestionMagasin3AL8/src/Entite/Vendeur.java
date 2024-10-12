package Entite ;

public class Vendeur extends Employe {
    private double tauxDeVente;

    public Vendeur(int id, String nom, String adresse, int nbr_heures_par_mois, double tauxDeVente) {
        super(id, nom, adresse, nbr_heures_par_mois);
        this.tauxDeVente = tauxDeVente;
    }

    @Override
    public double calculerSalaire() {
        return 450 * tauxDeVente;  // Fixed salary (450 DT) multiplied by sales rate (in %)
    }

    @Override
    public String toString() {
        return super.toString() + ", Taux de vente: " + tauxDeVente;
    }
}
