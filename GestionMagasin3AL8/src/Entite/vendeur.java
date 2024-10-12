package Entite ; 

public class vendeur extends Employe{
    private float taux_de_vente ;

    public vendeur (int id , String nom , String adresse , int nbr_heures , float taux_du_vente)
    {
        super(id , nom , adresse , nbr_heures);
        this.taux_du_vente = taux_du_vente ;
    }

}