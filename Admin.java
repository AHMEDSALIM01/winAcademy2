import java.util.ArrayList;

public class Admin extends Users{
    private Etudiants etudiantsClasse;
    public Admin() {
        super(1, "salim","ahmed", "salim@gmail.com", "0666889900", "112321421", false, "Allal el fassi", "admin");
        this.etudiantsClasse = new Etudiants();
    }




}
