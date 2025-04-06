package pertemuan3;

public class Mahasiswa {
    public String nim;
    public String nama;
    public String alamat;
    public boolean hadir;

    public Mahasiswa(String nim, String nama, String alamat) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
    }

    public void masukKelas() {
        this.hadir = true;
    }
}