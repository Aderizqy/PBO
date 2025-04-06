package pertemuan5;

public class MatakuliahMain {
    public static void main(String[] args) {
        // Membuat objek mata kuliah
        Matakuliah mk1 = new Matakuliah("001", "Algoritma Pemrograman 1", "A", 3);
        Matakuliah mk2 = new Matakuliah("002", "Algoritma Pemrograman 2", "BC", 3);
        Matakuliah mk3 = new Matakuliah("003", "Pemrograman Berorientasi Objek", "B", 3);

        // Menampilkan daftar mata kuliah
        System.out.println("--- DAFTAR MATAKULIAH ---");
        System.out.println(mk1.display());
        System.out.println(mk2.display());
        System.out.println(mk3.display());

        // Menghitung total nilai dan total SKS
        double totalNilai = mk1.hitungNilaiTotal() + mk2.hitungNilaiTotal() + mk3.hitungNilaiTotal();
        int totalSKS = mk1.getSks() + mk2.getSks() + mk3.getSks();

        // Menghitung IPK
        double ipk = totalNilai / totalSKS;

        // Menampilkan IPK
        System.out.println("\n--- NILAI IPK ---");
        System.out.printf("IPK: %.2f\n", ipk); // Format IPK dengan 2 angka di belakang koma
    }
}