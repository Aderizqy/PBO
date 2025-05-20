package pertemuan9.tugas4;

class Mobil extends Kendaraan {
    private int cc;

    public Mobil(String nama, String bbm, int cc) {
        super(nama, bbm);
        this.cc = cc;
    }

    public void setCC(int cc) {
        this.cc = cc;
    }

    public int getCC() {
        return cc;
    }
}
