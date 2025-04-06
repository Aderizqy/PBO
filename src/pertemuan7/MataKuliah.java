package pertemuan7;

public class MataKuliah {
    private String kode;
    private String nama;
    private String index;
    private int sks;
    private Dosen dosen; // Relasi dengan kelas Dosen

    public MataKuliah(String kode, String nama, String index, int sks, Dosen dosen) {
        this.kode = kode;
        this.nama = nama;
        this.index = index;
        this.sks = sks;
        this.dosen = dosen;
    }

    public Dosen getDosen() {
        return dosen;
    }

    public void setDosen(Dosen dosen) {
        this.dosen = dosen;
    }

    public double nilaiIndex() {
        switch (index) {
            case "A": return 4.0;
            case "AB": return 3.5;
            case "B": return 3.0;
            case "BC": return 2.5;
            case "C": return 2.0;
            case "D": return 1.0;
            case "E": return 0.0;
            default: return 0.0;
        }
    }

    public double hitungNilaiTotal() {
        return nilaiIndex() * sks;
    }

    public String display() {
        return kode + " - " + nama + " - " + index + " - " + sks + "\nDosen Pengampu: " + dosen.getNama();
    }

    public int getSks() {
        return sks;
    }
}
