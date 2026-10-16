package uts;

public class Pelanggan {
    private String nik;
    private String nama;

    public Pelanggan(String nik, String nama) {
        this.nik = nik;
        this.nama=nama;
    }

    public String getNama() {
        return nama;
    }

    public String getNik() {
        return nik;
    }
}
