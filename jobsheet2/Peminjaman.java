public class Peminjaman {
    public int ID;
    public String nama;
    public String game;
    public int harga;

    public void tampilData() {
        System.out.println("ID Transaksi\t:" + ID);
        System.out.println("Nama Pelanggan\t:" + nama);
        System.out.println("Jenis Game\t:" + game);
        System.out.println("Biaya Sewa\t:" + harga);
    }
}
