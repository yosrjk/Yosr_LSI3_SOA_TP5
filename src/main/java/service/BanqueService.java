package service;
import java.util.List;
import java.util.ArrayList;
import metier.Compte;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
// Définition de la classe BanqueService comme un service web
@WebService
public class BanqueService {
    // Méthode web pour effectuer une conversion
    @WebMethod
    public double conversion(@WebParam(name = "montant") double montant) {
        // Cette méthode prend un montant en entrée et retourne le montant converti (multiplié par 3 dans cet exemple)
        return montant * 3;
    }
    // Méthode pour récupérer une liste de comptes
    public List<Compte> getComptes() {
        // Supposons que vous ayez une liste prédéfinie de comptes
        List<Compte> comptes = new ArrayList<>();
        // Ajoutez quelques comptes à la liste (c'est juste un exemple)
        comptes.add(new Compte(001, "01-09-2023", 1500));
        comptes.add(new Compte(001, "01-10-2023", 2000));
        comptes.add(new Compte(001, "03-01-2023", 1050));
        // Retourne la liste de comptes
        return comptes;
    }
}
