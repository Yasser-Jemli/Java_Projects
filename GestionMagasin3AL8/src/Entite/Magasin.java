package Entite;

public class Magasin {
    private static final int MAX_EMPLOYES = 20;
    private Employe[] employes;
    private int employeCount;

    public Magasin(int id, String nom, String adresse) {
        // Initialize your fields here
        this.employes = new Employe[MAX_EMPLOYES];  // Maximum 20 employees
        this.employeCount = 0;
    }

    public void addEmployee(Employe e) { // Accepts any Employe type
        if (employeCount < MAX_EMPLOYES) {
            employes[employeCount++] = e;
        } else {
            System.out.println("Maximum number of employees reached.");
        }
    }

    public void displayDetails() {
        // Implement your logic to display details of the magasin
        System.out.println("Details of the magasin:");
        // Loop through employes to display their details
        for (int i = 0; i < employeCount; i++) {
            System.out.println(employes[i]); // Make sure Employe class has a proper toString()
        }
    }
}
