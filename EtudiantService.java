import java.util.LinkedList;
import java.util.Scanner;

public class EtudiantService {
    LinkedList<Etudiants> list;

    public EtudiantService() {
        this.list = new LinkedList<>();
    }

    public void afficherEtudiant(){
        if(list.isEmpty()){
            System.out.println("Liste des Etudiants vide ");
        }else {
            for (Etudiants etudiants : list){
                System.out.println(etudiants.toString());
            }
        }
    }

    public boolean verifieExistance(int id){
        for (Etudiants l : list){
            if (l.getId()== id){
                return true;
            }
        }
        return false;
    }

    public void ajouterEtudiant(Etudiants etudiants){
            if(!verifieExistance(etudiants.getId())){
                    Scanner scan =new Scanner(System.in);
                    System.out.println("entrer  nom");
                    String nom = scan.nextLine();
                    System.out.println("entrer  prenom");
                    String prenom = scan.nextLine();
                    System.out.println("entrer  email");
                    String email = scan.nextLine();
                    System.out.println("entrer  password");
                    String password = scan.nextLine();
                    System.out.println("entrer  telephone");
                    String tel = scan.nextLine();
                    System.out.println("entrer  college");
                    String college = scan.nextLine();
                    System.out.println("entrer role_id");
                    String role = scan.nextLine();
                    boolean is_deleted = false;
                    System.out.println("entrer date d'entree");
                    String date_entree = scan.nextLine();
                    int id = 1;
                    if(list.stream().count() >0){
                        id =(int) list.stream().count()+id;
                    }
                    etudiants = new Etudiants(id, nom, prenom, email, tel, password, is_deleted, college,role, date_entree);
                    list.add(etudiants);
            }else {
                System.out.println("Etudiant déja existé");
            }
    }

    public Etudiants trouverEtudiant(int id){
        for (Etudiants line:list){
            if(line.getId()==id){
                return line;
            }
        }
        return null;
    }

    public void modifierEtudiant(int id, Scanner scan){
        if(verifieExistance(id)){
            Etudiants etudiant = trouverEtudiant(id);
            System.out.println("entrer un nouveau nom");
            scan.nextLine();
            String nom = scan.nextLine();
            System.out.println("entrer un nouveau prenom");
            String prenom = scan.nextLine();
            System.out.println("entrer un nouveau email");
            String email = scan.nextLine();
            System.out.println("entrer un nouveau password");
            String password = scan.nextLine();
            System.out.println("entrer un nouveau telephone");
            String tel = scan.nextLine();
            System.out.println("entrer un nouveau college");
            String college = scan.nextLine();
            System.out.println("entrer une nouvelle matiere");
            String matiere = scan.nextLine();
            System.out.println("entrer une nouvelle date d'entree");
            String date_entree = scan.next();
            etudiant.setNom(nom);
            etudiant.setPrenom(prenom);
            etudiant.setEmail(email);
            etudiant.setPassword(password);
            etudiant.setTelephone(tel);
            etudiant.setCollege(college);
            etudiant.setDate_entree(date_entree);
            System.out.println("Etudiant modifier avec succès");
        }else {
            System.out.println("Etudiant non trouvé");
        }
    }

    public void supprimerEtudiant(int id){
        Etudiants etudiantSup=null;

        for (Etudiants lines :list){
            if(lines.getId()==id){
                etudiantSup=lines;
            }
        }

        if (etudiantSup==null){
            System.out.println("Id non valide");
        }else {
            list.remove(etudiantSup);
            System.out.println("Etudiant supprimé avec succès");
        }
    }
}