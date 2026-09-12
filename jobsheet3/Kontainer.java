package jobsheet3;

public class Kontainer {
    private String ID;
    private String nama;
    private int kapasitas;
    private int muatanSekarang;

    Kontainer (String ID, String nama, int kapasitas) {
        this.ID = ID;
        this.nama = nama;
        this.kapasitas = kapasitas;
        this.muatanSekarang = 0;
    }

    public String getNamaPemilik() {
        return nama;
    }

    public int getKapasitasMaksimal() {
        return kapasitas;
    }

    public void setName(String nama) {
        this.nama = nama;
    }

    public void tambahMuatan(int muatan) {
        if (muatan <= kapasitas - muatanSekarang) {
            muatanSekarang += muatan;
        } else {
            System.out.println("(E1) Maaf, Berat muatan melebihi kapasitas maksimal kontainer");
        }
    }

    public void turunkanMuatan(int muatan) {
        if (muatanSekarang + muatan >= 0) {
            if (Math.abs(muatan) <= (0.5 * muatanSekarang)) {
                muatanSekarang += muatan;
            } else {
                System.out.println("(E3) Maaf, demi keselamatan, pembongkaran muatan satu kali jalan tidak boleh melebihi 50% dari muatan saat ini!");
            }
        } else {
            System.out.println("(E2) Maaf, Berat muatan melibihi sisa Kapasitas kontainer");
        }
    }

    public int getBeratMuatanSaatIni () {
        return muatanSekarang;
    }

    //debug
    public int muatanSekarang() {
        return muatanSekarang;
    }

}
