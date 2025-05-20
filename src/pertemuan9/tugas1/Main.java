package pertemuan9.tugas1;

public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.setNama("Toyota Avanza");
        m.setBBM("Solar");

        System.out.println("Nama Mobil: " + m.getNama());
        System.out.println("Bahan Bakar: " + m.getBBM());
    }
}
