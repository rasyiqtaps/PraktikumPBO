package uts;

public class SlotParkir {
    private int nomor;
    private Kendaraan kendaraan;

    public SlotParkir(int nomor) {
        this.nomor = nomor;
    }

    public void parkiran(Kendaraan kendaraan) {
        this.kendaraan = kendaraan;
    }

    public boolean isKosong() {
        return kendaraan == null;
    }

    public Kendaraan getKendaraan() {
        return kendaraan;
    }
}
