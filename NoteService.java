import java.util.*;
import java.util.stream.Collectors;

public class NoteService {
        LinkedList<Notes> list;

        public NoteService() {
            this.list = new LinkedList<>();
        }

        public void afficherNotes(Scanner scan){
            if(list.isEmpty()){
                System.out.println("Liste des etudiants vide ");
            }else {
                System.out.println("Entrer id etudiant");
                int id_etudiant =scan.nextInt();
                System.out.println(list.stream().filter(id_e -> id_e.getEnseignant_id() == id_etudiant).collect(Collectors.toList()));
            }
        }

    public void afficherMoyenEtudiant(Scanner scan,EtudiantService service){
        if(list.isEmpty()){
            System.out.println("Liste des etudiants vide ");
        }else {
            System.out.println("Entrer id etudiant");
            int id_etudiant =scan.nextInt();
            double moyen = list.stream().filter(id_e -> id_e.getEnseignant_id() == id_etudiant).mapToDouble(id_e -> id_e.getValeur()).average().orElse(Double.NaN);
            String nom_etudiant= service.trouverEtudiant(id_etudiant).getNom();
            String prenom_etudiant= service.trouverEtudiant(id_etudiant).getPrenom();
            System.out.printf("la moyenne generale de l'etudiant %s %s = %.1f%n", nom_etudiant, prenom_etudiant, moyen);
        }
    }

        public void ajouterNote(int id_enseignant,Notes notes,EnseignantService service){
                if(service.trouverEnseignant(id_enseignant)==null){
                    System.out.println("enseignant non trouvée");
                }else {
                    Scanner scan = new Scanner(System.in);
                    System.out.println("entrer  La matiere");
                    String matiere = scan.nextLine();
                    System.out.println("entrer  La note");
                    int valeur = scan.nextInt();
                    notes = new Notes(matiere, id_enseignant, valeur);
                    list.add(notes);
                    System.out.println("Note ajouter par succès");
                }
        }







}
