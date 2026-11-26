
package ecole;

public abstract class personne {


    private String nom;
    private String prenom;
    private String email;

    public personne(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public abstract String getRole();


    public void afficherInfos() {
        System.out.println("Role : " + getRole());
        System.out.println("Nom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Email : " + email);
    }
}

