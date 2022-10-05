public class Notes {
    private String matiere;
    private int enseignant_id;
    private int valeur ;

    public Notes(){};
    public Notes(String matiere, int enseignant_id, int valeur) {
        this.matiere = matiere;
        this.enseignant_id = enseignant_id;
        this.valeur = valeur;
    }


    public String getMatiere() {
        return matiere;
    }

    public void setMatiere(String matiere) {
        this.matiere = matiere;
    }

    public int getEnseignant_id() {
        return enseignant_id;
    }

    public void setEnseignant_id(int enseignant_id) {
        this.enseignant_id = enseignant_id;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    @Override
    public String toString() {
        return "Notes{" +
                "enseignant_id=" + enseignant_id +
                ", matiere='" + matiere + '\'' +
                ", valeur=" + valeur +
                '}';
    }
}
