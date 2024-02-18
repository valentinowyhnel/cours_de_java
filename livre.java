package livre;

public class livre {
    public String titre;
    public String auteur;
    public int anneePublication;

    // Constructeur
    public livre(String titre, String auteur, int anneePublication, int i) {
        if (titre == null || titre.isEmpty()) {
            throw new IllegalArgumentException("Le titre du livre ne peut pas être vide.");
        }
        if (auteur == null || auteur.isEmpty()) {
            throw new IllegalArgumentException("Le nom de l'auteur ne peut pas être vide.");
        }
        if (anneePublication <= 0) {
            throw new IllegalArgumentException("L'année de publication doit être supérieure à zéro.");
        }

        this.titre = titre;
        this.auteur = auteur;
        this.anneePublication = anneePublication;
    }

    // Méthode pour afficher les détails du livre
    public void afficherDetails() {
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Année de publication : " + anneePublication);
    }

    // Méthode principale (exemple d'utilisation)
    public static void main(String[] args) {
        try {
            livre monlivre = new livre("Le Comte de Monte-Cristo", "Alexandre Dumas", 1844, 328);
            monlivre.afficherDetails();
        } catch (IllegalArgumentException e) {
            System.err.println("Erreur lors de la création du livre : " + e.getMessage());
        }
    }

    public Object getAuteur() {
        return null;
    }
}

