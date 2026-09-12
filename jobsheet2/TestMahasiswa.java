public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 2541079;
        mhs1.nama= "Rasyiq S M";
        mhs1.alamat = "Kota Permata Blok B3 no 7";
        mhs1.kelas = "2C";
        mhs1.tampilBiodata();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 2541021;
        mhs2.nama= "sigra s a";
        mhs2.alamat = "alamat b";
        mhs2.kelas = "2D";
        mhs2.tampilBiodata();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 2541012;
        mhs3.nama= "juvaier as";
        mhs3.alamat = "alamat c";
        mhs3.kelas = "2E";
        mhs3.tampilBiodata();
    }
}
