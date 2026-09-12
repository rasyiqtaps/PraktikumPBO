public class BarangBaru {
  public String kode;
  public String namaBarang;
  public int hargaDasar;
  public float diskon;

  public int hitungHargaJual() {
    int hargaJual = hargaDasar - ((int)diskon * hargaDasar);
    return hargaJual;
  }

  public void tampilData() {
    System.out.println("Kode barang\t: " + kode);
    System.out.println("Nama Barang\t: " + namaBarang);
    System.out.println("total harga jual: " + hargaDasar);
    System.out.println("Harga Diskon\t: " + diskon);
    System.out.println("Harga setelah diskon: " + hitungHargaJual());
  }
}