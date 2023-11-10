package metier;

// Définition de la classe Compte dans le package metier
public class Compte {
    // Variables membres privées pour stocker les informations du compte
    private long code;
    private String dateCreation;
    private double solde;

    // Constructeur par défaut
    public Compte() {
        super(); // Appelle le constructeur de la classe parente (Object, implicitement)
    }

    // Constructeur avec paramètres pour initialiser les variables membres
    public Compte(long code, String dateCreation, double solde) {
        this.code = code;
        this.dateCreation = dateCreation;
        this.solde = solde;
    }

    // Méthode getter pour récupérer la valeur de la variable code
    public long getCode() {
        return code;
    }

    // Méthode getter pour récupérer la valeur de la variable dateCreation
    public String getDateCreation() {
        return dateCreation;
    }

    // Méthode getter pour récupérer la valeur de la variable solde
    public double getSolde() {
        return solde;
    }

    // Méthode setter pour modifier la valeur de la variable code
    public void setCode(long code) {
        this.code = code;
    }

    // Méthode setter pour modifier la valeur de la variable dateCreation
    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    // Méthode setter pour modifier la valeur de la variable solde
    public void setSolde(double solde) {
        this.solde = solde;
    }
}
