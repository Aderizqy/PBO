package pertemuan10.latihan2;

public class InterfaceMain {
    public static void main(String[] args) {
        // Membuat objek kartu elektronik
        KartuElektronik kartu = new KartuElektronik("Ade Rizqy", "9876543210");

        // Menampilkan informasi kartu
        System.out.println("== Informasi Kartu ==");
        System.out.println("Nama Pemilik : " + kartu.getNamaPemilik());
        System.out.println("Nomor Kartu  : " + kartu.getNomorKartu());

        // Menjalankan metode interface
        kartu.otentikasi();
        kartu.encode();
    }
}

