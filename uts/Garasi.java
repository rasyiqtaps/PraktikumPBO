package uts;

public class Garasi {
    private String nama;
    private Mekanik kepala;
    private SlotParkir[] daftarSlot;

    public Garasi(String nama, int jumlahSlot) {
        if (jumlahSlot < 0) {
            throw new IllegalArgumentException("Jumlah slot tidak boleh negatif");
        }

        this.nama = nama;
        this.daftarSlot = new SlotParkir[jumlahSlot];
        for (int i = 0; i < jumlahSlot; i++) {
            this.daftarSlot[i] = new SlotParkir(i + 1);
        }
    }


    public void setKepala(String nama, String keahlian) {
        this.kepala = new Mekanik(nama, keahlian);
    }

    public String getNama() {
        return nama;
    }

    public Mekanik getKepala() {
        return kepala;
    }

    public int getNomorSlot(Kendaraan kendaraan) {
        for (int i = 0; i < daftarSlot.length; i++) {
            if (daftarSlot[i].getKendaraan() == kendaraan) {
                return i + 1;
            }
        }
        throw new IllegalStateException("Kendaraan tidak ditemukan di garasi");
    }

    public void parkir(Kendaraan kendaraan) {
        if (kendaraan == null) {
            throw new IllegalArgumentException("Kendaraan tidak boleh null");
        }

        for (SlotParkir slot : daftarSlot) {
            if (slot.isKosong()) {
                slot.parkiran(kendaraan);
                return;
            }
        }

        throw new IllegalStateException("Tidak ada slot parkir yang kosong");
    }

    public void parkir(Kendaraan kendaraan, int nomorSlot) {
        if (kendaraan == null) {
            throw new IllegalArgumentException("Kendaraan tidak boleh null");
        }

        SlotParkir slot = getSlot(nomorSlot);
        if (!slot.isKosong()) {
            throw new IllegalStateException("Slot parkir nomor " + nomorSlot + " sudah terisi");
        }
        slot.parkiran(kendaraan);
    }

    public SlotParkir getSlot(int nomor) {
        if (nomor < 1 || nomor > daftarSlot.length) {
            throw new IndexOutOfBoundsException("Nomor slot di luar jangkauan: " + nomor);
        }
        return daftarSlot[nomor - 1];
    }

    public void tampilInfo() {
        String namaKepala = kepala == null ? "Belum ditentukan" : kepala.getNama();
        System.out.println("Garasi " + nama + " (Kepala: " + namaKepala + ")");
        for (int i = 0; i < daftarSlot.length; i++) {
            SlotParkir slot = daftarSlot[i];
            Kendaraan kendaraan = slot.getKendaraan();
            if (slot.isKosong()) {
                System.out.println("Slot " + (i + 1) + ": Kosong");
            } else {
                System.out.println("Slot " + (i + 1) + ": "
                        + kendaraan.getJenis() + " - " + kendaraan.platNomor);
            }
        }
    }
}
