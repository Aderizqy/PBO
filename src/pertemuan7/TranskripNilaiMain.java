package pertemuan7;

public class TranskripNilaiMain {
    public static void main(String[] args) {
        // Membuat dosen pengampu
        Dosen dosen1 = new Dosen("Dr. IR. Leony Lidya, M.T.");
        Dosen dosen2 = new Dosen("Siroj Nur Ulum, S.T., M.T.");

        // Membuat mata kuliah
        MataKuliah mk1 = new MataKuliah("001", "Algoritma Pemrograman 1", "A", 3, dosen1);
        MataKuliah mk2 = new MataKuliah("002", "Algoritma Pemrograman 2", "BC", 3, dosen1);
        MataKuliah mk3 = new MataKuliah("003", "Pemrograman Berorientasi Objek", "B", 3, dosen2);

        // Membuat Kartu Hasil Studi untuk semester tertentu
        KartuHasilStudi khs = new KartuHasilStudi("20222");
        khs.addMatakuliah(mk1);
        khs.addMatakuliah(mk2);
        khs.addMatakuliah(mk3);

        // Membuat mahasiswa
        Mahasiswa mhs = new Mahasiswa("303040001", "Jhon");

        // Membuat Transkrip Nilai dan menentukan semester
        TranskripNilai transkrip = new TranskripNilai(mhs, "4");
        transkrip.addKHS(khs);

        // Hitung IPK
        transkrip.hitungIPK();

        // Tampilkan hasil
        transkrip.display();
    }
}
