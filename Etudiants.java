import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Etudiants extends Users {
   private String date_entree;

    public Etudiants(){}
    public Etudiants(int id, String nom, String prenom, String email, String telephone, String password, boolean is_deleted, String college, String role, String date_entree) {
        super(id, nom, prenom, email, telephone, password, is_deleted, college, role);
        this.date_entree = date_entree;
    }

    public String getDate_entree() {
        return date_entree;
    }

    public void setDate_entree(String date_entree) {
        this.date_entree = date_entree;
    }

    @Override
    public String toString() {
        return "-----------------------------------------------------------------------------------------" +
                "\nid= " + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", college='" + college + '\'' +
                ", role='" + role;
    }
}