package pertemuan4;

public class MainMahasiswa {
    public static void main (String[]args) {

        Mahasiswa x = new Mahasiswa();
        Mahasiswa y = x;
        x.setNRP("01");
        y.setNRP("02");
        System.out.println("NRP x: " + x.getNRP());
        Mahasiswa z = new Mahasiswa();
        z.setNRP("03");
        x = z;
        System.out.println("NRP x: " + x.getNRP());
        System.out.println("NRP y: " + y.getNRP());

    }
}