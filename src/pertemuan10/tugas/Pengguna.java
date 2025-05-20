package pertemuan10.tugas;

public abstract class Pengguna {
    String nama;

    public Pengguna(String nama) {
        this.nama = nama;
    }

    public abstract void aktivitasUtama();
}

