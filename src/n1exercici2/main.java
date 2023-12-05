package n1exercici2;

public class main {
    @SuppressWarnings("Deprecation") //Aqui treiem la advertencia dels metodes deprecateds
    public static void main(String[] args) {

        TreballadorOnline treballador1 = new TreballadorOnline("Paco", "Porras", 25, 40);
        TreballadorPresencial treballador2 = new TreballadorPresencial("Pepa", "Flores", 25, 70);

        System.out.println("El sou de " + treballador1.getNom() + ", es de " + treballador1.calcularSou(160) + " €");
        System.out.println("El sou de " + treballador2.getNom() + ", es de " + treballador2.calcularSou(160) + " €");

        treballador1.desplacament();
        treballador2.dieta();

    }
}
