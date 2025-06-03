package Final_Static.tugas_5;

public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("233040032", "Rakha");
        Mahasiswa m2 = new Mahasiswa("233040022", "Deri");

        m1.displayInfo();
        System.out.println();

        m2.displayInfo();
        System.out.println();

        System.out.println("Total Mahasiswa: " + Mahasiswa.getTotalMahasiswa());
    }
}

