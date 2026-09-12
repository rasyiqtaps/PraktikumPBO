public class Monitor {
    String merk;
    int refreshRate;

    public void on() {
        System.out.println("Monitor " + merk + " dihidupkan.");
    }
    public void off() {
        System.out.println("Monitor " + merk + " dimatikan.");
    }

    public void cetakInfo() {
        System.out.println("--- Info Monitor---");
        System.out.println("Merk: " + merk + " | Refresh rate: " + refreshRate + "Hz");
    }
}