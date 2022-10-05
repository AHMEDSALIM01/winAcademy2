import java.util.LinkedList;
import java.util.Scanner;

public class MatiereService {
    LinkedList<Matieres> list;

    public MatiereService() {
        this.list = new LinkedList<>();
    }

    public void afficherMatiere(){
        if(list.isEmpty()){
            System.out.println("Liste des Matieres vide ");
        }else {
            for (Matieres matieres : list){
                System.out.println(matieres.toString());
            }
        }
    }

    public boolean verifieExistance(String nom_matiere){
        for (Matieres l : list){
            if (l.getNom_matiere()== nom_matiere){
                return true;
            }
        }
        return false;
    }

    public void ajouterEnseignant(Matieres matieres){
        if(!verifieExistance(matieres.getNom_matiere())){
            list.add(matieres);
        }else {
            System.out.println("Matieres déja existé");
        }
    }

    public Matieres trouverMatiere(String nom_matiere){
        for (Matieres line:list){
            if(line.getNom_matiere()==nom_matiere){
                return line;
            }
        }
        return null;
    }

    public void modifierMatiere(String nom_matiere, Scanner scan){
        if(verifieExistance(nom_matiere)){
            Matieres matiere = trouverMatiere(nom_matiere);
            System.out.println("entrer un nouveau nom de matiere");
            scan.nextLine();
            String nom = scan.nextLine();
            matiere.setNom_matiere(nom);
            System.out.println("Matiere modifier avec succès");
        }else {
            System.out.println("Matiere non trouvé");
        }
    }

    public void supprimerMatiere(String nom_matiere){
        Matieres matiereSup=null;

        for (Matieres lines :list){
            if(lines.getNom_matiere()==nom_matiere){
                matiereSup=lines;
            }
        }

        if (matiereSup==null){
            System.out.println("Matiere non valide");
        }else {
            list.remove(matiereSup);
            System.out.println("Matiere supprimé avec succès");
        }
    }
}