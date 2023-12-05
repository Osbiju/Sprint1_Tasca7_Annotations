package n1exercici1;

public class Main {

    public static void main(String[] args) {

        TreballadorOnline treballador1 = new TreballadorOnline("Maria", "Palotes",25.5f,40);
        TreballadorPresencial treballador2 = new TreballadorPresencial("Pepe", "Flores",25.5f,90);

        System.out.println("El sou de " + treballador1.getNom() + ", es de " + treballador1.calcularSou(160) + " euros");
        System.out.println("El sou de " + treballador2.getNom() + ", es de " + treballador2.calcularSou(160) + " euros");

    }
}
