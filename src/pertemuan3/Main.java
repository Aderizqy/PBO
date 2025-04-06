package pertemuan3;

public class Main {
    public static void main(String[] args) {

        Mahasiswa m1 = new Mahasiswa("1", "jo", "Indonesia");
        Mahasiswa m2 = new Mahasiswa("2", "ko", "Indonesia");
        Mahasiswa m3 = new Mahasiswa("3", "wi", "Indonesia");

        m1.masukKelas();
        System.out.println(m1.hadir);


        Lingkaran l1 = new Lingkaran(10);
        System.out.println("Luas lingkaran adalah : " +l1.hitungLuas());

    }

}