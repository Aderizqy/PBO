package pertemuan10.tugas;

public class PenggunaDigital implements ManajemenAkun {
    String username;

    public PenggunaDigital(String username) {
        this.username = username;
    }

    @Override
    public void login() {
        System.out.println(username + " berhasil login ke sistem perpustakaan.");
    }

    @Override
    public void logout() {
        System.out.println(username + " telah logout dari sistem perpustakaan.");
    }
}

