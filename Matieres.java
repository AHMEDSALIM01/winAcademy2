public class Matieres {
    protected int id_matiere;
    protected String nom_matiere;

    public Matieres(){}
    public Matieres(int id_matiere, String nom_matiere) {
        this.id_matiere = id_matiere;
        this.nom_matiere = nom_matiere;
    }

    public int getId_matiere() {
        return id_matiere;
    }

    public void setId_matiere(int id_matiere) {
        this.id_matiere = id_matiere;
    }

    public String getNom_matiere() {
        return nom_matiere;
    }

    public void setNom_matiere(String nom_matiere) {
        this.nom_matiere = nom_matiere;
    }

    @Override
    public String toString() {
        return "Matieres{" +
                "id_matiere=" + id_matiere +
                ", nom_matiere='" + nom_matiere + '\'' +
                '}';
    }
}