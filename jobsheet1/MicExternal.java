public class MicExternal extends Microphone {
    String status;
    String warna;

    public void on() {
        System.out.println("Microphone " + status);
    }

    public void off() {
        System.out.println("Microphone " + status);
    }

    public void cetakInfo() {
        System.out.println("--- Info Microphone ---");
        System.out.println("status: " + status + " | Warna: " + warna);
    }
}
