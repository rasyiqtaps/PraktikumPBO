package uts;

public class Mobil extends Kendaraan {
    private boolean denganSopir;

    public Mobil(String platNomor, String merk, int tarifHarian, boolean denganSopir) {
        super(platNomor, merk, tarifHarian);
        this.denganSopir = denganSopir;
    }

    @Override
    public int hitungSewa() {
        int totalSewa = super.hitungSewa();
        return denganSopir ? totalSewa + 150000 : totalSewa;
    }

    @Override
    public String getJenis() {
        return "Mobil";
    }
}
