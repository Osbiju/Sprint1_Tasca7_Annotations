package n1exercici2;

public class TreballadorOnline extends Treballador{
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

    @Deprecated
    public static void desplacament(){
        System.out.println("El desplaçament no esta inclos als treballadors online.");
    }
}
