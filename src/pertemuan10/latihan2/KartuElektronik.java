package pertemuan10.latihan2;

public class KartuElektronik implements Kartu {
    private String namaPemilik;
    private String nomorKartu;

    public KartuElektronik(String namaPemilik, String nomorKartu) {
        this.namaPemilik = namaPemilik;
        this.nomorKartu = nomorKartu;
    }

    public String getNamaPemilik() {
        return namaPemilik;
    }

    public void setNamaPemilik(String namaPemilik) {
        this.namaPemilik = namaPemilik;
    }

    public String getNomorKartu() {
        return nomorKartu;
    }

    public void setNomorKartu(String nomorKartu) {
        this.nomorKartu = nomorKartu;
    }

    @Override
    public void otentikasi() {
        System.out.println("Otentikasi kartu " + nomorKartu + " milik " + namaPemilik + " berhasil.");
    }

    @Override
    public void encode() {
        System.out.println("Data pada kartu " + nomorKartu + " telah dienkripsi.");
    }
}

