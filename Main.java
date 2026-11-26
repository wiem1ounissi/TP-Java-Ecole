
package ecole;

public class Main {

    public static void main(String[] args) {

        // Création de 2 étudiants
        Etudiant e1 = new Etudiant(
            "Wiem", "Ounissi", "wiem@gmail.com", "E001"
        );

        Etudiant e2 = new Etudiant(
            "Sara", "Ali", "sara@gmail.com", "E002"
        );

        // Ajouter des notes
        e1.ajouterNote(15);
        e1.ajouterNote(17);

        e2.ajouterNote(12);
        e2.ajouterNote(14);

        // Création de 2 enseignants
        Enseignant ens1 = new Enseignant(
            "Ahmed", "Ben Ali", "ahmed@gmail.com",
            "Informatique", 20
        );

        Enseignant ens2 = new Enseignant(
            "Amira", "Trabelsi", "amira@gmail.com",
            "Marketing", 18
        );

        // Tableau Personne
        personne[] personnes = {
            e1, e2, ens1, ens2
        };

        
        for (int i = 0; i < personnes.length; i++) {

            System.out.println("----------------------");

            personnes[i].afficherInfos();
        }
    }
}

