public class MicMonitor extends Microphone {
    String led;
    boolean isMuted;

    public void toogleMicMuted() {
        if (isMuted = true) {
            System.out.println("mic monitor di mute");
        } else {
            System.out.println("mic monitor siap merekam");
        }
    }

    public void toogleLed() {
        System.out.println("Mic monitor telah terhubung dengan perangkat");
    }
    @Override
    public void cetakInfo() {
        super.cetakInfo();
        System.out.println("Tipe: built-in Monitor | conition: " + led + " | Muted: " + isMuted);
    }
}
