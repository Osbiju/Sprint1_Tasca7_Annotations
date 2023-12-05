package n1exercici2;

public class Treballador {
    private String nom;
    private String cognom;
    private float preuPerHora;

    public Treballador(String nom, String cognom, float preuPerHora) {
        this.nom = nom;
        this.cognom = cognom;
        this.preuPerHora = preuPerHora;
    }

    public String getNom() {
        return this.nom;
    }

    public String getCognom() {
        return this.cognom;
    }

    public float getPreuPerHora() {
        return this.preuPerHora;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognom(String cognom) {
        this.cognom = cognom;
    }

    public void setPreuPerHora(float preuPerHora) {
        this.preuPerHora = preuPerHora;
    }

    //metode propi
    public float calcularSou(int horesTreballades) {
        return preuPerHora * horesTreballades;
    }
}
