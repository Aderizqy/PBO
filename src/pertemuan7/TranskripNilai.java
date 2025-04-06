package pertemuan7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TranskripNilai {
    private Date tglCetak;
    private double ipk = 0.0;
    private List<KartuHasilStudi> kartuHasilStudi;
    private Mahasiswa mahasiswa;
    private String semester; // Atribut semester

    public TranskripNilai(Mahasiswa mahasiswa, String semester) {
        this.mahasiswa = mahasiswa;
        this.semester = semester;
        this.kartuHasilStudi = new ArrayList<>();
        this.tglCetak = new Date();
    }

    public void addKHS(KartuHasilStudi khs) {
        kartuHasilStudi.add(khs);
    }

    public void hitungIPK() {
        double totalNilai = 0.0;
        int totalSKS = 0;

        for (KartuHasilStudi khs : kartuHasilStudi) {
            for (MataKuliah mk : khs.getDaftarMatakuliah()) {
                totalNilai += mk.hitungNilaiTotal();
                totalSKS += mk.getSks();
            }
        }

        ipk = totalSKS > 0 ? totalNilai / totalSKS : 0.0;
    }

    public void display() {
        System.out.println(mahasiswa.display());
        System.out.println("Semester: " + semester); // Menampilkan semester
        System.out.println("Tanggal Cetak: " + tglCetak.toString());
        System.out.println("IPK: " + String.format("%.2f", ipk));

        for (KartuHasilStudi khs : kartuHasilStudi) {
            System.out.print(khs.display());
        }
    }
}
