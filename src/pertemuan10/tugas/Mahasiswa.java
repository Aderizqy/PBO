package pertemuan10.tugas;

public class Mahasiswa extends Pengguna {
    public Mahasiswa(String nama) {
        super(nama);
    }

    @Override
    public void aktivitasUtama() {
        System.out.println("Mahasiswa " + nama + " sedang meminjam buku di perpustakaan.");
    }
}

