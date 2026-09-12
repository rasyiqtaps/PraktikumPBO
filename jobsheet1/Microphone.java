public class Microphone {
    String merk;
    String condition;
    public void rekamSuara() {
        System.out.println("Microphone " + merk + " mulai merekam suara.");
    }
    public void hentikanRekaman() {
        System.out.println("Microphone " + merk + " berhenti merekam.");
    }
    public void cetakInfo() {
        System.out.println("--- Info Microphone ---");
        System.out.println("Merk: " + merk + " | kondisi: " + condition);
    }
}
