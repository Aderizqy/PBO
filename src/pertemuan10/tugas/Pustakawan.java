package pertemuan10.tugas;

public class Pustakawan extends Pengguna {
    public Pustakawan(String nama) {
        super(nama);
    }

    @Override
    public void aktivitasUtama() {
        System.out.println("Pustakawan " + nama + " sedang mendata koleksi buku.");
    }
}

