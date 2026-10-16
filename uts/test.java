package uts;

public class test {
    public static void main(String[] args) {
        Garasi g1 = new Garasi("Rental Arjuno", 4);
        g1.setKepala("Pak Joko", "Mesin");

        Pelanggan p1 = new Pelanggan("3573010101", "Dina");
        Mobil mobilDina = new Mobil("N 1234 AB", "Toyota Avanza", 350000, true);
        mobilDina.setHarisewa(3);
        mobilDina.setPenyewa(p1);
        g1.parkir(mobilDina);

        Motor motorDina = new Motor("N 5678 CD", "Honda Vario", 80000 , 125);
        motorDina.setHarisewa(7);
        motorDina.setPenyewa(p1);
        g1.parkir(motorDina, 4);

        Kasir kasir = new Kasir("Rasyiq");
        kasir.cetakNota(mobilDina);
        kasir.cetakNota(motorDina);

        g1.tampilInfo();

        Kendaraan k = new Motor("N 999 ZZ", "Yamaha NMAX", 10000, 155);
        System.out.println("Hasil hitungSewa(): " + k.hitungSewa());
    }
}
