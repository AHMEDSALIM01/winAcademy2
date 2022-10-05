import java.util.LinkedList;
import java.util.Scanner;

public class EnseignantService {
    LinkedList<Enseignants> list;

    public EnseignantService() {
        this.list = new LinkedList<>();
    }

    public void afficherEnseignant(){
        if(list.isEmpty()){
            System.out.println("Liste des enseignant vide ");
        }else {
            for (Enseignants enseignants : list){
                System.out.println(enseignants.toString());
            }
        }
    }

    public boolean verifieExistance(int id){
        for (Enseignants l : list){
            if (l.getId()== id){
                System.out.println(l);
                return true;
            }
        }
        return false;
    }

    public void ajouterEnseignant(Enseignants enseignants){
        if(!verifieExistance(enseignants.getId())){
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
            System.out.println("entrer matiere");
            String matiere = scan.nextLine();
            System.out.println("entrer date de fonction");
            String date_fonction = scan.nextLine();
            int id = 1;
            if(list.stream().count() >0){
                id =(int) list.stream().count()+id;
            }
            enseignants = new Enseignants(id, nom, prenom, email, tel, password, college, date_fonction, matiere);
            list.add(enseignants);
        }else {
            System.out.println("Enseignant déja existé");
        }
    }

    public Enseignants trouverEnseignant(int id){
        for (Enseignants l:list){
            if(l.getId()==id){
                return l;
            }
        }
        return null;
    }

    public void modifierEnseignant(int id, Scanner scan){
        if(verifieExistance(id)){
            Enseignants enseignant = trouverEnseignant(id);
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
            System.out.println("entrer une nouvelle date de fonction");
            String date_fonction = scan.next();
            enseignant.setNom(nom);
            enseignant.setPrenom(prenom);
            enseignant.setEmail(email);
            enseignant.setPassword(password);
            enseignant.setTelephone(tel);
            enseignant.setCollege(college);
            enseignant.setMatiere(matiere);
            enseignant.setDate_fonction(date_fonction);
            System.out.println("Enseignant modifier avec succès");
        }else {
            System.out.println("Enseignant non trouvé");
        }
    }

    public void supprimerEnseignant(int id){
        Enseignants enseignantSup=null;

        for (Enseignants lines :list){
            if(lines.getId()==id){
                enseignantSup=lines;
            }
        }

        if (enseignantSup==null){
            System.out.println("Id non valide");
        }else {
            list.remove(enseignantSup);
            System.out.println("Enseignant supprimé avec succès");
        }
    }
}
