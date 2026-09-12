public class Nasabah {
    public int nik;
    public String nama;
    public double saldo;

    public void tampilkanSaldo(String mataUang){
        System.out.println("Saldo anda adalah: " + mataUang + " " + saldo);
    }
    public void tampilkanData() {
        System.out.println("NIM : "+ nik);
        System.out.println("Nama    : " + nama);
    }
}