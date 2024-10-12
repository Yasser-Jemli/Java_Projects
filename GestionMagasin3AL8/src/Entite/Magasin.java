package Entite;


public class Magasin {

    private int identifiant;
    private String adresse;

    private final int CAPACITE = 50;

    private Produit[] tabpro = new Produit[CAPACITE];

    private int compprod;

    private static int totalProd;

    public int getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(int identifiant) {
        this.identifiant = identifiant;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }


    public Magasin(int id, String ad) {
        identifiant = id;
        adresse = ad;
    }

    public void ajouter(Produit p) {

        if (compprod < CAPACITE) {
            if (!chercher(p)) {
                tabpro[compprod] = p;
                compprod++;
                totalProd++;
                System.out.println(compprod);
            } else {
                System.out.println("Le produit existe déjà");
            }
        } else {

            System.out.println("le magasin est plein");
        }
    }

    public static int getTotalProd() {
        return totalProd;
    }

    //afficher les produit
    public void afficher() {
        System.out.println("les produits du magasins");
        for (int i = 0; i < compprod; i++)
            tabpro[i].afficher();
    }

    public String toString() {

        String str = "L'ensemble des produits :\n";

        for (int i = 0; i < compprod; i++)
            str += tabpro[i] + "\n";

        return "L'identifiant :" + identifiant + " adresse :" + adresse + str;
    }

    public boolean chercher(Produit p) {
        for (int i = 0; i < compprod; i++) {
            //if(p.comparer(tabpro[i]))
            if (Produit.comparer(p, tabpro[i]))
                return true;
        }
        return false;
    }

    public Magasin plusProduit(Magasin m)
    {

        if(this.compprod<m.compprod) {
            return m;
        } else if (this.compprod>m.compprod) {
            return this;
        }
        else
        return null;
    }

    public static Magasin plusPrduit(Magasin m1,Magasin m2)
    {
        if(m1.compprod<m2.compprod)
            return m2;
        else if (m1.compprod>m2.compprod) {

            return m1;
        }
        else return null;
    }
    public boolean supprimer(Produit p)
    {
        
    }
}
