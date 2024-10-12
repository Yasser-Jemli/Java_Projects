package Entite ; 

public class responsable extends Employe{
    private double prime ;

    public vendeur (int id , String nom , String adresse , int nbr_heures , float taux_du_vente)
    {
        super(id , nom , adresse , nbr_heures);
        this.prime = prime ;
    }

}