package jobsheet3;
import java.util.Scanner;

public class TestLogistik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Kontainer kontainerAlfa = new Kontainer("REQ-9988", "PT. Maju Bersama", 5000);

        System.out.println("Nama Pemilik Kontainer: " + kontainerAlfa.getNamaPemilik());
        System.out.println("Kapasitas Maksimal: " + kontainerAlfa.getKapasitasMaksimal() + " kg");

        while (true) {
            System.out.print("\nMemasukkan muatan baru : ");
            int muatan = sc.nextInt();

            if (muatan < 0) {
                kontainerAlfa.turunkanMuatan(muatan);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
            } else if (muatan >= 0) {
                kontainerAlfa.tambahMuatan(muatan);
                System.out.println("Berat muatan saat ini: " + kontainerAlfa.getBeratMuatanSaatIni() + " kg");
            } else {
                System.out.println("input tidak valid.\t");
            }            
        }
    }
}