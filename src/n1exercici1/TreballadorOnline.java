package n1exercici1;

public class TreballadorOnline extends Treballador {
    private final float preuInternet;

    public TreballadorOnline(String nom, String cognom, float preuPerHora, float preuInternet) {
        super(nom, cognom, preuPerHora);
        this.preuInternet = preuInternet;
    }

    public float getPreuInternet() {
        return this.preuInternet;
    }

    @Override
    public float calcularSou(int horesTreballades) {
        return (horesTreballades * super.getPreuPerHora()) + this.preuInternet;
    }
}
