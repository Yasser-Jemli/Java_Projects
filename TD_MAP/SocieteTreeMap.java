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
        employeDepartementMap.forEach((employe, departement) -> 
            System.out.println(employe + " => " + departement));
    }

    @Override
    public void afficherLesEmployes() {
        employeDepartementMap.keySet().forEach(System.out::println);
    }

    @Override
    public void afficherLesDepartements() {
        employeDepartementMap.values().stream().distinct().forEach(System.out::println);
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
        return employeDepartementMap.containsValue(d);
    }
}
