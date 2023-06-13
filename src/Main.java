public class Main {
    public static void main(String[] args) {
        Powerlifter lifter = new Powerlifter("Adonis Subiabre", 22, 63.5, 70, 70, 70);

        System.out.println("Nombre: " + lifter.getNombre());
        System.out.println("Edad: " + lifter.getEdad());
        System.out.println("Peso: " + lifter.getPeso());
        System.out.println("Marca en press de banca: " + lifter.getMarcaPressBanca());
        System.out.println("Marca en sentadilla: " + lifter.getMarcaSentadilla());
        System.out.println("Marca en peso muerto: " + lifter.getMarcaPesoMuerto());
    }
}
