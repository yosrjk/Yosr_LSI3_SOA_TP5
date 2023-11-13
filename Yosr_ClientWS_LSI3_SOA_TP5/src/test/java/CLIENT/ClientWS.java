package CLIENT;
import jakarta.xml.ws.WebServiceRef;
import service.BanqueService;
import service.BanqueServiceService;

public class ClientWS {

    // Référence au service web générée automatiquement à partir du WSDL
    @WebServiceRef(wsdlLocation = "http://localhost:8084/banqueService?wsdl")
    private static BanqueServiceService banqueServiceService;

    public static void main(String[] args) {
        // Obtenir le port du service web à partir de la référence
        BanqueService banqueServicePort = banqueServiceService.getBanqueServicePort();

        // Appeler la méthode de conversion
        double montantConverti = banqueServicePort.conversion(100);
        System.out.println("Montant converti : " + montantConverti);

        // Appeler la méthode pour obtenir la liste des comptes
        banqueServicePort.getComptes().forEach(compte -> {
            System.out.println("Code du compte : " + compte.getCode());
            System.out.println("Date de création : " + compte.getDateCreation());
            System.out.println("Solde du compte : " + compte.getSolde());
        });
    }
}

