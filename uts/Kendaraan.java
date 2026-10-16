package uts;

public class Kendaraan {
    protected String platNomor;
    protected String merk;
    protected int tarifHarian;
    protected int harisewa;
    private Pelanggan penyewa;

    public Kendaraan (String platNomor, String merk, int tarifHarian){
        this.platNomor = platNomor;
        this.merk = merk;
        this.tarifHarian = tarifHarian;
    }

    public void setPenyewa(Pelanggan penyewa) {
        this.penyewa = penyewa;
    }

    public Pelanggan getPenyewa() {
        return penyewa;
    }

    public void setHarisewa(int harisewa) {
        this.harisewa = harisewa;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }

    public int getHarisewa() {
        return harisewa;
    }

    public int hitungSewa() {
        return tarifHarian * harisewa;
    }

    public String getJenis() {
        return "Kendaraan";
    }
}
