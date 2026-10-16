package uts;

public class Mekanik {
    private String nama;
    private String keahlian;

    public Mekanik(String nama, String keahlian) {
        this.nama = nama;
        this.keahlian = keahlian;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setKeahlian(String keahlian) {
        this.keahlian = keahlian;
    }

    public String getKeahlian() {
        return keahlian;
    }
}
