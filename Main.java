import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Enseignants enseignants = new Enseignants();
        EnseignantService service= new EnseignantService();
        Notes note= new Notes();
        NoteService noteService = new NoteService();
        Etudiants etudiants = new Etudiants();
        EtudiantService etudiantService = new EtudiantService();
        Matieres matieres = new Matieres();
        MatiereService maiereService = new MatiereService();
        Scanner s = new Scanner(System.in);
        int cmenu;
        int cinsert;
        int cdisplay;
        int csearch;
        int cdelete;
        int cupdate;
        do{
            System.out.println("1. Insert");
            System.out.println("2. Display");
            System.out.println("3. Search");
            System.out.println("4. Delete");
            System.out.println("5. Modifier");
            System.out.println("6. Quit");
            System.out.print("Entrer votre choix: ");
            cmenu = s.nextInt();

            switch (cmenu) {
                case 1:
                    System.out.println("1. (Insert) Etudiant");
                    System.out.println("2. (Insert) Enseigant");
                    System.out.println("3. (Insert) Matiere");
                    System.out.println("4. (Insert) Note");
                    System.out.print("Entrer votre choix: ");
                    cinsert = s.nextInt();
                    switch (cinsert) {
                        case 1:
                            etudiantService.ajouterEtudiant(etudiants);
                            break;
                        case 2:
                            service.ajouterEnseignant(enseignants);
                            break;
                        case 3:
                            break;
                        case 4:
                            System.out.println("entre id etudiant");
                            int id_ens = s.nextInt();
                            noteService.ajouterNote(id_ens,note,service);
                            break;
                    }
                    break;

                case 2:
                    System.out.println("1. (Display) all Etudiant");
                    System.out.println("2. (Display) all Enseigant");
                    System.out.println("3. (Display) Notes pour etudiant");
                    System.out.println("4. (Display) Moyenne pour etudiant");
                    System.out.print("Entrer votre choix: ");
                    cdisplay = s.nextInt();
                    switch (cdisplay) {
                        case 1:
                            etudiantService.afficherEtudiant();
                            break;
                        case 2:
                            service.afficherEnseignant();
                            break;
                        case 3:
                            noteService.afficherNotes(s);
                            break;
                        case 4:
                            noteService.afficherMoyenEtudiant(s,etudiantService);
                            break;
                    }
                    break;

                case 3:
                    System.out.println("1. (Search) Etudiant par id");
                    System.out.println("2. (Search) Etudiant par nom");
                    System.out.println("3. (Search) Enseigant par id");
                    System.out.println("4. (Search) Enseigant par nom");
                    System.out.print("Entrer votre choix: ");
                    csearch = s.nextInt();
                    switch (csearch) {
                        case 1:
                            System.out.println("Entrer Id etudiant");
                            int id_etudiant = s.nextInt();
                            etudiantService.trouverEtudiant(id_etudiant);
                            break;
                        case 2:
                            break;
                        case 3:
                            System.out.println("Entrer le id enseignant");
                            int id = s.nextInt();
                            if(service.trouverEnseignant(id)== null){
                                System.out.println("enseignant non trouvée");
                            }else {
                                System.out.println(service.trouverEnseignant(id));
                            }
                            break;
                        case 4:
                            break;
                    }
                    break;

                case 4:
                    System.out.println("1. (Delete) Etudiant");
                    System.out.println("2. (Delete) Enseignant");
                    System.out.println("3. (Delete) Matiere");
                    System.out.println("4. (Delete) Note");
                    System.out.print("Entrer votre choix: ");
                    cdelete = s.nextInt();
                    switch (cdelete) {
                        case 1:
                            System.out.println("Entrer le numero d'enseignant");
                            int id_etudiant = s.nextInt();
                            etudiantService.supprimerEtudiant(id_etudiant);
                            break;
                        case 2:
                            int id = s.nextInt();
                            service.supprimerEnseignant(id);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;

                case 5:
                    System.out.println("1. (Modifier) Etudiant");
                    System.out.println("2. (Modifier) Enseigant");
                    System.out.println("3. (Modifier) Matiere");
                    System.out.println("4. (Modifier) Note");
                    System.out.print("Entrer votre choix: ");
                    cupdate = s.nextInt();
                    switch (cupdate) {
                        case 1:
                            System.out.println("Entrer le numero d'enseignant");
                            int id_etudiant = s.nextInt();
                            etudiantService.modifierEtudiant(id_etudiant,s);
                            break;
                        case 2:
                            System.out.println("Entrer le numero d'enseignant");
                            service.modifierEnseignant(s.nextInt(),s);
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                    }
                    break;

                case 6:
                    break;
            }
        }while(cmenu!=0);
    }
}