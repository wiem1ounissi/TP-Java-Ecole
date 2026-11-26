
package ecole;

public class Etudiant extends personne {

  
    private String matricule;
    private double[] notes;
    private int nbNotes;


    public Etudiant(String nom, String prenom, String email,
                    String matricule) {

        super(nom, prenom, email);

        this.matricule = matricule;
        this.notes = new double[10];
        this.nbNotes = 0;
    }

    public void ajouterNote(double note) {

        if (nbNotes < notes.length) {
            notes[nbNotes] = note;
            nbNotes++;
        } else {
            System.out.println("Tableau des notes plein !");
        }
    }

    // Calculer la moyenne
    public double calculerMoyenne() {

        if (nbNotes == 0) {
            return 0;
        }

        double somme = 0;

        for (int i = 0; i < nbNotes; i++) {
            somme += notes[i];
        }

        return somme / nbNotes;
    }


    @Override
    public String getRole() {
        return "Etudiant";
    }


    @Override
    public void afficherInfos() {

        super.afficherInfos();

        System.out.println("Matricule : " + matricule);
        System.out.println("Moyenne : " + calculerMoyenne());
    }
}
