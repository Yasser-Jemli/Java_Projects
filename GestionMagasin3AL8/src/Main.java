import Entite.Magasin;
import Entite.Caissier;
import Entite.Vendeur;
import Entite.Responsable;

public class Main {
    public static void main(String[] args) {
        // Creating two magasins
        Magasin carrefour = new Magasin(1, "Carrefour", "Centre-Ville");
        Magasin monoprix = new Magasin(2, "Monoprix", "Menzah 6");

        // Creating employees for the first magasin
        Caissier caissier1 = new Caissier(1, "Alice", "Address 1", 180, 1);
        Caissier caissier2 = new Caissier(2, "Bob", "Address 2", 170, 2);
        Vendeur vendeur1 = new Vendeur(3, "Charlie", "Address 3", 160, 0.1);
        Responsable responsable1 = new Responsable(4, "Dave", "Address 4", 165, 100);

        // Add employees to magasin
        carrefour.addEmployee(caissier1);
        carrefour.addEmployee(caissier2);
        carrefour.addEmployee(vendeur1);
        carrefour.addEmployee(responsable1);

        // Repeat for the second magasin
        Caissier caissier3 = new Caissier(5, "Eve", "Address 5", 180, 3);
        Vendeur vendeur2 = new Vendeur(6, "Frank", "Address 6", 150, 0.15);
        Vendeur vendeur3 = new Vendeur(7, "Grace", "Address 7", 165, 0.2);
        Responsable responsable2 = new Responsable(8, "Hank", "Address 8", 170, 150);

        monoprix.addEmployee(caissier3);
        monoprix.addEmployee(vendeur2);
        monoprix.addEmployee(vendeur3);
        monoprix.addEmployee(responsable2);

        // Display the details (implement a method to print details)
        carrefour.displayDetails();
        monoprix.displayDetails();
    }
}
