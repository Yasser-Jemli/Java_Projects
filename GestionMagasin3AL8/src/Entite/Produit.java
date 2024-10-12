package Entite;

import java.util.Date;
public class Produit {

   private int identifiant;
    private String marque,libelle;
  private   Date dateexp;
  private double prix;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Date getDateexp() {
        return dateexp;
    }

    public void setDateexp(Date dateexp) {
        this.dateexp = dateexp;
    }

    public void setPrix(double prix)
  {
      if(prix>0)
          this.prix=prix;
      else System.out.println("le prix doit etre positf");

  }
  public double getPrix(){
      return prix;
  }
    public Produit(){}
  public Produit(int identifiant,String m,String l)
  {
     this.identifiant=identifiant;
     marque=m;
     this.libelle=l;
  }
    public Produit(String l,String m,int id)
    {
        identifiant=id;
        marque=m;
        libelle=l;
    }
    public Produit(int id,String m,String l,double prix)
    {
        this.identifiant=id;
        this.marque=m;
        this.libelle=l;
        this.prix=prix;
    }
    public Produit(int id,String m,String l,double prix,Date d)
    {
        this.identifiant=id;
        this.marque=m;
        this.libelle=l;
        this.prix=prix;
        this.dateexp=d;
    }

    public  void afficher()
    {
        System.out.println("L'identifant :"+this.identifiant);
        System.out.println("La marque :"+marque);
        System.out.println("Le libelle :"+libelle);
        System.out.println("Le prix :"+prix);
        System.out.println("La date :"+dateexp);
    }
    public String toString()
    {
        return "identifiant :"+identifiant+" marque :"
                +marque+" Libelle : "+libelle+ " Prix :"+prix+" Date exp :"+dateexp;
    }

    public boolean comparer(Produit p)
    {
        if(this.identifiant==p.identifiant && this.marque==p.marque&& libelle==p.libelle)
            return true;
        return false;

    }
    public static boolean comparer(Produit p1,Produit p2)
    {
        if(p1.identifiant==p2.identifiant&& p1.marque==p2.marque&&p1.libelle==p2.libelle)
            return true;
        return false;
    }

}
