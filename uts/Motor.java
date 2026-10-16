package uts;

public class Motor extends Kendaraan{
    private int cc;

    public Motor (String platNomor, String merk, int tarifHarian, int cc) {
        super(platNomor, merk, tarifHarian);
        this.cc = cc;
    }

    @Override 
    public int hitungSewa() {
        int totalSewa = super.hitungSewa();
        return harisewa >= 7 ? totalSewa - totalSewa / 10 : totalSewa;
    }

    @Override 
    public String getJenis() {
        return "Motor";
    }
}
