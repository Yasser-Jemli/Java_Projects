import java.util.Map;
import java.util.TreeMap;

public class SocieteTreeMap implements InterfaceSociete {
    private Map<Employe, Departement> employeDepartementMap;

    public SocieteTreeMap() {
        employeDepartementMap = new TreeMap<>((e1, e2) -> e1.getCin().compareTo(e2.getCin()));
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
        Map<Departement, Boolean> printed = new TreeMap<>((d1, d2) -> d1.getId() - d2.getId());
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
