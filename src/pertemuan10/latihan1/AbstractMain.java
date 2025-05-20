package pertemuan10.latihan1;

public class AbstractMain {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(10);
        Tabung tabung = new Tabung(10, 5);

        System.out.println("== Lingkaran ==");
        System.out.println("jari2: " + lingkaran.getJariJari());
        System.out.println("luas:" + lingkaran.luas());

        System.out.println("== Tabung ==");
        System.out.println("jari2: " + tabung.getJariJari() + ", Tinggi:" + tabung.getTinggi());
        System.out.println("luas:" + tabung.luas());
    }
}


