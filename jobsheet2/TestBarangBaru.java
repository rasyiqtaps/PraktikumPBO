public class TestBarangBaru {
  public static void main(String[] agrs){
    BarangBaru brg1 = new BarangBaru();
    brg1.kode = "A01";
    brg1.namaBarang = "botol";
    brg1.hargaDasar = 1000;
    brg1.diskon = 0.5f;

    brg1.tampilData();
  }
}