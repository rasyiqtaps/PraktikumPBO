public class Keyboard{
    String merk;
    int size;

    public void terhubung() {
        System.out.println("Keyboard " + merk + " milikmu terhubung.");
    }

    public void terputus() {
        System.out.println("Keyboard " + merk + " milikmu terputus");
    }

    public void cetakInfo() {
        System.out.println("---Info Keyboard---");
        System.out.println("Merk: " + merk + " | Size: " + size + " cm");
    }
}
