package uts;

import java.util.Locale;

public class Kasir {
    private String nama;

    public Kasir(String nama) {
        this.nama = nama;
    }

    public void cetakNota(Kendaraan kendaraan) {
        if (kendaraan == null) {
            throw new IllegalArgumentException("Kendaraan tidak boleh null");
        }

        Pelanggan penyewa = kendaraan.getPenyewa();
        if (penyewa == null) {
            throw new IllegalStateException("Kendaraan belum memiliki penyewa");
        }

        System.out.println("Nota [" + kendaraan.getJenis().toLowerCase(Locale.ROOT) + "] "
                + kendaraan.getPlatNomor() + " " + kendaraan.getMerk());
        System.out.println("penyewa : " + penyewa.getNama()
                + " | lama : " + kendaraan.getHarisewa() + " hari"
                + " | total : " + kendaraan.hitungSewa());
    }
}
