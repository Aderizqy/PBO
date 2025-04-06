package pertemuan6;

import pertemuan5.Matakuliah;
import java.util.ArrayList;
import java.util.List;

public class KartuHasilStudi {
    private String semester;
    private double ips;
    private List<Matakuliah> daftarMatakuliah;

    public KartuHasilStudi(String semester) {
        this.semester = semester;
        this.daftarMatakuliah = new ArrayList<>();
    }

    public void addMatakuliah(Matakuliah matakuliah) {
        daftarMatakuliah.add(matakuliah);
    }

    public double hitungIPS() {
        double totalNilai = 0.0;
        int totalSKS = 0;

        for (Matakuliah mk : daftarMatakuliah) {
            totalNilai += mk.hitungNilaiTotal();
            totalSKS += mk.getSks();
        }

        ips = totalSKS > 0 ? totalNilai / totalSKS : 0.0;
        return ips;
    }

    public String display() {
        StringBuilder sb = new StringBuilder();
        for (Matakuliah mk : daftarMatakuliah) {
            sb.append(mk.display()).append("\n");
        }
        return sb.toString();
    }

    public List<Matakuliah> getDaftarMatakuliah() {
        return daftarMatakuliah;
    }
}
