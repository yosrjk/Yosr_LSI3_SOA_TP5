package serveur;

import service.BanqueService;

import jakarta.xml.ws.Endpoint;

public class ServeurJWS {

    public static void main(String[] args) {
        // Spécifiez l'URL pour publier le service
        String url = "http://localhost:8084/banqueService";

        // Créez une instance de votre service web
        BanqueService banqueService = new BanqueService();

        // Publiez le service à l'URL spécifiée
        Endpoint.publish(url, banqueService);

        // Affichez un message indiquant que le service a été publié avec succès
        System.out.println("Service web publié à l'URL : " + url);
    }
}
