package pertemuan4;

public class Lingkaran {
    private double jarijari;
    private final static double phi = 3.14;

    public Lingkaran(double jarijari){
        this.jarijari = jarijari;
    }

    public double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    public String toString(){
        return "Lingkaran dengan jari-jari: " + jarijari;
    }
}
