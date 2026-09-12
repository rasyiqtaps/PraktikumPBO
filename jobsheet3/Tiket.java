package jobsheet3;

public class Tiket {
    private String judulFilm;
    private double hargaDasar;
    private boolean statusPembayaran = false;

    Tiket(String film, int harga) {
        judulFilm = film;
        hargaDasar = harga;
    }

    String getJudulFilm() {
        return judulFilm;
    }

    double getHargaDasar() {
        if (hargaDasar >= 0) {
            return hargaDasar;
        } else {
            return hargaDasar = 35000;
        }
    }

    String isStatusPembayaran() {
        if (statusPembayaran == true) {
            return (": Pembayaran berhasil");
        } else {
            return (": Belum dibayar!");
        }
    }

    void lakukanPembayaran() {
        statusPembayaran = true;
    }
}