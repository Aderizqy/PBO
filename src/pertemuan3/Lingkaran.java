package pertemuan3;

public class Lingkaran {
    double jari;
    double phi;

    public Lingkaran(double jari) {
        this.jari = jari;
        this.phi = 3.14;
    }

    public double hitungLuas() {
        return phi * jari * jari;
    }

}