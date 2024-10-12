package Entite ;

public class Employe () {

    private int identifient ; 
    private String address ; 
    private String Nom ;
    protected int nbr_heures ; 

    public Employe (int id , String nom , String adresse , int nbr_heures)
    {
        this.id = id 
        this.nom = nom ; 
        this.adresse = adresse ; 
        this.nbr_heures = nbr_heures ; 

    }

    @Override
    public String toString (){
        return "ID employee : " + id + "son adresse " + address + "nbr_heures" + nbr_heures ;
    }
}