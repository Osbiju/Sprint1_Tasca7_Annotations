package n1exercici2;

public class TreballadorPresencial extends Treballador {
    private static float gasolina;

    public TreballadorPresencial(String nom, String cognom, float preuPerHora, float gasolina) {
        super(nom, cognom, preuPerHora);
        this.gasolina = gasolina;
    }

    public static float getGasolina() {
        return gasolina;
    }

    @Override
    public float calcularSou(int horesTreballades) {
        return (horesTreballades * super.getPreuPerHora()) + gasolina;
    }

    @Deprecated
    public static void dieta(){
        System.out.println("La dieta no esta inclosa als treballadors presencials.");
    }
}
