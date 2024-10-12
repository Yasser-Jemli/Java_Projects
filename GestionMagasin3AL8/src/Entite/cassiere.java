package Entite ; 

public class cassiere extends Employe{
    private int Numero_du_caisee ;

    public cassiere (int id , String nom , String adresse , int nbr_heures , int Numero_du_caisee)
    {
        super(id , nom , adresse , nbr_heures);
        this.Numero_du_caisee = Numero_du_caisee ;
    }

}