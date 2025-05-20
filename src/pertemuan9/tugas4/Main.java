package pertemuan9.tugas4;

public class Main {
    public static void main(String[] args) {
        Mobil m = new Mobil("Suzuki Ertiga", "Bio Solar", 1500);
        System.out.println("Nama Mobil: " + m.getNama());
        System.out.println("Bahan Bakar: " + m.getBBM());
        System.out.println("Kapasitas Mesin: " + m.getCC() + " cc");
    }
}
