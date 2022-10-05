public class Enseignants extends Users{
    private String date_fonction;
    private String matiere;
    public Enseignants() {
    }

    public Enseignants(int id, String nom, String prenom, String email, String telephone, String password,String college, String date_fonction, String matiere) {
        super(id, nom, prenom, email, telephone, password, false, college, "enseignant");
        this.date_fonction = date_fonction;
        this.matiere = matiere;
    }

    public String getDate_fonction() {
        return date_fonction;
    }

    public void setDate_fonction(String date_fonction) {
        this.date_fonction = date_fonction;
    }

    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    @Override
    public String toString() {
        return "Enseignants{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", email='" + email + '\'' +
                ", telephone='" + telephone + '\'' +
                ", password='" + password + '\'' +
                ", role='" + role + '\'' +
                ", matiere='" + matiere + '\'' +
                ", college='" + college + '\'' +
                "date_fonction='" + date_fonction + '\'' +
                ", is_deleted=" + is_deleted +
                '}';
    }
}

