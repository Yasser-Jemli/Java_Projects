import java.util.HashMap;
import java.util.Map;

public class SocieteHashMap implements InterfaceSociete {
    private Map<Employe, Departement> employeDepartementMap;

    public SocieteHashMap() {
        employeDepartementMap = new HashMap<>();
    }

    @Override
    public void ajouterEmployeDepartement(Employe e, Departement d) {
        employeDepartementMap.put(e, d);
    }

    @Override
    public void supprimerEmploye(Employe e) {
        employeDepartementMap.remove(e);
    }

    @Override
    public void afficherLesEmployesLeursDepartements() {
        for (Map.Entry<Employe, Departement> entry : employeDepartementMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    @Override
    public void afficherLesEmployes() {
        for (Employe employe : employeDepartementMap.keySet()) {
            System.out.println(employe);
        }
    }

    @Override
    public void afficherLesDepartements() {
        Map<Departement, Boolean> printed = new HashMap<>();
        for (Departement departement : employeDepartementMap.values()) {
            if (!printed.containsKey(departement)) {
                System.out.println(departement);
                printed.put(departement, true);
            }
        }
    }

    @Override
    public void afficherDepartement(Employe e) {
        Departement departement = employeDepartementMap.get(e);
        System.out.println(departement != null ? departement : "Employé non trouvé");
    }

    @Override
    public boolean rechercherEmploye(Employe e) {
        return employeDepartementMap.containsKey(e);
    }

    @Override
    public boolean rechercherDepartement(Departement d) {
        for (Departement departement : employeDepartementMap.values()) {
            if (departement.equals(d)) {
                return true;
            }
        }
        return false;
    }
}
