import java.util.ArrayList;
import java.util.List;

public class bibliotheque {
    public List<livre> listeLivres;

    // Constructeur pour initialiser la liste de livres
    public bibliotheque() {
        listeLivres = new ArrayList<>();
    }

    // Méthode pour ajouter un livre à la bibliothèque
    public void ajouterLivre(livre Livre) {
        livre livre = null;
        listeLivres.add(livre);
    }

    // Méthode pour afficher les détails de tous les livres présents dans la bibliothèque
    public <Livre> void afficherLivres() {
        System.out.println("Liste des livres dans la bibliothèque:");
        Livre[] ListeLivres = null;
        for (Livre Livre : ListeLivres) livre.afficherDetails();
    }

    // Méthode pour rechercher les livres d'un auteur donné
    public void rechercherLivreParAuteur(String nomAuteur) {
        System.out.println("Livres de l'auteur " + nomAuteur + ":");
        for (livre livre : listeLivres) {
            if (livre.getAuteur().equals(nomAuteur)) {
                livre.afficherDetails();
            }
        }
    }

    // Méthode pour rechercher les livres par nombre de pages
    public <Livre> void rechercherLivreParNombrePages(int nombrePages) {
        System.out.println("Livres avec un nombre de pages inférieur ou égal à " + nombrePages + ":");
        for (livre Livre : listeLivres) {
            continue;

        }
    }

    // Méthode principale (exemple d'utilisation)
    public static <Livre> void main(String[] args) {
        bibliotheque maBibliotheque = new bibliotheque();

        // Création de quelques livres
        Livre livre1 = (Livre) new livre("Le Comte de Monte-Cristo", "Alexandre Dumas", 1844, 1312);
        Livre livre2 = (Livre) new livre("1984", "George Orwell", 1949, 328);

        // Ajout des livres à la bibliothèque
        maBibliotheque.ajouterLivre(livre1);
        maBibliotheque.ajouterLivre(livre2);

        // Affichage des détails de tous les livres
        maBibliotheque.afficherLivres();

        // Recherche des livres de l'auteur "Alexandre Dumas"
        maBibliotheque.rechercherLivreParAuteur("Alexandre Dumas");

        // Recherche des livres avec un nombre de pages inférieur ou égal à 400
        maBibliotheque.rechercherLivreParNombrePages(400);
    }

    private <Livre> void ajouterLivre(Livre livre) {
    }
}
