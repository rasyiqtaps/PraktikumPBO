public class TugasDemo {
    public static void main(String[] args) {
        Monitor monitorKu = new Monitor();
        monitorKu.merk = "Samsung";
        monitorKu.refreshRate = 144;
        monitorKu.cetakInfo();
        monitorKu.on();
        monitorKu.off();
        System.out.println();

        // 2. Instansiasi Objek Keyboard
        Keyboard keyboardKu = new Keyboard();
        keyboardKu.merk = "REXUS";
        keyboardKu.size = 20;
        keyboardKu.cetakInfo();
        keyboardKu.terhubung();
        keyboardKu.terputus();
        System.out.println();

        // 3. Instansiasi Objek Microphone (Induk)
        Microphone micInduk = new Microphone();
        micInduk.merk = "Generic Audio";
        micInduk.condition = "sempurna";
        micInduk.cetakInfo();
        micInduk.rekamSuara();
        micInduk.hentikanRekaman();
        System.out.println();

        // 4. Instansiasi Objek MicMonitor (Anak)
        MicMonitor micLayar = new MicMonitor();
        micLayar.merk = "Jaguar";
        micLayar.condition = "sempurna";
        micLayar.led = "Aktif";
        micLayar.isMuted = false;
        micLayar.cetakInfo();
        micLayar.toogleLed();
        micLayar.toogleMicMuted();
        System.out.println();

        // 5. Instansiasi Objek MicExternal (Anak)
        MicExternal micMeja = new MicExternal();
        micMeja.merk = "Gorgolyne";
        micMeja.condition = "sempurna";
        micMeja.status = "ready";
        micMeja.warna = "Gold";
        micMeja.cetakInfo();
        micMeja.on();
        micMeja.off();
    }
}
